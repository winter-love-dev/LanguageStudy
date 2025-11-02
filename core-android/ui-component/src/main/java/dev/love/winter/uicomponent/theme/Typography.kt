package dev.love.winter.uicomponent.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import dev.love.winter.designsystem.ActionLarge
import dev.love.winter.designsystem.ActionMedium
import dev.love.winter.designsystem.ActionSmall
import dev.love.winter.designsystem.BodyExtraLarge
import dev.love.winter.designsystem.BodyExtraSmall
import dev.love.winter.designsystem.BodyLarge
import dev.love.winter.designsystem.BodyMedium
import dev.love.winter.designsystem.BodySmall
import dev.love.winter.designsystem.CaptionLarge
import dev.love.winter.designsystem.CaptionMedium
import dev.love.winter.designsystem.CaptionSmall
import dev.love.winter.designsystem.FontLarge
import dev.love.winter.designsystem.FontMedium
import dev.love.winter.designsystem.FontSmall
import dev.love.winter.designsystem.TitleLarge
import dev.love.winter.designsystem.TitleMedium
import dev.love.winter.designsystem.TitleSmall

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
