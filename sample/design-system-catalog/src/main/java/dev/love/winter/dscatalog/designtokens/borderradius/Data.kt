package dev.love.winter.dscatalog.designtokens.borderradius

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import dev.love.winter.dscatalog.R
import dev.love.winter.uicomponent.theme.WinterTheme
import dev.love.winter.sample.common.R as CommonR

class Data

data class UsageInfo(
    @param:DrawableRes val titleRes: Int,
    @param:DrawableRes val imageRes: Int,
    @param:DrawableRes val descriptionRes: Int,
)

data class SpecInfo(
    val token: String,
    val px: String,
    val exampleRadius: Shape? = null,
)

val usageInfoItems = listOf(
    UsageInfo(
        titleRes = CommonR.string.extra_small,
        imageRes = R.drawable.image_border_radius_usage,
        descriptionRes = CommonR.string.extra_small_description,
    ),
    UsageInfo(
        titleRes = CommonR.string.small,
        imageRes = R.drawable.image_border_radius_usage_small,
        descriptionRes = CommonR.string.small_description,
    ),
    UsageInfo(
        titleRes = CommonR.string.medium,
        imageRes = R.drawable.image_border_radius_usage_medium,
        descriptionRes = CommonR.string.medium_description,
    ),
    UsageInfo(
        titleRes = CommonR.string.large,
        imageRes = R.drawable.image_border_radius_usage_large,
        descriptionRes = CommonR.string.large_description,
    ),
    UsageInfo(
        titleRes = CommonR.string.extra_large,
        imageRes = R.drawable.image_border_radius_usage_extra_large,
        descriptionRes = CommonR.string.extra_large_description,
    ),
    UsageInfo(
        titleRes = CommonR.string.pill,
        imageRes = R.drawable.image_border_radius_usage_pill,
        descriptionRes = CommonR.string.pill_description,
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
