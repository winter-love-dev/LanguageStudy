package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import dev.love.winter.designsystem.tokens.BorderRadiusExtraLarge
import dev.love.winter.designsystem.tokens.BorderRadiusExtraSmall
import dev.love.winter.designsystem.tokens.BorderRadiusLarge
import dev.love.winter.designsystem.tokens.BorderRadiusMedium
import dev.love.winter.designsystem.tokens.BorderRadiusPill
import dev.love.winter.designsystem.tokens.BorderRadiusSmall

@Immutable
data class BorderRadius(
    val extraSmall: Shape,
    val small: Shape,
    val medium: Shape,
    val large: Shape,
    val extraLarge: Shape,
    val pill: Shape,
)

internal val BorderRadiusTheme = BorderRadius(
    extraSmall = BorderRadiusExtraSmall,
    small = BorderRadiusSmall,
    medium = BorderRadiusMedium,
    large = BorderRadiusLarge,
    extraLarge = BorderRadiusExtraLarge,
    pill = BorderRadiusPill,
)

internal val LocalBorderRadius = staticCompositionLocalOf {
    BorderRadiusTheme
}
