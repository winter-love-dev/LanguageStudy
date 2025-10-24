package dev.love.winter.designsystem.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/**
 * Border radius tokens
 *
 * Border radius tokens are applied to elements with rounded corners,
 * such as buttons, cards, input fields, and containers, to soften their edges
 * and create a more pleasing appearance.
 *
 * Usage guidelines:
 * - Extra Small: Very subtle rounded corners
 * - Small: Smallest elements or nested components
 * - Medium: Most components, small-to-medium components and containers
 * - Large: Medium-to-large components and containers
 * - Extra Large: Biggest elements, especially on tablet screens
 * - Pill: Components that are completely rounded on their sides
 */

val BorderRadiusExtraSmall = RoundedCornerShape(2.dp)
val BorderRadiusSmall = RoundedCornerShape(4.dp)
val BorderRadiusMedium = RoundedCornerShape(8.dp)
val BorderRadiusLarge = RoundedCornerShape(16.dp)
val BorderRadiusExtraLarge = RoundedCornerShape(24.dp)
val BorderRadiusPill = CircleShape

/**
 * Border radius scheme for the app
 */
@Immutable
data class BorderRadiusScheme(
    val extraSmall: Shape,
    val small: Shape,
    val medium: Shape,
    val large: Shape,
    val extraLarge: Shape,
    val pill: Shape,
)

val BorderRadius = BorderRadiusScheme(
    extraSmall = BorderRadiusExtraSmall,
    small = BorderRadiusSmall,
    medium = BorderRadiusMedium,
    large = BorderRadiusLarge,
    extraLarge = BorderRadiusExtraLarge,
    pill = BorderRadiusPill,
)

val LocalBorderRadius = staticCompositionLocalOf {
    BorderRadius
}
