package dev.love.winter.dscatalog.designtokens.spacing

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.R

private const val ASPECT_COLUMN_RATIO_TOKEN = 0.5f
private const val ASPECT_COLUMN_RATIO_PX = 0.2f
private const val ASPECT_COLUMN_RATIO_EXAMPLE = 0.3f

@Composable
fun SpacingRoute(
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
        item(key = "Spacing") {
            Text(
                text = "Spacing",
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
            Text(
                text = "Spacing tokens guarantee consistent spacing and alignment between elements while providing better readability, clarity, and balance.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Sample image") {
            Box(
                modifier =
                    Modifier
                        .padding(
                            vertical = WinterTheme.spacing.extraLarge,
                        )
                        .fillMaxWidth()
                        .background(color = WinterTheme.color.backgroundContainer)
                        .padding(
                            vertical = WinterTheme.spacing.extraLarge,
                        ),
            ) {
                Image(
                    painter = painterResource(R.drawable.image_spacing),
                    contentDescription = "Spacing sample image",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        item(key = "Tokens") {
            Text(
                text = "Tokens",
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        item(key = "Specs") {
            Column {
                Row(
                    modifier = Modifier
                        .padding(
                            top = WinterTheme.spacing.small,
                        )
                        .fillMaxWidth()
                        .background(color = WinterTheme.color.backgroundContainer)
                        .padding(
                            vertical = WinterTheme.spacing.small,
                            horizontal = WinterTheme.spacing.medium,
                        )
                ) {
                    Text(
                        text = "Token",
                        style = WinterTheme.typography.displaySmall,
                        modifier = Modifier.weight(ASPECT_COLUMN_RATIO_TOKEN),
                    )
                    Text(
                        text = "px",
                        style = WinterTheme.typography.displaySmall,
                        modifier = Modifier.weight(ASPECT_COLUMN_RATIO_PX),
                    )
                    Text(
                        text = "Example",
                        style = WinterTheme.typography.displaySmall,
                        modifier = Modifier.weight(ASPECT_COLUMN_RATIO_EXAMPLE),
                    )
                }
                SpecItem(
                    token = "spacing-XXS",
                    px = "4",
                    exampleSize = WinterTheme.spacing.extraExtraSmall,
                )
                SpecItem(
                    token = "spacing-XS",
                    px = "8",
                    exampleSize = WinterTheme.spacing.extraSmall,
                )
                SpecItem(
                    token = "spacing-SM",
                    px = "16",
                    exampleSize = WinterTheme.spacing.small,
                )
                SpecItem(
                    token = "spacing-MD",
                    px = "24",
                    exampleSize = WinterTheme.spacing.medium,
                )
                SpecItem(
                    token = "spacing-LG",
                    px = "32",
                    exampleSize = WinterTheme.spacing.large,
                )
                SpecItem(
                    token = "spacing-XL",
                    px = "40",
                    exampleSize = WinterTheme.spacing.extraLarge,
                )
                SpecItem(
                    token = "spacing-XXL",
                    px = "48",
                    exampleSize = WinterTheme.spacing.extraExtraLarge,
                    showDivider = false,
                )
            }
        }

        item(key = "Usage title") {
            Text(
                text = "Usage",
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        item(key = "Sample usage image") {
            Box(
                modifier =
                    Modifier
                        .padding(
                            top = WinterTheme.spacing.medium,
                        )
                        .fillMaxWidth()
                        .background(color = WinterTheme.color.backgroundContainer)
                        .padding(
                            vertical = WinterTheme.spacing.extraLarge,
                            horizontal = WinterTheme.spacing.small,
                        ),
            ) {
                Image(
                    painter = painterResource(R.drawable.image_spacing_usage),
                    contentDescription = "Spacing sample image",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        item(key = "Usage desc") {
            Text(
                text = """
                    Use the spacing tokens to organize the content under the correct hierarchy.
                    
                    It's important to group related elements to increase readability.
                    
                    For related items, use smaller spacing values. While between unrelated items, it's better to increase the spacing.
                """.trimIndent(),
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Sample usage image 2") {
            Box(
                modifier =
                    Modifier
                        .padding(
                            top = WinterTheme.spacing.extraExtraLarge,
                        )
                        .fillMaxWidth()
                        .background(color = WinterTheme.color.backgroundContainer)
                        .padding(
                            vertical = WinterTheme.spacing.extraLarge,
                            horizontal = WinterTheme.spacing.small,
                        ),
            ) {
                Image(
                    painter = painterResource(R.drawable.image_spacing_usage_2),
                    contentDescription = "Spacing sample image",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        item(key = "Usage desc 2") {
            Text(
                text = "When stacking components, use the same spacing between all elements in the group.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge),
            )
        }
    }
}

@Composable
private fun SpecItem(
    token: String,
    px: String,
    exampleSize: Dp,
    modifier: Modifier = Modifier,
    showDivider: Boolean = true,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                vertical = WinterTheme.spacing.small,
                horizontal = WinterTheme.spacing.medium,
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .weight(ASPECT_COLUMN_RATIO_TOKEN),

        ) {
            Text(
                text = token,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(WinterTheme.color.tagNeutral)
                    .padding(
                        horizontal = WinterTheme.spacing.small,
                        vertical = WinterTheme.spacing.extraSmall,
                    )
            )
        }
        Text(
            text = px,
            style = WinterTheme.typography.displaySmall,
            modifier = Modifier.weight(ASPECT_COLUMN_RATIO_PX),
        )
        SpacingExample(
            spacing = exampleSize,
            modifier = Modifier.weight(ASPECT_COLUMN_RATIO_EXAMPLE),
        )
    }
    if (showDivider) {
        HorizontalDivider(
            color = WinterTheme.color.strokeNeutral,
            modifier = Modifier.padding(
                horizontal = WinterTheme.spacing.small,
            ),
        )
    }
}

@Composable
private fun SpacingExample(
    spacing: Dp,
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        Row(
            modifier = Modifier
                .size(spacing)
                .background(color = WinterTheme.color.backgroundBrandSubtle),
        ) {
            VerticalDivider(
                color = WinterTheme.color.backgroundBrand,
                modifier = Modifier.fillMaxHeight(),
            )
            Spacer(
                modifier = Modifier.weight(1f),
            )
            VerticalDivider(
                color = WinterTheme.color.backgroundBrand,
                modifier = Modifier.fillMaxHeight(),
            )
        }
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
private fun Preview() {
    WinterTheme {
        Screen()
    }
}
