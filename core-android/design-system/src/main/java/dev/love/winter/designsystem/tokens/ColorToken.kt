package dev.love.winter.designsystem.tokens

import androidx.compose.ui.graphics.Color

// Brand - Primary
internal val Primary50 = Color(0xFFF1F1FF)
internal val Primary100 = Color(0xFFDBDFFF)
internal val Primary200 = Color(0xFFC1C8FF)
internal val Primary300 = Color(0xFF9397FF)
internal val Primary400 = Color(0xFF7278FF)
internal val Primary500 = Color(0xFF5653FF)
internal val Primary600 = Color(0xFF4745E4)
internal val Primary700 = Color(0xFF3B39AF)
internal val Primary800 = Color(0xFF2B2A85)
internal val Primary900 = Color(0xFF131243)

// Blue (Use when brand color is no longer blue)
internal val Blue50 = Color(0xFFF1F1FF)
internal val Blue100 = Color(0xFFDBDFFF)
internal val Blue200 = Color(0xFFC1C8FF)
internal val Blue300 = Color(0xFF9397FF)
internal val Blue400 = Color(0xFF7278FF)
internal val Blue500 = Color(0xFF5653FF)
internal val Blue600 = Color(0xFF4745E4)
internal val Blue700 = Color(0xFF3B39AF)
internal val Blue800 = Color(0xFF2B2A85)
internal val Blue900 = Color(0xFF131243)

// Neutral - Grey
internal val Grey50 = Color(0xFFFDFDFD)
internal val Grey100 = Color(0xFFF4F4F5)
internal val Grey200 = Color(0xFFE7E7EA)
internal val Grey300 = Color(0xFFD9D9DC)
internal val Grey400 = Color(0xFFBFC0C9)
internal val Grey500 = Color(0xFF8D8F9B)
internal val Grey600 = Color(0xFF60626C)
internal val Grey700 = Color(0xFF484951)
internal val Grey800 = Color(0xFF313237)
internal val Grey900 = Color(0xFF18181B)

// Semantic - Green
internal val Green50 = Color(0xFFECFAF3)
internal val Green100 = Color(0xFFC3EEDB)
internal val Green200 = Color(0xFFA5E6CA)
internal val Green300 = Color(0xFF7CDAB1)
internal val Green400 = Color(0xFF63D3A2)
internal val Green500 = Color(0xFF3CC88B)
internal val Green600 = Color(0xFF37B67E)
internal val Green700 = Color(0xFF247E57)
internal val Green800 = Color(0xFF115B3A)
internal val Green900 = Color(0xFF0F3122)

// Semantic - Yellow
internal val Yellow50 = Color(0xFFFFF7E9)
internal val Yellow100 = Color(0xFFFFEAC7)
internal val Yellow200 = Color(0xFFFFDA9A)
internal val Yellow300 = Color(0xFFFFCD78)
internal val Yellow400 = Color(0xFFFFBD49)
internal val Yellow500 = Color(0xFFFFAF24)
internal val Yellow600 = Color(0xFFF2A522)
internal val Yellow700 = Color(0xFFC7881A)
internal val Yellow800 = Color(0xFF825911)
internal val Yellow900 = Color(0xFF4A340E)

// Semantic - Red
internal val Red50 = Color(0xFFFCEBEB)
internal val Red100 = Color(0xFFFFD7D7)
internal val Red200 = Color(0xFFF2A1A1)
internal val Red300 = Color(0xFFEC7676)
internal val Red400 = Color(0xFFE85B5B)
internal val Red500 = Color(0xFFE23232)
internal val Red600 = Color(0xFFCE2E2E)
internal val Red700 = Color(0xFFA02424)
internal val Red800 = Color(0xFF6C1A1A)
internal val Red900 = Color(0xFF401111)

/**
 * Component Token - Background (Light Theme)
 */
val BackgroundLight = Grey50
val BackgroundContainerLight = Grey100
val BackgroundObjectLight = Grey200
val BackgroundModalLight = Grey50
val BackgroundBrandLight = Primary500
val BackgroundBrandSubtleLight = Primary50
val BackgroundPositiveLight = Green50
val BackgroundWarningLight = Yellow50
val BackgroundNegativeLight = Red50
val BackgroundContrastLight = Grey900
val BackgroundDisabledLight = Grey100
val BackgroundOverlayLight = Grey900.copy(alpha = 0.5f)

/**
 * Component Token - Background (Dark Theme)
 */
val BackgroundDark = Grey900
val BackgroundContainerDark = Grey800
val BackgroundObjectDark = Grey700
val BackgroundModalDark = Grey800
val BackgroundBrandDark = Primary500
val BackgroundBrandSubtleDark = Primary900
val BackgroundPositiveDark = Green900
val BackgroundWarningDark = Yellow900
val BackgroundNegativeDark = Red900
val BackgroundContrastDark = Grey50
val BackgroundDisabledDark = Grey800
val BackgroundOverlayDark = Grey900.copy(alpha = 0.7f)

/**
 * Component Token - Stroke (Light Theme)
 */
val StrokeNeutralSubtleLight = Grey100
val StrokeNeutralLight = Grey200
val StrokeNeutralStrongLight = Grey300
val StrokeBrandLight = Primary500
val StrokePositiveLight = Green500
val StrokeWarningLight = Yellow500
val StrokeNegativeLight = Red500

/**
 * Component Token - Stroke (Dark Theme)
 */
