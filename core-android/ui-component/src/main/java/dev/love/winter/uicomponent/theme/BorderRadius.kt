package dev.love.winter.uicomponent.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import dev.love.winter.designsystem.BorderRadiusExtraLarge
import dev.love.winter.designsystem.BorderRadiusExtraSmall
import dev.love.winter.designsystem.BorderRadiusLarge
import dev.love.winter.designsystem.BorderRadiusMedium
import dev.love.winter.designsystem.BorderRadiusPill
import dev.love.winter.designsystem.BorderRadiusSmall

@Immutable
data class BorderRadius(
    val extraSmall: Shape, // 2
    val small: Shape, // 4
    val medium: Shape, // 8
    val large: Shape, // 16
    val extraLarge: Shape, // 24
    val pill: Shape, // CircleShape
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
