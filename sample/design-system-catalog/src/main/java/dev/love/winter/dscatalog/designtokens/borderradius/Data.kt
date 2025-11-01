package dev.love.winter.dscatalog.designtokens.borderradius

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.R

class Data

data class UsageInfo(
    val title: String,
    @param:DrawableRes val imageRes: Int,
    val description: String,
)

data class SpecInfo(
    val token: String,
    val px: String,
    val exampleRadius: Shape? = null,
)

val usageInfoItems = listOf(
    UsageInfo(
        title = "Extra small",
        imageRes = R.drawable.image_border_radius_usage,
        description = "Use Extra small for very subtle rounded corners.",
    ),
    UsageInfo(
        title = "Small",
        imageRes = R.drawable.image_border_radius_usage_small,
        description = "Use Small for the smallest elements or nested components.",
    ),
    UsageInfo(
        title = "Medium",
        imageRes = R.drawable.image_border_radius_usage_medium,
        description = "The Medium variation is used in most components. Use it in small-to-medium components and containers.",
    ),
    UsageInfo(
        title = "Large",
        imageRes = R.drawable.image_border_radius_usage_large,
        description = "Use Large for medium-to-large components and containers.",
    ),
    UsageInfo(
        title = "Extra Large",
        imageRes = R.drawable.image_border_radius_usage_extra_large,
        description = "Use Extra Large for the biggest elements, especially on tablet screens.",
    ),
    UsageInfo(
        title = "Pill",
        imageRes = R.drawable.image_border_radius_usage_pill,
        description = "Use Pill for the components that are completely rounded on their sides.",
    ),
)

@Composable
fun rememberSpecInfoItems(): List<SpecInfo> {
    val extraSmall = WinterTheme.borderRadius.extraSmall
    val small = WinterTheme.borderRadius.small
    val medium = WinterTheme.borderRadius.medium
    val large = WinterTheme.borderRadius.large
    val extraLarge = WinterTheme.borderRadius.extraLarge
    val pill = WinterTheme.borderRadius.pill

    return remember(extraSmall, small, medium, large, extraLarge, pill) {
        listOf(
            SpecInfo("border-radius-XS", "2", extraSmall),
            SpecInfo("border-radius-SM", "4", small),
            SpecInfo("border-radius-MD", "8", medium),
            SpecInfo("border-radius-LG", "16", large),
            SpecInfo("border-radius-XL", "24", extraLarge),
            SpecInfo("border-radius-pill", "height/2", pill),
        )
    }
}
