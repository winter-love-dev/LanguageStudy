package dev.love.winter.dscatalog.designtokens.borderradius

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.R

private const val ASPECT_COLUMN_RATIO_TOKEN = 0.5f
private const val ASPECT_COLUMN_RATIO_PX = 0.3f
private const val ASPECT_COLUMN_RATIO_EXAMPLE = 0.2f

@Composable
fun BorderRadiusRoute(
    modifier: Modifier = Modifier,
) {
    Screen(
        modifier = modifier,
    )
}

@Composable
fun Screen(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            vertical = WinterTheme.spacing.extraExtraLarge,
        ),
    ) {
        item(key = "Title") {
            Text(
                text = "Border radius",
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
            Text(
                text = "Border radius tokens are applied to elements with rounded corners, " +
                        "such as buttons, cards, input fields, and containers, to soften their edges and create a more pleasing appearance.",
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
                    painter = painterResource(R.drawable.image_border_radius_sample),
                    contentDescription = "sample image",
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
                    token = "border-radius-XS",
                    px = "2",
                    exampleRadius = WinterTheme.borderRadius.extraSmall,
                )
                SpecItem(
                    token = "border-radius-SM",
                    px = "4",
                    exampleRadius = WinterTheme.borderRadius.small,
                )
                SpecItem(
                    token = "border-radius-MD",
                    px = "8",
                    exampleRadius = WinterTheme.borderRadius.medium,
                )
                SpecItem(
                    token = "border-radius-LG",
                    px = "16",
                    exampleRadius = WinterTheme.borderRadius.large,
                )
                SpecItem(
                    token = "border-radius-XL",
                    px = "24",
                    exampleRadius = WinterTheme.borderRadius.extraLarge,
                )
                SpecItem(
                    token = "border-radius-pill",
                    px = "height/2",
                    exampleRadius = WinterTheme.borderRadius.pill,
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
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        ///////////////

        item(key = "Usage title - extra small") {
            Text(
                text = "Extra small",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - extra small") {
            Box(
                modifier =
                    Modifier
                        .padding(
                            top = WinterTheme.spacing.small,
                        )
                        .fillMaxWidth()
                        .background(color = WinterTheme.color.backgroundContainer)
                        .padding(
                            vertical = WinterTheme.spacing.extraLarge,
                            horizontal = WinterTheme.spacing.small,
                        ),
            ) {
                Image(
                    painter = painterResource(R.drawable.image_border_radius_usage),
                    contentDescription = "sample image",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        item(key = "Usage desc - extra small") {
            Text(
                text = "Use Extra small for very subtle rounded corners.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        ///////////////

        item(key = "Usage title - small") {
            Text(
                text = "Small",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - small") {
            Image(
                painter = painterResource(R.drawable.image_border_radius_usage_small),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(
                        top = WinterTheme.spacing.small,
                    )
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }

        item(key = "Usage desc - small") {
            Text(
                text = "Use Small for the smallest elements or nested components.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        ///////////////

        item(key = "Usage title - medium") {
            Text(
                text = "Small",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - medium") {
            Image(
                painter = painterResource(R.drawable.image_border_radius_usage_medium),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(
                        top = WinterTheme.spacing.small,
                    )
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }

        item(key = "Usage desc - medium") {
            Text(
                text = "The Medium variation is used in most components. Use it in small-to-medium components and containers.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        ///////////////

        item(key = "Usage title - large") {
            Text(
                text = "large",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - large") {
            Image(
                painter = painterResource(R.drawable.image_border_radius_usage_large),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(
                        top = WinterTheme.spacing.small,
                    )
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }

        item(key = "Usage desc - large") {
            Text(
                text = "Use Large for medium-to-large components and containers.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        ///////////////

        item(key = "Usage title - Extra Large") {
            Text(
                text = "Extra Large",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - Extra Large") {
            Image(
                painter = painterResource(R.drawable.image_border_radius_usage_extra_large),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(
                        top = WinterTheme.spacing.small,
                    )
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }

        item(key = "Usage desc - Extra Large") {
            Text(
                text = "Use Extra Large for the biggest elements, especially on tablet screens.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }

        ///////////////

        item(key = "Usage title - Pill") {
            Text(
                text = "Pill",
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textSubtitle,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }

        item(key = "Usage sample - Pill") {
            Image(
                painter = painterResource(R.drawable.image_border_radius_usage_pill),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(
                        top = WinterTheme.spacing.small,
                    )
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }

        item(key = "Usage desc - Pill") {
            Text(
                text = "Use Pill for the components that are completely rounded on their sides.",
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.small)
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                    .padding(bottom = WinterTheme.spacing.extraExtraLarge)
                ,
            )
        }
    }
}

@Composable
private fun SpecItem(
    token: String,
    px: String,
    exampleRadius: Shape,
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
        Box(
            modifier = modifier
                .height(48.dp)
                .clip(shape = exampleRadius)
                .background(color = WinterTheme.color.backgroundBrandSubtle)
                .border(
                    border = BorderStroke(
                        width = 1.dp,
                        color = WinterTheme.color.strokeBrand,
                    ),
                    shape = exampleRadius,
                )
                .weight(ASPECT_COLUMN_RATIO_EXAMPLE)
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
