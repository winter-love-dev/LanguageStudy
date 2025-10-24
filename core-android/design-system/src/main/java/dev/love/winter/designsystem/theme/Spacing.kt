package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Spacing tokens
 *
 * Spacing tokens guarantee consistent spacing and alignment between elements
 * while providing better readability, clarity, and balance.
 *
 * Usage guidelines:
 * - For related items, use smaller spacing values
 * - For unrelated items, use larger spacing values
 * - When stacking components, use the same spacing between all elements in the group
 */

val SpacingExtraExtraSmall = 4.dp
val SpacingExtraSmall = 8.dp
val SpacingSmall = 16.dp
val SpacingMedium = 24.dp
val SpacingLarge = 32.dp
val SpacingExtraLarge = 40.dp
val SpacingExtraExtraLarge = 48.dp

/**
 * Spacing scheme for the app
 */
@Immutable
data class SpacingScheme(
    val extraExtraSmall: Dp,
    val extraSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val extraLarge: Dp,
    val extraExtraLarge: Dp,
)

val Spacing = SpacingScheme(
    extraExtraSmall = SpacingExtraExtraSmall,
    extraSmall = SpacingExtraSmall,
    small = SpacingSmall,
    medium = SpacingMedium,
    large = SpacingLarge,
    extraLarge = SpacingExtraLarge,
    extraExtraLarge = SpacingExtraExtraLarge,
)

val LocalSpacing = staticCompositionLocalOf {
    Spacing
}