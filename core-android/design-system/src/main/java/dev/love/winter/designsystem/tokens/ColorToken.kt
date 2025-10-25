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
internal val BackgroundLight = Grey50
internal val BackgroundContainerLight = Grey100
internal val BackgroundObjectLight = Grey200
internal val BackgroundModalLight = Grey50
internal val BackgroundBrandLight = Primary500
internal val BackgroundBrandSubtleLight = Primary50
internal val BackgroundPositiveLight = Green50
internal val BackgroundWarningLight = Yellow50
internal val BackgroundNegativeLight = Red50
internal val BackgroundContrastLight = Grey900
internal val BackgroundDisabledLight = Grey100
internal val BackgroundOverlayLight = Grey900.copy(alpha = 0.5f)

/**
 * Component Token - Background (Dark Theme)
 */
internal val BackgroundDark = Grey900
internal val BackgroundContainerDark = Grey800
internal val BackgroundObjectDark = Grey700
internal val BackgroundModalDark = Grey800
internal val BackgroundBrandDark = Primary500
internal val BackgroundBrandSubtleDark = Primary900
internal val BackgroundPositiveDark = Green900
internal val BackgroundWarningDark = Yellow900
internal val BackgroundNegativeDark = Red900
internal val BackgroundContrastDark = Grey50
internal val BackgroundDisabledDark = Grey800
internal val BackgroundOverlayDark = Grey900.copy(alpha = 0.7f)

/**
 * Component Token - Stroke (Light Theme)
 */
internal val StrokeNeutralSubtleLight = Grey100
internal val StrokeNeutralLight = Grey200
internal val StrokeNeutralStrongLight = Grey300
internal val StrokeBrandLight = Primary500
internal val StrokePositiveLight = Green500
internal val StrokeWarningLight = Yellow500
internal val StrokeNegativeLight = Red500

/**
 * Component Token - Stroke (Dark Theme)
 */
internal val StrokeNeutralSubtleDark = Grey800
internal val StrokeNeutralDark = Grey700
internal val StrokeNeutralStrongDark = Grey600
internal val StrokeBrandDark = Primary600
internal val StrokePositiveDark = Green600
internal val StrokeWarningDark = Yellow600
internal val StrokeNegativeDark = Red600

/**
 * Component Token - Text (Light Theme)
 */
internal val TextTitleLight = Grey900
internal val TextSubtitleLight = Grey700
internal val TextBodyLight = Grey800
internal val TextCaptionLight = Grey600
internal val TextPlaceholderLight = Grey500
internal val TextDisabledLight = Grey400
internal val TextOnColorDarkLight = Grey50
internal val TextOnColorLightLight = Grey900
internal val TextOnContrastLight = Grey50
internal val TextLinkLight = Primary600
internal val TextBrandLight = Primary500
internal val TextPositiveLight = Green200
internal val TextWarningLight = Yellow700
internal val TextNegativeLight = Red600

/**
 * Component Token - Text (Dark Theme)
 */
internal val TextTitleDark = Grey50
internal val TextSubtitleDark = Grey200
internal val TextBodyDark = Grey100
internal val TextCaptionDark = Grey300
internal val TextPlaceholderDark = Grey500
internal val TextDisabledDark = Grey600
internal val TextOnColorDarkDark = Grey50
internal val TextOnColorLightDark = Grey900
internal val TextOnContrastDark = Grey900
internal val TextLinkDark = Primary300
internal val TextBrandDark = Primary500
internal val TextPositiveDark = Green700
internal val TextWarningDark = Yellow200
internal val TextNegativeDark = Red200

/**
 * Component Token - Icon (Light Theme)
 */
internal val IconNeutralSubtleLight = Grey500
internal val IconNeutralLight = Grey600
internal val IconNeutralStrongLight = Grey900
internal val IconBrandLight = Primary500
internal val IconPositiveLight = Green600
internal val IconWarningLight = Yellow600
internal val IconNegativeLight = Red600
internal val IconOnColorDarkLight = Grey50
internal val IconOnColorLightLight = Grey900
internal val IconOnContrastLight = Grey50
internal val IconDisabledLight = Grey400

