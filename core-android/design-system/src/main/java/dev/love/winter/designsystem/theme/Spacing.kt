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
    val extraExtraSmall: Dp,
    val extraSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val extraLarge: Dp,
    val extraExtraLarge: Dp,
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
