package dev.love.winter.dscatalog.designtokens.icons

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.designsystem.tokens.IconResource
import dev.love.winter.dscatalog.R
import dev.love.winter.sample.common.R as CommonR

private const val ASPECT_COLUMN_RATIO_TOKEN = 0.65f
private const val ASPECT_COLUMN_RATIO_EXAMPLE = 0.35f

@Composable
fun ColorsRoute(
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
    val iconGroups = rememberIconGroups()
    LazyColumn(
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            vertical = WinterTheme.spacing.extraExtraLarge,
        ),
    ) {
        item(key = "Icons") {
            Text(
                text = stringResource(CommonR.string.icons),
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
            Text(
                text = stringResource(CommonR.string.icons_description),
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }
        item(key = "Creating an icon") {
            Text(
                text = stringResource(CommonR.string.creating_an_icon),
                style = WinterTheme.typography.displaySmall,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
            Text(
                text = stringResource(CommonR.string.creating_an_icon_description),
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.small),
            )
        }
        item(key = "Sample image") {
            Image(
                painter = painterResource(R.drawable.icons_sample),
                contentDescription = "sample image",
                modifier = Modifier
                    .padding(top = WinterTheme.spacing.medium)
                    .fillMaxWidth()
                    .background(color = WinterTheme.color.backgroundContainer)
                    .padding(
                        vertical = WinterTheme.spacing.extraLarge,
                        horizontal = WinterTheme.spacing.small,
                    ),
            )
        }
        item(key = "Tokens") {
            Text(
                text = stringResource(CommonR.string.tokens),
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier
                    .padding(horizontal = WinterTheme.spacing.small)
                    .padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        iconGroups.forEach { iconGroup ->
            item(key = "Header - ${iconGroup.title}") {
                Text(
                    text = iconGroup.title,
                    style = WinterTheme.typography.titleLarge,
                    modifier = Modifier
                        .padding(horizontal = WinterTheme.spacing.small)
                        .padding(top = WinterTheme.spacing.extraLarge),
                )
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
                        text = "Icon",
                        style = WinterTheme.typography.displaySmall,
                        modifier = Modifier.weight(ASPECT_COLUMN_RATIO_EXAMPLE),
                    )
                }
            }
            items(
                items = iconGroup.icons,
                key = { it.token }
            ) { iconInfo ->
                SpecItem(
                    token = iconInfo.token,
                    iconResource = iconInfo.iconResource,
                    showDivider = iconInfo != iconGroup.icons.last(),
                )
            }
        }
        item(key = "Bottom Spacer") {
            Spacer(
                Modifier.height(WinterTheme.spacing.extraExtraLarge),
            )
        }
    }
}

@Composable
private fun SpecItem(
    token: String,
    iconResource: IconResource,
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
        verticalAlignment = Alignment.CenterVertically,
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
        Row(
            modifier = Modifier.weight(ASPECT_COLUMN_RATIO_EXAMPLE),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(iconResource.outlined),
                contentDescription = "outlined image",
                modifier = Modifier.padding(end = WinterTheme.spacing.small),
            )
            Image(
                painter = painterResource(iconResource.filled),
                contentDescription = "filled image",
                modifier = Modifier,
            )
        }
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
