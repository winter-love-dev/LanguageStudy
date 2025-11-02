package dev.love.winter.uicomponent.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import dev.love.winter.designsystem.SpacingExtraExtraLarge
import dev.love.winter.designsystem.SpacingExtraExtraSmall
import dev.love.winter.designsystem.SpacingExtraLarge
import dev.love.winter.designsystem.SpacingExtraSmall
import dev.love.winter.designsystem.SpacingLarge
import dev.love.winter.designsystem.SpacingMedium
import dev.love.winter.designsystem.SpacingSmall

@Immutable
data class Spacing(
    val extraExtraSmall: Dp, // 4
    val extraSmall: Dp, // 8
    val small: Dp, // 16
    val medium: Dp, // 24
    val large: Dp, // 32
    val extraLarge: Dp, // 40
    val extraExtraLarge: Dp, // 48
)

internal val SpacingTheme = Spacing(
    extraExtraSmall = SpacingExtraExtraSmall,
    extraSmall = SpacingExtraSmall,
    small = SpacingSmall,
    medium = SpacingMedium,
    large = SpacingLarge,
    extraLarge = SpacingExtraLarge,
    extraExtraLarge = SpacingExtraExtraLarge,
)

internal val LocalSpacing = staticCompositionLocalOf {
    SpacingTheme
}