/**
 * Component Token - Icon (Dark Theme)
 */
internal val IconNeutralSubtleDark = Grey500
internal val IconNeutralDark = Grey300
internal val IconNeutralStrongDark = Grey300
internal val IconBrandDark = Primary500
internal val IconPositiveDark = Green600
internal val IconWarningDark = Yellow500
internal val IconNegativeDark = Red500
internal val IconOnColorDarkDark = Grey50
internal val IconOnColorLightDark = Grey900
internal val IconOnContrastDark = Grey900
internal val IconDisabledDark = Grey600

/**
 * Component Token - Button (Light Theme)
 */
internal val ButtonPrimaryDefaultLight = Grey900
internal val ButtonPrimaryActiveLight = Grey800
internal val ButtonPrimaryDisabledLight = Grey100
internal val ButtonSecondaryDefaultLight = Grey600
internal val ButtonSecondaryActiveLight = Grey700
internal val ButtonSecondaryDisabledLight = Grey800
internal val ButtonTertiaryDefaultLight = Grey900
internal val ButtonTertiaryActiveLight = Grey700
internal val ButtonTertiaryDisabledLight = Grey400
internal val ButtonBrandDefaultLight = Primary500
internal val ButtonBrandActiveLight = Primary600
internal val ButtonBrandDisabledLight = Grey100
internal val ButtonCriticalDefaultLight = Red600
internal val ButtonCriticalActiveLight = Red700
internal val ButtonCriticalDisabledLight = Grey100

/**
 * Component Token - Button (Dark Theme)
 */
internal val ButtonPrimaryDefaultDark = Grey50
internal val ButtonPrimaryActiveDark = Grey200
internal val ButtonPrimaryDisabledDark = Grey800
internal val ButtonSecondaryDefaultDark = Grey300
internal val ButtonSecondaryActiveDark = Grey400
internal val ButtonSecondaryDisabledDark = Grey100
internal val ButtonTertiaryDefaultDark = Grey50
internal val ButtonTertiaryActiveDark = Grey300
internal val ButtonTertiaryDisabledDark = Grey600
internal val ButtonBrandDefaultDark = Primary500
internal val ButtonBrandActiveDark = Primary600
internal val ButtonBrandDisabledDark = Grey800
internal val ButtonCriticalDefaultDark = Red600
internal val ButtonCriticalActiveDark = Red700
internal val ButtonCriticalDisabledDark = Grey800

/**
 * Component Token - Input (Light Theme)
 */
internal val InputDefaultLight = Grey300
internal val InputActiveLight = Grey300
internal val InputActiveCursorLight = Primary500
internal val InputSelectedLight = Grey900
internal val InputPositiveLight = Green500
internal val InputNegativeLight = Red500
internal val InputDisabledLight = Grey300

/**
 * Component Token - Input (Dark Theme)
 */
internal val InputDefaultDark = Grey700
internal val InputActiveDark = Primary500
internal val InputActiveCursorDark = Primary200
internal val InputSelectedDark = Grey50
internal val InputPositiveDark = Green300
internal val InputNegativeDark = Red300
internal val InputDisabledDark = Grey700

/**
 * Component Token - Tag (Light Theme)
 */
internal val TagNeutralLight = Grey200
internal val TagBrandStrongLight = Primary500
internal val TagBrandSubtleLight = Primary100
internal val TagPositiveLight = Green100
internal val TagWarningLight = Yellow100
internal val TagNegativeLight = Red100

/**
 * Component Token - Tag (Dark Theme)
 */
internal val TagNeutralDark = Grey700
internal val TagBrandStrongDark = Primary600
internal val TagBrandSubtleDark = Primary100
internal val TagPositiveDark = Green100
internal val TagWarningDark = Yellow100
internal val TagNegativeDark = Red100
