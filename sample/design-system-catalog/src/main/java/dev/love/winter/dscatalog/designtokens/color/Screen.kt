package dev.love.winter.dscatalog.designtokens.color

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.love.winter.sample.common.R
import dev.love.winter.uicomponent.api.ColorToken
import dev.love.winter.uicomponent.api.brandColorTokens
import dev.love.winter.uicomponent.api.greenColorTokens
import dev.love.winter.uicomponent.api.neutralColorTokens
import dev.love.winter.uicomponent.api.redColorTokens
import dev.love.winter.uicomponent.api.yellowColorTokens
import dev.love.winter.uicomponent.component.text.Text
import dev.love.winter.uicomponent.theme.WinterTheme
import kotlinx.collections.immutable.ImmutableList

@Composable
fun ColorRoute(
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
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .background(color = WinterTheme.color.background),
        contentPadding = PaddingValues(
            horizontal = WinterTheme.spacing.small,
            vertical = WinterTheme.spacing.extraExtraLarge,
        ),
        horizontalArrangement = Arrangement.spacedBy(WinterTheme.spacing.small),
        verticalArrangement = Arrangement.spacedBy(WinterTheme.spacing.small),
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
            Text(
                text = stringResource(R.string.color_system),
                style = WinterTheme.typography.displayMedium,
                modifier = Modifier.padding(top = WinterTheme.spacing.extraExtraLarge),
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Divider(
                topSpacing = WinterTheme.spacing.small,
                bottomSpacing = WinterTheme.spacing.extraSmall,
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            SectionHeader(
                title = "Brand",
                subTitle = "Primary",
            )
        }

        items(
            count = brandColorTokens.size,
            key = { index -> "brand-$index" },
        ) { index ->
            Item(
                colorToken = brandColorTokens[index],
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Divider()
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            SectionHeader(
                title = "Neutral",
                subTitle = "Grey",
            )
        }
        items(
            count = neutralColorTokens.size,
            key = { index -> "neutral-$index" },
        ) { index ->
            Item(
                colorToken = neutralColorTokens[index],
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            Divider()
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            SectionHeader(
                title = "Semantic",
                subTitle = "Green",
            )
        }
        items(
            count = greenColorTokens.size,
            key = { index -> "green-$index" },
        ) { index ->
            Item(
                colorToken = greenColorTokens[index],
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            SectionHeader(
                title = "",
                subTitle = "Yellow",
            )
        }
        items(
            count = yellowColorTokens.size,
            key = { index -> "yellow-$index" },
        ) { index ->
            Item(
                colorToken = yellowColorTokens[index],
            )
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            SectionHeader(
                title = "",
                subTitle = "Red",
            )
        }
        items(
            count = redColorTokens.size,
            key = { index -> "red-$index" },
        ) { index ->
            Item(
                colorToken = redColorTokens[index],
            )
        }
    }
}

@Composable
private fun SectionHeader(
    subTitle: String,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(modifier) {
        if (title.isNotBlank()) {
            Text(
                text = title,
                style = WinterTheme.typography.displaySmall,
            )
        }
        Text(
            text = subTitle,
            style = WinterTheme.typography.titleMedium,
            modifier = Modifier.padding(
                top = if (title.isNotBlank()) WinterTheme.spacing.small else 0.dp,
            ),
        )
    }
}

@Composable
private fun Divider(
    topSpacing: Dp = WinterTheme.spacing.large,
    bottomSpacing: Dp = WinterTheme.spacing.medium,
) {
    HorizontalDivider(
        color = WinterTheme.color.strokeNeutral,
        modifier = Modifier.padding(
            top = topSpacing,
            bottom = bottomSpacing,
        )
    )
}

@Composable
private fun ColorList(
    subTitle: String,
    colorTokens: ImmutableList<ColorToken>,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(modifier) {
        if (title.isNotBlank()) {
            Text(
                text = title,
                style = WinterTheme.typography.displaySmall,
            )
        }
        Text(
            text = subTitle,
            style = WinterTheme.typography.titleMedium,
            modifier = Modifier.padding(
                top = WinterTheme.spacing.small,
            )
        )
        FlowRow(
            modifier = Modifier.padding(
                top = WinterTheme.spacing.small,
            ),
            maxItemsInEachRow = 2,
            horizontalArrangement = Arrangement.spacedBy(
                space = WinterTheme.spacing.small,
            ),
            verticalArrangement = Arrangement.spacedBy(
                space = WinterTheme.spacing.small,
            )
        ) {
            colorTokens.forEach {
                Item(
                    colorToken = it,
                    modifier = Modifier
                        .weight(1f),
                )
            }
        }
        if (title.isNotBlank()) {
            Divider()
        }
    }
}

@Composable
private fun Item(
    colorToken: ColorToken,
    modifier: Modifier = Modifier,
) {
    val hexString = remember(colorToken.color) {
        colorToken.color.toHexString()
    }
    val rgbString = remember(colorToken.color) {
        colorToken.color.toRgbString()
    }
    Column(
        modifier = modifier
            .border(
                border = BorderStroke(
                    width = 1.dp,
                    color = WinterTheme.color.strokeNeutral,
                ),
                shape = WinterTheme.borderRadius.large,
            )
            .clip(WinterTheme.borderRadius.large)
            .background(WinterTheme.color.backgroundContainer),
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = colorToken.color),
        )
        Column(
            Modifier
                .fillMaxWidth()
                .padding(WinterTheme.spacing.small),
        ) {
            Text(
                text = colorToken.name,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(WinterTheme.color.tagNeutral)
                    .padding(
                        horizontal = WinterTheme.spacing.small,
                        vertical = WinterTheme.spacing.extraSmall,
                    ),
            )
            Spacer(Modifier.height(WinterTheme.spacing.small))
            Text(
                text = hexString,
                style = WinterTheme.typography.bodySmall,
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(
                        vertical = 4.dp,
                        horizontal = WinterTheme.spacing.extraSmall,
                    ),
            )
            Text(
                text = rgbString,
                style = WinterTheme.typography.bodySmall,
                color = WinterTheme.color.textCaption,
                modifier = Modifier
                    .padding(
                        vertical = 4.dp,
                        horizontal = WinterTheme.spacing.extraSmall,
                    ),
            )
        }
    }
}

private fun Color.toHexString(): String {
    val red = (this.red * 255).toInt()
    val green = (this.green * 255).toInt()
    val blue = (this.blue * 255).toInt()
    return "#%02x%02x%02x".format(red, green, blue)
}

private fun Color.toRgbString(): String {
    val red = (this.red * 255).toInt()
    val green = (this.green * 255).toInt()
    val blue = (this.blue * 255).toInt()
    return "rgb($red, $green, $blue)"
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
fun ItemPreview() {
    WinterTheme {
        Item(
            colorToken = brandColorTokens.first(),
            modifier = Modifier.width(168.dp),
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
fun ScreenPreview() {
    WinterTheme {
        Screen()
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 900,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 900,
)
@Composable
fun BrandPreview() {
    WinterTheme {
        ColorList(
            title = "Brand",
            subTitle = "Primary",
            colorTokens = brandColorTokens,
        )
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 1000,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 1000,
)
@Composable
fun NeutralPreview() {
    WinterTheme {
        ColorList(
            title = "Neutral",
            subTitle = "Grey",
            colorTokens = neutralColorTokens,
        )
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 900,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 900,
)
@Composable
fun SemanticGreenPreview() {
    WinterTheme {
        ColorList(
            title = "Semantic",
            subTitle = "Green",
            colorTokens = greenColorTokens,
        )
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 900,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 900,
)
@Composable
fun SemanticYellowPreview() {
    WinterTheme {
        ColorList(
            subTitle = "Yellow",
            colorTokens = yellowColorTokens,
        )
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 900,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 900,
)
@Composable
fun SemanticRedPreview() {
    WinterTheme {
        ColorList(
            subTitle = "Red",
            colorTokens = redColorTokens,
        )
    }
}
