package dev.love.winter.dscatalog.designtokens.borderradius

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.love.winter.sample.common.R
import dev.love.winter.uicomponent.component.text.Text
import dev.love.winter.uicomponent.theme.WinterTheme

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
    val specInfoItems = rememberSpecInfoItems()
    LazyColumn(
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            vertical = WinterTheme.spacing.extraExtraLarge,
        ),
    ) {
        item(key = "Title") {
            Text(
                text = stringResource(R.string.border_radius),
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
            Text(
                text = stringResource(R.string.border_radius_description),
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
                    painter = painterResource(dev.love.winter.dscatalog.R.drawable.image_border_radius_sample),
                    contentDescription = "sample image",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        item(key = "Tokens") {
            stringResource(R.string.tokens)
            Text(
                text = "Tokens",
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        item(key = "Specs header") {
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
        }

        items(
            items = specInfoItems,
            key = { it.token },
        ) { specInfo ->
            SpecItem(
                token = specInfo.token,
                px = specInfo.px,
                exampleRadius = specInfo.exampleRadius!!,
                showDivider = specInfo != specInfoItems.last(),
            )
        }

        item(key = "Usage title") {
            Text(
                text = stringResource(R.string.usage),
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        usageInfoItems.forEach { usageInfo ->
            item(key = "Usage title - ${usageInfo.titleRes}") {
                Text(
                    text = stringResource(usageInfo.titleRes),
                    style = WinterTheme.typography.titleLarge,
                    color = WinterTheme.color.textSubtitle,
                    modifier = Modifier
                        .padding(horizontal = WinterTheme.spacing.small)
                        .padding(top = WinterTheme.spacing.small),
                )
            }

            item(key = "Usage sample - ${usageInfo.titleRes}") {
                UsageSampleImage(
                    imageRes = usageInfo.imageRes,
                )
            }

            item(key = "Usage desc - ${usageInfo.titleRes}") {
                Text(
                    text = stringResource(usageInfo.descriptionRes),
                    color = WinterTheme.color.textCaption,
                    modifier = Modifier
                        .padding(top = WinterTheme.spacing.small)
                        .padding(horizontal = WinterTheme.spacing.small)
                        .padding(bottom = WinterTheme.spacing.extraExtraLarge),
                )
            }
        }
    }
}

@Composable
private fun UsageSampleImage(
    @DrawableRes imageRes: Int,
) {
    if (imageRes == dev.love.winter.dscatalog.R.drawable.image_border_radius_usage) {
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
                painter = painterResource(imageRes),
                contentDescription = "sample image",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    } else {
        Image(
            painter = painterResource(imageRes),
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
            modifier = Modifier
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
    heightDp = 2000,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 2000,
)
@Composable
private fun Preview() {
    WinterTheme {
        Screen()
    }
}