val StrokeNeutralSubtleDark = Grey800
val StrokeNeutralDark = Grey700
val StrokeNeutralStrongDark = Grey600
val StrokeBrandDark = Primary600
val StrokePositiveDark = Green600
val StrokeWarningDark = Yellow600
val StrokeNegativeDark = Red600

/**
 * Component Token - Text (Light Theme)
 */
val TextTitleLight = Grey900
val TextSubtitleLight = Grey700
val TextBodyLight = Grey800
val TextCaptionLight = Grey600
val TextPlaceholderLight = Grey500
val TextDisabledLight = Grey400
val TextOnColorDarkLight = Grey50
val TextOnColorLightLight = Grey900
val TextOnContrastLight = Grey50
val TextLinkLight = Primary600
val TextBrandLight = Primary500
val TextPositiveLight = Green200
val TextWarningLight = Yellow700
val TextNegativeLight = Red600

/**
 * Component Token - Text (Dark Theme)
 */
val TextTitleDark = Grey50
val TextSubtitleDark = Grey200
val TextBodyDark = Grey100
val TextCaptionDark = Grey300
val TextPlaceholderDark = Grey500
val TextDisabledDark = Grey600
val TextOnColorDarkDark = Grey50
val TextOnColorLightDark = Grey900
val TextOnContrastDark = Grey900
val TextLinkDark = Primary300
val TextBrandDark = Primary500
val TextPositiveDark = Green700
val TextWarningDark = Yellow200
val TextNegativeDark = Red200

/**
 * Component Token - Icon (Light Theme)
 */
val IconNeutralSubtleLight = Grey500
val IconNeutralLight = Grey600
val IconNeutralStrongLight = Grey900
val IconBrandLight = Primary500
val IconPositiveLight = Green600
val IconWarningLight = Yellow600
val IconNegativeLight = Red600
val IconOnColorDarkLight = Grey50
val IconOnColorLightLight = Grey900
val IconOnContrastLight = Grey50
val IconDisabledLight = Grey400

/**
 * Component Token - Icon (Dark Theme)
 */
val IconNeutralSubtleDark = Grey500
val IconNeutralDark = Grey300
val IconNeutralStrongDark = Grey300
val IconBrandDark = Primary500
val IconPositiveDark = Green600
val IconWarningDark = Yellow500
val IconNegativeDark = Red500
val IconOnColorDarkDark = Grey50
val IconOnColorLightDark = Grey900
val IconOnContrastDark = Grey900
val IconDisabledDark = Grey600

/**
 * Component Token - Button (Light Theme)
 */
val ButtonPrimaryDefaultLight = Grey900
val ButtonPrimaryActiveLight = Grey800
val ButtonPrimaryDisabledLight = Grey100
val ButtonSecondaryDefaultLight = Grey300
val ButtonSecondaryActiveLight = Grey400
val ButtonSecondaryDisabledLight = Grey100
val ButtonTertiaryDefaultLight = Grey900
val ButtonTertiaryActiveLight = Grey700
val ButtonTertiaryDisabledLight = Grey400
val ButtonBrandDefaultLight = Primary500
val ButtonBrandActiveLight = Primary600
val ButtonBrandDisabledLight = Grey100
val ButtonCriticalDefaultLight = Red600
val ButtonCriticalActiveLight = Red700
val ButtonCriticalDisabledLight = Grey100

/**
 * Component Token - Button (Dark Theme)
 */
val ButtonPrimaryDefaultDark = Grey50
val ButtonPrimaryActiveDark = Grey200
val ButtonPrimaryDisabledDark = Grey800
val ButtonSecondaryDefaultDark = Grey600
val ButtonSecondaryActiveDark = Grey700
val ButtonSecondaryDisabledDark = Grey800
val ButtonTertiaryDefaultDark = Grey50
val ButtonTertiaryActiveDark = Grey300
val ButtonTertiaryDisabledDark = Grey600
val ButtonBrandDefaultDark = Primary500
val ButtonBrandActiveDark = Primary600
val ButtonBrandDisabledDark = Grey800
val ButtonCriticalDefaultDark = Red600
val ButtonCriticalActiveDark = Red700
val ButtonCriticalDisabledDark = Grey800

/**
 * Component Token - Input (Light Theme)
 */
val InputDefaultLight = Grey300
val InputActiveLight = Grey300
val InputActiveCursorLight = Primary500
val InputSelectedLight = Grey900
val InputPositiveLight = Green500
val InputNegativeLight = Red500
val InputDisabledLight = Grey300

/**
 * Component Token - Input (Dark Theme)
 */
val InputDefaultDark = Grey700
val InputActiveDark = Primary500
val InputActiveCursorDark = Primary200
val InputSelectedDark = Grey50
val InputPositiveDark = Green300
val InputNegativeDark = Red300
val InputDisabledDark = Grey700

/**
 * Component Token - Tag (Light Theme)
 */
val TagNeutralLight = Grey200
val TagBrandStrongLight = Primary500
val TagBrandSubtleLight = Primary100
val TagPositiveLight = Green100
val TagWarningLight = Yellow100
val TagNegativeLight = Red100

/**
 * Component Token - Tag (Dark Theme)
 */
val TagNeutralDark = Grey700
val TagBrandStrongDark = Primary600
val TagBrandSubtleDark = Primary100
val TagPositiveDark = Green100
val TagWarningDark = Yellow100
val TagNegativeDark = Red100
