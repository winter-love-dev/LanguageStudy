package dev.love.winter.designsystem.theme

import androidx.compose.ui.graphics.Color

/**
 * Color token
 */

// Brand - Primary
val Primary50 = Color(0xFFF1F1FF)
val Primary100 = Color(0xFFDBDFFF)
val Primary200 = Color(0xFFC1C8FF)
val Primary300 = Color(0xFF9397FF)
val Primary400 = Color(0xFF7278FF)
val Primary500 = Color(0xFF5653FF)
val Primary600 = Color(0xFF4745E4)
val Primary700 = Color(0xFF3B39AF)
val Primary800 = Color(0xFF2B2A85)
val Primary900 = Color(0xFF131243)

// Neutral - Grey
val Grey50 = Color(0xFFFDFDFD)
val Grey100 = Color(0xFFF4F4F5)
val Grey200 = Color(0xFFE7E7EA)
val Grey300 = Color(0xFFD9D9DC)
val Grey400 = Color(0xFFBFC0C9)
val Grey500 = Color(0xFF8D8F9B)
val Grey600 = Color(0xFF60626C)
val Grey700 = Color(0xFF484951)
val Grey800 = Color(0xFF313237)
val Grey900 = Color(0xFF18181B)

// Semantic - Green
val Green50 = Color(0xFFECFAF3)
val Green100 = Color(0xFFC3EEDB)
val Green200 = Color(0xFFA5E6CA)
val Green300 = Color(0xFF7CDAB1)
val Green400 = Color(0xFF63D3A2)
val Green500 = Color(0xFF3CC88B)
val Green600 = Color(0xFF37B67E)
val Green700 = Color(0xFF247E57)
val Green800 = Color(0xFF115B3A)
val Green900 = Color(0xFF0F3122)

// Semantic - Yellow
val Yellow50 = Color(0xFFFFF7E9)
val Yellow100 = Color(0xFFFFEAC7)
val Yellow200 = Color(0xFFFFDA9A)
val Yellow300 = Color(0xFFFFCD78)
val Yellow400 = Color(0xFFFFBD49)
val Yellow500 = Color(0xFFFFAF24)
val Yellow600 = Color(0xFFF2A522)
val Yellow700 = Color(0xFFC7881A)
val Yellow800 = Color(0xFF825911)
val Yellow900 = Color(0xFF4A340E)

// Semantic - Red
val Red50 = Color(0xFFFCEBEB)
val Red100 = Color(0xFFFFD7D7)
val Red200 = Color(0xFFF2A1A1)
val Red300 = Color(0xFFEC7676)
val Red400 = Color(0xFFE85B5B)
val Red500 = Color(0xFFE23232)
val Red600 = Color(0xFFCE2E2E)
val Red700 = Color(0xFFA02424)
val Red800 = Color(0xFF6C1A1A)
val Red900 = Color(0xFF401111)

/**
 * Component Token - Background (Light Theme)
 */
val ColorBackgroundLight = Grey50
val ColorBackgroundContainerLight = Grey100
val ColorBackgroundObjectLight = Grey200
val ColorBackgroundModalLight = Grey50
val ColorBackgroundBrandLight = Primary500
val ColorBackgroundBrandSubtleLight = Primary50
val ColorBackgroundPositiveLight = Green50
val ColorBackgroundWarningLight = Yellow50
val ColorBackgroundNegativeLight = Red50
val ColorBackgroundContrastLight = Grey900
val ColorBackgroundDisabledLight = Grey100
val ColorBackgroundOverlayLight = Grey900.copy(alpha = 0.5f)

/**
 * Component Token - Background (Dark Theme)
 */
val ColorBackgroundDark = Grey900
val ColorBackgroundContainerDark = Grey800
val ColorBackgroundObjectDark = Grey700
val ColorBackgroundModalDark = Grey800
val ColorBackgroundBrandDark = Primary500
val ColorBackgroundBrandSubtleDark = Primary900
val ColorBackgroundPositiveDark = Green900
val ColorBackgroundWarningDark = Yellow900
val ColorBackgroundNegativeDark = Red900
val ColorBackgroundContrastDark = Grey50
val ColorBackgroundDisabledDark = Grey800
val ColorBackgroundOverlayDark = Grey900.copy(alpha = 0.7f)

/**
 * Component Token - Stroke (Light Theme)
 */
val ColorStrokeNeutralSubtleLight = Grey100
val ColorStrokeNeutralLight = Grey200
val ColorStrokeNeutralStrongLight = Grey300
val ColorStrokeBrandLight = Primary500
val ColorStrokePositiveLight = Green500
val ColorStrokeWarningLight = Yellow500
val ColorStrokeNegativeLight = Red500

/**
 * Component Token - Stroke (Dark Theme)
 */
val ColorStrokeNeutralSubtleDark = Grey800
val ColorStrokeNeutralDark = Grey700
val ColorStrokeNeutralStrongDark = Grey600
val ColorStrokeBrandDark = Primary600
val ColorStrokePositiveDark = Green600
val ColorStrokeWarningDark = Yellow600
val ColorStrokeNegativeDark = Red600

/**
 * Component Token - Text (Light Theme)
 */
val ColorTextTitleLight = Grey900
val ColorTextSubtitleLight = Grey700
val ColorTextBodyLight = Grey800
val ColorTextCaptionLight = Grey600
val ColorTextPlaceholderLight = Grey500
val ColorTextDisabledLight = Grey400
val ColorTextOnColorDarkLight = Grey50
val ColorTextOnColorLightLight = Grey900
val ColorTextOnContrastLight = Grey50
val ColorTextLinkLight = Primary600
val ColorTextBrandLight = Primary500
val ColorTextPositiveLight = Green200
val ColorTextWarningLight = Yellow700
val ColorTextNegativeLight = Red600

/**
 * Component Token - Text (Dark Theme)
 */
val ColorTextTitleDark = Grey50
val ColorTextSubtitleDark = Grey200
val ColorTextBodyDark = Grey100
val ColorTextCaptionDark = Grey300
val ColorTextPlaceholderDark = Grey500
val ColorTextDisabledDark = Grey600
val ColorTextOnColorDarkDark = Grey50
val ColorTextOnColorLightDark = Grey900
val ColorTextOnContrastDark = Grey900
val ColorTextLinkDark = Primary300
val ColorTextBrandDark = Primary500
val ColorTextPositiveDark = Green700
val ColorTextWarningDark = Yellow200
val ColorTextNegativeDark = Red200

/**
 * Component Token - Icon (Light Theme)
 */
val ColorIconNeutralSubtleLight = Grey500
val ColorIconNeutralLight = Grey600
val ColorIconNeutralStrongLight = Grey900
val ColorIconBrandLight = Primary500
val ColorIconPositiveLight = Green600
val ColorIconWarningLight = Yellow600
val ColorIconNegativeLight = Red600
val ColorIconOnColorDarkLight = Grey50
val ColorIconOnColorLightLight = Grey900
val ColorIconOnContrastLight = Grey50
val ColorIconDisabledLight = Grey400

/**
 * Component Token - Icon (Dark Theme)
 */
val ColorIconNeutralSubtleDark = Grey500
val ColorIconNeutralDark = Grey300
val ColorIconNeutralStrongDark = Grey300
val ColorIconBrandDark = Primary500
val ColorIconPositiveDark = Green600
val ColorIconWarningDark = Yellow500
val ColorIconNegativeDark = Red500
val ColorIconOnColorDarkDark = Grey50
val ColorIconOnColorLightDark = Grey900
val ColorIconOnContrastDark = Grey900
val ColorIconDisabledDark = Grey600