package dev.love.winter.dscatalog.designtokens.typography

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import dev.love.winter.designsystem.component.text.CaptionText
import dev.love.winter.designsystem.theme.WinterTheme

@Composable
fun TypographyRoute(
    modifier: Modifier = Modifier,
) {
    Screen(
        modifier = modifier,
    )
}

@Composable
private fun Screen(
    modifier: Modifier = Modifier,
) {
    val items = remember {
        buildList {
            add(
                TypographyListItem.Header(
                    title = "Display",
                    description = "Use the display font style for large headings or prominent text that requires emphasis. Display is ideal for grabbing the user's attention and making a bold statement. Avoid using this style for long texts.",
                )
            )
            typographyItems.forEach {
                add(TypographyListItem.Item(it))
            }
            add(
                TypographyListItem.Header(
                    title = "Title",
                    description = "Use the title font style when you need a clear visual hierarchy without overwhelming the layout. You can apply this style in short texts that need to stand out when compared to body text, like section titles, card titles, page titles, etc.",
                )
            )
            typographyTitleItems.forEach {
                add(TypographyListItem.Item(it))
            }
            add(
                TypographyListItem.Header(
                    title = "Body",
                    description = "The body font style is ideal for regular text content, such as paragraphs, or descriptions. The body styles are suitable both for long and short text, where readability and legibility are essential.",
                )
            )
            typographyBodyItems.forEach {
                add(TypographyListItem.Item(it))
            }
            add(
                TypographyListItem.Header(
                    title = "Action",
                    description = "The action font style is suitable for text elements that represent interactive or actionable items, such as buttons, input, and links. Use it to distinguish interactive elements from regular text.",
                )
            )
            typographyActionItems.forEach {
                add(TypographyListItem.Item(it))
            }
            add(
                TypographyListItem.Header(
                    title = "Caption",
                    description = "The caption font style is used for supporting text that provides context and complements visual elements, like icons, images, tags, etc. Avoid using this style in long texts.",
                )
            )
            typographyCaptionItems.forEach {
                add(TypographyListItem.Item(it))
            }
        }
    }

    LazyColumn(
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            bottom = WinterTheme.spacing.extraExtraLarge,
        ),
    ) {
        items(
            items = items,
            key = { item ->
                when (item) {
                    is TypographyListItem.Header -> item.title
                    is TypographyListItem.Item -> item.data.tokenName
                }
            },
            contentType = { item ->
                when (item) {
                    is TypographyListItem.Header -> "Header"
                    is TypographyListItem.Item -> "Item"
                }
            },
        ) { item ->
            when (item) {
                is TypographyListItem.Header -> {
                    SectionHeader(
                        title = item.title,
                        description = item.description,
                    )
                }

                is TypographyListItem.Item -> {
                    TypographyItem(
                        data = item.data,
                    )
                }
            }
        }
    }
}

@Composable
private fun TypographyItem(
    data: TypographyItemData,
    modifier: Modifier = Modifier,
) {
    val textStyle = getTypographyStyle(data.tokenName)
    val isCaption = data.tokenName.startsWith("font-caption")

    Column(modifier) {
        Text(
            text = "Tokens",
            style = WinterTheme.typography.displaySmall,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .padding(top = WinterTheme.spacing.extraLarge)
                .fillMaxWidth()
                .background(color = WinterTheme.color.backgroundContainer)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.medium,
                ),
        )
        Text(
            text = data.tokenName,
            style = WinterTheme.typography.bodyMedium,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .padding(all = WinterTheme.spacing.medium)
                .clip(CircleShape)
                .background(WinterTheme.color.tagNeutral)
                .padding(
                    horizontal = WinterTheme.spacing.small,
                    vertical = WinterTheme.spacing.extraSmall,
                ),
        )
        Text(
            text = "Specs",
            style = WinterTheme.typography.displaySmall,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = WinterTheme.color.backgroundContainer)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.medium,
                ),
        )
        SpecItem(
            leadingLabel = "Size",
            trailingLabel = data.size,
        )
        SpecItem(
            leadingLabel = "Line height",
            trailingLabel = data.lineHeight,
        )
        SpecItem(
            leadingLabel = "Weight",
            trailingLabel = data.weight,
            visibleDivider = data.case != null || data.letterSpacing != null,
        )
        data.case?.let { case ->
            SpecItem(
                leadingLabel = "Case",
                trailingLabel = case,
                visibleDivider = data.letterSpacing != null,
            )
        }
        data.letterSpacing?.let { letterSpacing ->
            SpecItem(
                leadingLabel = "Letter spacing",
                trailingLabel = letterSpacing,
                visibleDivider = false,
            )
        }
        Text(
            text = "Example",
            style = WinterTheme.typography.displaySmall,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = WinterTheme.color.backgroundContainer)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.medium,
                ),
        )
        if (isCaption) {
            CaptionText(
                text = "Lorem ipsum dolor sit amet",
                style = textStyle,
                color = WinterTheme.color.textBody,
                modifier = Modifier
                    .padding(
                        vertical = WinterTheme.spacing.small,
                        horizontal = WinterTheme.spacing.extraExtraLarge,
                    ),
            )
        } else {
            Text(
                text = "Lorem ipsum dolor sit amet",
                style = textStyle,
                color = WinterTheme.color.textBody,
                modifier = Modifier
                    .padding(
                        vertical = WinterTheme.spacing.small,
                        horizontal = WinterTheme.spacing.extraLarge,
                    ),
            )
        }
    }
}

@Composable
private fun SectionHeader(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        CaptionText(
            text = "Typography",
            style = WinterTheme.typography.captionMedium,
            color = WinterTheme.color.textCaption,
            modifier = Modifier
                .padding(horizontal = WinterTheme.spacing.small)
                .padding(
                    top = WinterTheme.spacing.extraExtraLarge,
                    bottom = WinterTheme.spacing.small,
                )
                .padding(top = WinterTheme.spacing.extraExtraLarge)
        )
        Text(
            text = title,
            style = WinterTheme.typography.displayMedium,
            color = WinterTheme.color.textTitle,
            modifier = Modifier
                .padding(horizontal = WinterTheme.spacing.small),
        )
        Text(
            text = description,
            style = WinterTheme.typography.bodyMedium,
            color = WinterTheme.color.textCaption,
            modifier = Modifier.padding(
                vertical = WinterTheme.spacing.small,
                horizontal = WinterTheme.spacing.small,
            ),
        )
    }
}

@Composable
private fun SpecItem(
    leadingLabel: String,
    trailingLabel: String,
    modifier: Modifier = Modifier,
    visibleDivider: Boolean = true,
) {
    Row(
        modifier = modifier
    ) {
        Text(
            text = leadingLabel,
            style = WinterTheme.typography.bodyMedium,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .weight(1f)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.extraExtraLarge,
                ),
        )
        Text(
            text = trailingLabel,
            style = WinterTheme.typography.bodyMedium,
            color = WinterTheme.color.textBody,
            modifier = Modifier
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.extraExtraLarge,
                ),
        )
    }
    if (visibleDivider) {
        HorizontalDivider(
            color = WinterTheme.color.strokeNeutral,
            modifier = Modifier.padding(
                horizontal = WinterTheme.spacing.extraLarge,
            )
        )
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun Preview() {
    WinterTheme {
        Screen()
    }
}
