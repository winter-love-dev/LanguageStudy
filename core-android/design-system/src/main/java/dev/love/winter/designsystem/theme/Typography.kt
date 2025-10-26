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
