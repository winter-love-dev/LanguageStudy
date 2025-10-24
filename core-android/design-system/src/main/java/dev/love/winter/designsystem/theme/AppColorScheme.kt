package dev.love.winter.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Component color tokens for the app
 * Contains only component-level tokens (not primitive tokens)
 */
@Immutable
data class AppColorScheme(
    val colorBackground: Color,
    val colorBackgroundContainer: Color,
    val colorBackgroundObject: Color,
    val colorBackgroundModal: Color,
    val colorBackgroundBrand: Color,
    val colorBackgroundBrandSubtle: Color,
    val colorBackgroundPositive: Color,
    val colorBackgroundWarning: Color,
    val colorBackgroundNegative: Color,
    val colorBackgroundContrast: Color,
    val colorBackgroundDisabled: Color,
    val colorBackgroundOverlay: Color,
    val colorStrokeNeutralSubtle: Color,
    val colorStrokeNeutral: Color,
    val colorStrokeNeutralStrong: Color,
    val colorStrokeBrand: Color,
    val colorStrokePositive: Color,
    val colorStrokeWarning: Color,
    val colorStrokeNegative: Color,
)

val LightAppColorScheme = AppColorScheme(
    colorBackground = ColorBackgroundLight,
    colorBackgroundContainer = ColorBackgroundContainerLight,
    colorBackgroundObject = ColorBackgroundObjectLight,
    colorBackgroundModal = ColorBackgroundModalLight,
    colorBackgroundBrand = ColorBackgroundBrandLight,
    colorBackgroundBrandSubtle = ColorBackgroundBrandSubtleLight,
    colorBackgroundPositive = ColorBackgroundPositiveLight,
    colorBackgroundWarning = ColorBackgroundWarningLight,
    colorBackgroundNegative = ColorBackgroundNegativeLight,
    colorBackgroundContrast = ColorBackgroundContrastLight,
    colorBackgroundDisabled = ColorBackgroundDisabledLight,
    colorBackgroundOverlay = ColorBackgroundOverlayLight,
    colorStrokeNeutralSubtle = ColorStrokeNeutralSubtleLight,
    colorStrokeNeutral = ColorStrokeNeutralLight,
    colorStrokeNeutralStrong = ColorStrokeNeutralStrongLight,
    colorStrokeBrand = ColorStrokeBrandLight,
    colorStrokePositive = ColorStrokePositiveLight,
    colorStrokeWarning = ColorStrokeWarningLight,
    colorStrokeNegative = ColorStrokeNegativeLight,
)

val DarkAppColorScheme = AppColorScheme(
    colorBackground = ColorBackgroundDark,
    colorBackgroundContainer = ColorBackgroundContainerDark,
    colorBackgroundObject = ColorBackgroundObjectDark,
    colorBackgroundModal = ColorBackgroundModalDark,
    colorBackgroundBrand = ColorBackgroundBrandDark,
    colorBackgroundBrandSubtle = ColorBackgroundBrandSubtleDark,
    colorBackgroundPositive = ColorBackgroundPositiveDark,
    colorBackgroundWarning = ColorBackgroundWarningDark,
    colorBackgroundNegative = ColorBackgroundNegativeDark,
    colorBackgroundContrast = ColorBackgroundContrastDark,
    colorBackgroundDisabled = ColorBackgroundDisabledDark,
    colorBackgroundOverlay = ColorBackgroundOverlayDark,
    colorStrokeNeutralSubtle = ColorStrokeNeutralSubtleDark,
    colorStrokeNeutral = ColorStrokeNeutralDark,
    colorStrokeNeutralStrong = ColorStrokeNeutralStrongDark,
    colorStrokeBrand = ColorStrokeBrandDark,
    colorStrokePositive = ColorStrokePositiveDark,
    colorStrokeWarning = ColorStrokeWarningDark,
    colorStrokeNegative = ColorStrokeNegativeDark,
)

val LocalAppColorScheme = staticCompositionLocalOf {
    LightAppColorScheme
}