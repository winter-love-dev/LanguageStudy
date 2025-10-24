package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Typography tokens
 *
 * Use the display font style for large headings or prominent text that requires emphasis.
 * Display is ideal for grabbing the user's attention and making a bold statement. Avoid using this style for long texts.
 */

val FontLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 28.sp,
    lineHeight = 34.sp,
)

val FontMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 24.sp,
    lineHeight = 30.sp,
)

val FontSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 18.sp,
    lineHeight = 24.sp,
)

/**
 * Title tokens
 *
 * Use the title font style when you need a clear visual hierarchy without overwhelming the layout.
 * You can apply this style in short texts that need to stand out when compared to body text,
 * like section titles, card titles, page titles, etc.
 */
val TitleLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
    lineHeight = 22.sp,
)

val TitleMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
)

val TitleSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
)

/**
 * Body tokens
 *
 * The body font style is ideal for regular text content, such as paragraphs, or descriptions.
 * The body styles are suitable both for long and short text, where readability and legibility are essential.
 */
val BodyExtraLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 18.sp,
    lineHeight = 24.sp,
)

val BodyLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 22.sp,
)

val BodyMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    lineHeight = 18.sp,
)

val BodySmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 16.sp,
)

val BodyExtraSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp,
    lineHeight = 14.sp,
)

/**
 * Action tokens
 *
 * The action font style is suitable for text elements that represent interactive or actionable items,
 * such as buttons, input, and links. Use it to distinguish interactive elements from regular text.
 */
val ActionLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
    lineHeight = 20.sp,
)

val ActionMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
)

val ActionSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.SemiBold,
    fontSize = 12.sp,
    lineHeight = 16.sp,
)

/**
 * Caption tokens
 *
 * The caption font style is used for supporting text that provides context and complements visual elements,
 * like icons, images, tags, etc. Avoid using this style in long texts.
 *
 * Note: Use .uppercase() modifier on Text to apply all caps style.
 */
val CaptionLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    letterSpacing = 0.56.sp,
)

val CaptionMedium = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.48.sp,
)

val CaptionSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp,
    lineHeight = 14.sp,
    letterSpacing = 0.4.sp,
)

/**
 * Scheme
 */
@Immutable
data class TypographyScheme(
    val displayLarge: TextStyle,
    val displayMedium: TextStyle,
    val displaySmall: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val bodyExtraLarge: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val bodyExtraSmall: TextStyle,
    val actionLarge: TextStyle,
    val actionMedium: TextStyle,
    val actionSmall: TextStyle,
    val captionLarge: TextStyle,
    val captionMedium: TextStyle,
    val captionSmall: TextStyle,
)

val Typography = TypographyScheme(
    displayLarge = FontLarge,
    displayMedium = FontMedium,
    displaySmall = FontSmall,
    titleLarge = TitleLarge,
    titleMedium = TitleMedium,
    titleSmall = TitleSmall,
    bodyExtraLarge = BodyExtraLarge,
    bodyLarge = BodyLarge,
    bodyMedium = BodyMedium,
    bodySmall = BodySmall,
    bodyExtraSmall = BodyExtraSmall,
    actionLarge = ActionLarge,
    actionMedium = ActionMedium,
    actionSmall = ActionSmall,
    captionLarge = CaptionLarge,
    captionMedium = CaptionMedium,
    captionSmall = CaptionSmall,
)

val LocalTypography = staticCompositionLocalOf {
    Typography
}
