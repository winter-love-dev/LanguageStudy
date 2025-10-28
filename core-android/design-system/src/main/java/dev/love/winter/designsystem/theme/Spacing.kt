package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import dev.love.winter.designsystem.tokens.SpacingExtraExtraLarge
import dev.love.winter.designsystem.tokens.SpacingExtraExtraSmall
import dev.love.winter.designsystem.tokens.SpacingExtraLarge
import dev.love.winter.designsystem.tokens.SpacingExtraSmall
import dev.love.winter.designsystem.tokens.SpacingLarge
import dev.love.winter.designsystem.tokens.SpacingMedium
import dev.love.winter.designsystem.tokens.SpacingSmall

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
