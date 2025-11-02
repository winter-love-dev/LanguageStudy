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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.sample.common.R as CommonR

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
    LazyColumn(
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            bottom = WinterTheme.spacing.extraExtraLarge,
        ),
    ) {
        item(key = "display-header") {
            SectionHeader(
                title = stringResource(CommonR.string.display),
                description = stringResource(CommonR.string.display_description),
                modifier = Modifier.padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }
        items(
            items = typographyItems,
            key = { it.tokenName },
        ) { item ->
            TypographyItem(data = item)
        }

        item(key = "title-header") {
            SectionHeader(
                title = stringResource(CommonR.string.title),
                description = stringResource(CommonR.string.title_description),
            )
        }
        items(
            items = typographyTitleItems,
            key = { it.tokenName },
        ) { item ->
            TypographyItem(data = item)
        }

        item(key = "body-header") {
            SectionHeader(
                title = stringResource(CommonR.string.body),
                description = stringResource(CommonR.string.body_description),
            )
        }
        items(
            items = typographyBodyItems,
            key = { it.tokenName },
        ) { item ->
            TypographyItem(data = item)
        }

        item(key = "action-header") {
            SectionHeader(
                title = stringResource(CommonR.string.action),
                description = stringResource(CommonR.string.action_description),
            )
        }
        items(
            items = typographyActionItems,
            key = { it.tokenName },
        ) { item ->
            TypographyItem(data = item)
        }

        item(key = "caption-header") {
            SectionHeader(
                title = stringResource(CommonR.string.caption),
                description = stringResource(CommonR.string.caption_description),
            )
        }
        items(
            items = typographyCaptionItems,
            key = { it.tokenName },
        ) { item ->
            TypographyItem(data = item)
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
            modifier = Modifier
                .fillMaxWidth()
                .background(color = WinterTheme.color.backgroundContainer)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.medium,
                ),
        )
        Text(
            text = "Lorem ipsum dolor sit amet",
            style = textStyle,
            modifier = Modifier
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = if (isCaption) {
                        WinterTheme.spacing.extraExtraLarge
                    } else {
                        WinterTheme.spacing.extraLarge
                    },
                ),
        )
    }
}

@Composable
private fun SectionHeader(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        Text(
            text = "Typography",
            style = WinterTheme.typography.captionMedium,
            color = WinterTheme.color.textCaption,
            modifier = Modifier
                .padding(horizontal = WinterTheme.spacing.small)
                .padding(
                    top = WinterTheme.spacing.extraExtraLarge,
                    bottom = WinterTheme.spacing.small,
                )
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
            modifier = Modifier
                .weight(1f)
                .padding(
                    vertical = WinterTheme.spacing.small,
                    horizontal = WinterTheme.spacing.extraExtraLarge,
                ),
        )
        Text(
            text = trailingLabel,
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
    heightDp = 2000,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 2000,
)
@Composable
fun Preview() {
    WinterTheme {
        Screen()
    }
}
