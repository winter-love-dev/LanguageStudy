package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import dev.love.winter.designsystem.tokens.ActionLarge
import dev.love.winter.designsystem.tokens.ActionMedium
import dev.love.winter.designsystem.tokens.ActionSmall
import dev.love.winter.designsystem.tokens.BodyExtraLarge
import dev.love.winter.designsystem.tokens.BodyExtraSmall
import dev.love.winter.designsystem.tokens.BodyLarge
import dev.love.winter.designsystem.tokens.BodyMedium
import dev.love.winter.designsystem.tokens.BodySmall
import dev.love.winter.designsystem.tokens.CaptionLarge
import dev.love.winter.designsystem.tokens.CaptionMedium
import dev.love.winter.designsystem.tokens.CaptionSmall
import dev.love.winter.designsystem.tokens.FontLarge
import dev.love.winter.designsystem.tokens.FontMedium
import dev.love.winter.designsystem.tokens.FontSmall
import dev.love.winter.designsystem.tokens.TitleLarge
import dev.love.winter.designsystem.tokens.TitleMedium
import dev.love.winter.designsystem.tokens.TitleSmall

@Immutable
data class Typography(
    val displayLarge: TextStyle, // 28
    val displayMedium: TextStyle, // 24
    val displaySmall: TextStyle, // 18
    val titleLarge: TextStyle, // 16
    val titleMedium: TextStyle, // 14
    val titleSmall: TextStyle, // 12
    val bodyExtraLarge: TextStyle, // 18
    val bodyLarge: TextStyle, // 16
    val bodyMedium: TextStyle, // 14
    val bodySmall: TextStyle, // 12
    val bodyExtraSmall: TextStyle, // 10
    val actionLarge: TextStyle, // 16
    val actionMedium: TextStyle, // 14
    val actionSmall: TextStyle, // 12
    val captionLarge: TextStyle, // 14
    val captionMedium: TextStyle, // 12
    val captionSmall: TextStyle, // 10
)

internal val TypographyTheme = Typography(
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

internal val LocalTypography = staticCompositionLocalOf {
    TypographyTheme
}
