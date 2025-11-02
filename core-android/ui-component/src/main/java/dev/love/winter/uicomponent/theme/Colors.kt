package dev.love.winter.uicomponent.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import dev.love.winter.designsystem.BackgroundBrandDark
import dev.love.winter.designsystem.BackgroundBrandLight
import dev.love.winter.designsystem.BackgroundBrandSubtleDark
import dev.love.winter.designsystem.BackgroundBrandSubtleLight
import dev.love.winter.designsystem.BackgroundContainerDark
import dev.love.winter.designsystem.BackgroundContainerLight
import dev.love.winter.designsystem.BackgroundContrastDark
import dev.love.winter.designsystem.BackgroundContrastLight
import dev.love.winter.designsystem.BackgroundDark
import dev.love.winter.designsystem.BackgroundDisabledDark
import dev.love.winter.designsystem.BackgroundDisabledLight
import dev.love.winter.designsystem.BackgroundLight
import dev.love.winter.designsystem.BackgroundModalDark
import dev.love.winter.designsystem.BackgroundModalLight
import dev.love.winter.designsystem.BackgroundNegativeDark
import dev.love.winter.designsystem.BackgroundNegativeLight
import dev.love.winter.designsystem.BackgroundObjectDark
import dev.love.winter.designsystem.BackgroundObjectLight
import dev.love.winter.designsystem.BackgroundOverlayDark
import dev.love.winter.designsystem.BackgroundOverlayLight
import dev.love.winter.designsystem.BackgroundPositiveDark
import dev.love.winter.designsystem.BackgroundPositiveLight
import dev.love.winter.designsystem.BackgroundWarningDark
import dev.love.winter.designsystem.BackgroundWarningLight
import dev.love.winter.designsystem.ButtonBrandActiveDark
import dev.love.winter.designsystem.ButtonBrandActiveLight
import dev.love.winter.designsystem.ButtonBrandDefaultDark
import dev.love.winter.designsystem.ButtonBrandDefaultLight
import dev.love.winter.designsystem.ButtonBrandDisabledDark
import dev.love.winter.designsystem.ButtonBrandDisabledLight
import dev.love.winter.designsystem.ButtonCriticalActiveDark
import dev.love.winter.designsystem.ButtonCriticalActiveLight
import dev.love.winter.designsystem.ButtonCriticalDefaultDark
import dev.love.winter.designsystem.ButtonCriticalDefaultLight
import dev.love.winter.designsystem.ButtonCriticalDisabledDark
import dev.love.winter.designsystem.ButtonCriticalDisabledLight
import dev.love.winter.designsystem.ButtonPrimaryActiveDark
import dev.love.winter.designsystem.ButtonPrimaryActiveLight
import dev.love.winter.designsystem.ButtonPrimaryDefaultDark
import dev.love.winter.designsystem.ButtonPrimaryDefaultLight
import dev.love.winter.designsystem.ButtonPrimaryDisabledDark
import dev.love.winter.designsystem.ButtonPrimaryDisabledLight
import dev.love.winter.designsystem.ButtonSecondaryActiveDark
import dev.love.winter.designsystem.ButtonSecondaryActiveLight
import dev.love.winter.designsystem.ButtonSecondaryDefaultDark
import dev.love.winter.designsystem.ButtonSecondaryDefaultLight
import dev.love.winter.designsystem.ButtonSecondaryDisabledDark
import dev.love.winter.designsystem.ButtonSecondaryDisabledLight
import dev.love.winter.designsystem.ButtonTertiaryActiveDark
import dev.love.winter.designsystem.ButtonTertiaryActiveLight
import dev.love.winter.designsystem.ButtonTertiaryDefaultDark
import dev.love.winter.designsystem.ButtonTertiaryDefaultLight
import dev.love.winter.designsystem.ButtonTertiaryDisabledDark
import dev.love.winter.designsystem.ButtonTertiaryDisabledLight
import dev.love.winter.designsystem.Green100
import dev.love.winter.designsystem.Green400
import dev.love.winter.designsystem.Green600
import dev.love.winter.designsystem.Green800
import dev.love.winter.designsystem.Green900
import dev.love.winter.designsystem.Grey100
import dev.love.winter.designsystem.Grey200
import dev.love.winter.designsystem.Grey300
import dev.love.winter.designsystem.Grey400
import dev.love.winter.designsystem.Grey50
import dev.love.winter.designsystem.Grey600
import dev.love.winter.designsystem.Grey700
import dev.love.winter.designsystem.Grey800
import dev.love.winter.designsystem.Grey900
import dev.love.winter.designsystem.IconBrandDark
import dev.love.winter.designsystem.IconBrandLight
import dev.love.winter.designsystem.IconDisabledDark
import dev.love.winter.designsystem.IconDisabledLight
import dev.love.winter.designsystem.IconNegativeDark
import dev.love.winter.designsystem.IconNegativeLight
import dev.love.winter.designsystem.IconNeutralDark
import dev.love.winter.designsystem.IconNeutralLight
import dev.love.winter.designsystem.IconNeutralStrongDark
import dev.love.winter.designsystem.IconNeutralStrongLight
import dev.love.winter.designsystem.IconNeutralSubtleDark
import dev.love.winter.designsystem.IconNeutralSubtleLight
import dev.love.winter.designsystem.IconOnColorDarkDark
import dev.love.winter.designsystem.IconOnColorDarkLight
import dev.love.winter.designsystem.IconOnColorLightDark
import dev.love.winter.designsystem.IconOnColorLightLight
import dev.love.winter.designsystem.IconOnContrastDark
import dev.love.winter.designsystem.IconOnContrastLight
import dev.love.winter.designsystem.IconPositiveDark
import dev.love.winter.designsystem.IconPositiveLight
import dev.love.winter.designsystem.IconWarningDark
import dev.love.winter.designsystem.IconWarningLight
import dev.love.winter.designsystem.InputActiveCursorDark
import dev.love.winter.designsystem.InputActiveCursorLight
import dev.love.winter.designsystem.InputActiveDark
import dev.love.winter.designsystem.InputActiveLight
import dev.love.winter.designsystem.InputDefaultDark
import dev.love.winter.designsystem.InputDefaultLight
import dev.love.winter.designsystem.InputDisabledDark
import dev.love.winter.designsystem.InputDisabledLight
import dev.love.winter.designsystem.InputNegativeDark
import dev.love.winter.designsystem.InputNegativeLight
import dev.love.winter.designsystem.InputPositiveDark
import dev.love.winter.designsystem.InputPositiveLight
import dev.love.winter.designsystem.InputSelectedDark
import dev.love.winter.designsystem.InputSelectedLight
import dev.love.winter.designsystem.Primary100
import dev.love.winter.designsystem.Primary400
import dev.love.winter.designsystem.Primary500
import dev.love.winter.designsystem.Primary800
import dev.love.winter.designsystem.Primary900
import dev.love.winter.designsystem.Red100
import dev.love.winter.designsystem.Red400
import dev.love.winter.designsystem.Red500
import dev.love.winter.designsystem.Red800
import dev.love.winter.designsystem.Red900
import dev.love.winter.designsystem.StrokeBrandDark
import dev.love.winter.designsystem.StrokeBrandLight
import dev.love.winter.designsystem.StrokeNegativeDark
import dev.love.winter.designsystem.StrokeNegativeLight
import dev.love.winter.designsystem.StrokeNeutralDark
import dev.love.winter.designsystem.StrokeNeutralLight
import dev.love.winter.designsystem.StrokeNeutralStrongDark
import dev.love.winter.designsystem.StrokeNeutralStrongLight
import dev.love.winter.designsystem.StrokeNeutralSubtleDark
import dev.love.winter.designsystem.StrokeNeutralSubtleLight
import dev.love.winter.designsystem.StrokePositiveDark
import dev.love.winter.designsystem.StrokePositiveLight
import dev.love.winter.designsystem.StrokeWarningDark
import dev.love.winter.designsystem.StrokeWarningLight
import dev.love.winter.designsystem.TagBrandStrongDark
import dev.love.winter.designsystem.TagBrandStrongLight
import dev.love.winter.designsystem.TagBrandSubtleDark
import dev.love.winter.designsystem.TagBrandSubtleLight
import dev.love.winter.designsystem.TagNegativeDark
import dev.love.winter.designsystem.TagNegativeLight
import dev.love.winter.designsystem.TagNeutralDark
import dev.love.winter.designsystem.TagNeutralLight
import dev.love.winter.designsystem.TagPositiveDark
import dev.love.winter.designsystem.TagPositiveLight
import dev.love.winter.designsystem.TagWarningDark
import dev.love.winter.designsystem.TagWarningLight
import dev.love.winter.designsystem.TextBodyDark
import dev.love.winter.designsystem.TextBodyLight
import dev.love.winter.designsystem.TextBrandDark
import dev.love.winter.designsystem.TextBrandLight
import dev.love.winter.designsystem.TextCaptionDark
import dev.love.winter.designsystem.TextCaptionLight
import dev.love.winter.designsystem.TextDisabledDark
import dev.love.winter.designsystem.TextDisabledLight
import dev.love.winter.designsystem.TextLinkDark
import dev.love.winter.designsystem.TextLinkLight
import dev.love.winter.designsystem.TextNegativeDark
import dev.love.winter.designsystem.TextNegativeLight
import dev.love.winter.designsystem.TextOnColorDarkDark
import dev.love.winter.designsystem.TextOnColorDarkLight
import dev.love.winter.designsystem.TextOnColorLightDark
import dev.love.winter.designsystem.TextOnColorLightLight
import dev.love.winter.designsystem.TextOnContrastDark
import dev.love.winter.designsystem.TextOnContrastLight
import dev.love.winter.designsystem.TextPlaceholderDark
import dev.love.winter.designsystem.TextPlaceholderLight
import dev.love.winter.designsystem.TextPositiveDark
import dev.love.winter.designsystem.TextPositiveLight
import dev.love.winter.designsystem.TextSubtitleDark
import dev.love.winter.designsystem.TextSubtitleLight
import dev.love.winter.designsystem.TextTitleDark
import dev.love.winter.designsystem.TextTitleLight
import dev.love.winter.designsystem.TextWarningDark
import dev.love.winter.designsystem.TextWarningLight

@Immutable
data class Colors(
    val background: Color,
    val backgroundContainer: Color,
    val backgroundObject: Color,
    val backgroundModal: Color,
    val backgroundBrand: Color,
    val backgroundBrandSubtle: Color,
    val backgroundPositive: Color,
    val backgroundWarning: Color,
    val backgroundNegative: Color,
    val backgroundContrast: Color,
    val backgroundDisabled: Color,
    val backgroundOverlay: Color,
    val strokeNeutralSubtle: Color,
    val strokeNeutral: Color,
    val strokeNeutralStrong: Color,
    val strokeBrand: Color,
    val strokePositive: Color,
    val strokeWarning: Color,
    val strokeNegative: Color,
    val textTitle: Color,
    val textSubtitle: Color,
    val textBody: Color,
    val textCaption: Color,
    val textPlaceholder: Color,
    val textDisabled: Color,
    val textOnColorDark: Color,
    val textOnColorLight: Color,
    val textOnContrast: Color,
    val textLink: Color,
    val textBrand: Color,
    val textPositive: Color,
    val textWarning: Color,
    val textNegative: Color,
    val iconNeutralSubtle: Color,
    val iconNeutral: Color,
    val iconNeutralStrong: Color,
    val iconBrand: Color,
    val iconPositive: Color,
    val iconWarning: Color,
    val iconNegative: Color,
    val iconOnColorDark: Color,
    val iconOnColorLight: Color,
    val iconOnContrast: Color,
    val iconDisabled: Color,
    val buttonPrimaryDefault: Color,
    val buttonPrimaryActive: Color,
    val buttonPrimaryDisabled: Color,
    val buttonSecondaryDefault: Color,
    val buttonSecondaryActive: Color,
    val buttonSecondaryDisabled: Color,
    val buttonTertiaryDefault: Color,
    val buttonTertiaryActive: Color,
    val buttonTertiaryDisabled: Color,
    val buttonBrandDefault: Color,
    val buttonBrandActive: Color,
    val buttonBrandDisabled: Color,
    val buttonCriticalDefault: Color,
    val buttonCriticalActive: Color,
    val buttonCriticalDisabled: Color,
    val inputDefault: Color,
    val inputActive: Color,
    val inputActiveCursor: Color,
    val inputSelected: Color,
    val inputPositive: Color,
    val inputNegative: Color,
    val inputDisabled: Color,
    val tagNeutral: Color,
    val tagBrandStrong: Color,
    val tagBrandSubtle: Color,
    val tagPositive: Color,
    val tagWarning: Color,
    val tagNegative: Color,
)

internal val MaterialLightColorTheme = lightColorScheme(
    primary = Primary500,
    onPrimary = Color.White,
    primaryContainer = Primary100,
    onPrimaryContainer = Primary900,
    secondary = Grey600,
    onSecondary = Color.White,
    secondaryContainer = Grey200,
    onSecondaryContainer = Grey900,
    tertiary = Green600,
    onTertiary = Color.White,
    tertiaryContainer = Green100,
    onTertiaryContainer = Green900,
    error = Red500,
    onError = Color.White,
    errorContainer = Red100,
    onErrorContainer = Red900,
    background = Grey50,
    onBackground = Grey900,
    surface = Grey100,
    onSurface = Grey900,
    surfaceVariant = Grey200,
    onSurfaceVariant = Grey700,
    outline = Grey400,
    outlineVariant = Grey300,
    scrim = Grey900,
)

internal val MaterialDarkColorTheme = darkColorScheme(
    primary = Primary400,
    onPrimary = Primary900,
    primaryContainer = Primary800,
    onPrimaryContainer = Primary100,
    secondary = Grey400,
    onSecondary = Grey900,
    secondaryContainer = Grey700,
    onSecondaryContainer = Grey100,
    tertiary = Green400,
    onTertiary = Green900,
    tertiaryContainer = Green800,
    onTertiaryContainer = Green100,
    error = Red400,
    onError = Red900,
    errorContainer = Red800,
    onErrorContainer = Red100,
    background = Grey900,
    onBackground = Grey50,
    surface = Grey800,
    onSurface = Grey50,
    surfaceVariant = Grey700,
    onSurfaceVariant = Grey300,
    outline = Grey600,
    outlineVariant = Grey700,
    scrim = Grey900,
)

internal val LightColorTheme = Colors(
    background = BackgroundLight,
    backgroundContainer = BackgroundContainerLight,
    backgroundObject = BackgroundObjectLight,
    backgroundModal = BackgroundModalLight,
    backgroundBrand = BackgroundBrandLight,
    backgroundBrandSubtle = BackgroundBrandSubtleLight,
    backgroundPositive = BackgroundPositiveLight,
    backgroundWarning = BackgroundWarningLight,
    backgroundNegative = BackgroundNegativeLight,
    backgroundContrast = BackgroundContrastLight,
    backgroundDisabled = BackgroundDisabledLight,
    backgroundOverlay = BackgroundOverlayLight,
    strokeNeutralSubtle = StrokeNeutralSubtleLight,
    strokeNeutral = StrokeNeutralLight,
    strokeNeutralStrong = StrokeNeutralStrongLight,
    strokeBrand = StrokeBrandLight,
    strokePositive = StrokePositiveLight,
    strokeWarning = StrokeWarningLight,
    strokeNegative = StrokeNegativeLight,
    textTitle = TextTitleLight,
    textSubtitle = TextSubtitleLight,
    textBody = TextBodyLight,
    textCaption = TextCaptionLight,
    textPlaceholder = TextPlaceholderLight,
    textDisabled = TextDisabledLight,
    textOnColorDark = TextOnColorDarkLight,
    textOnColorLight = TextOnColorLightLight,
    textOnContrast = TextOnContrastLight,
    textLink = TextLinkLight,
    textBrand = TextBrandLight,
    textPositive = TextPositiveLight,
    textWarning = TextWarningLight,
    textNegative = TextNegativeLight,
    iconNeutralSubtle = IconNeutralSubtleLight,
    iconNeutral = IconNeutralLight,
    iconNeutralStrong = IconNeutralStrongLight,
    iconBrand = IconBrandLight,
    iconPositive = IconPositiveLight,
    iconWarning = IconWarningLight,
    iconNegative = IconNegativeLight,
    iconOnColorDark = IconOnColorDarkLight,
    iconOnColorLight = IconOnColorLightLight,
    iconOnContrast = IconOnContrastLight,
    iconDisabled = IconDisabledLight,
    buttonPrimaryDefault = ButtonPrimaryDefaultLight,
    buttonPrimaryActive = ButtonPrimaryActiveLight,
    buttonPrimaryDisabled = ButtonPrimaryDisabledLight,
    buttonSecondaryDefault = ButtonSecondaryDefaultLight,
    buttonSecondaryActive = ButtonSecondaryActiveLight,
    buttonSecondaryDisabled = ButtonSecondaryDisabledLight,
    buttonTertiaryDefault = ButtonTertiaryDefaultLight,
    buttonTertiaryActive = ButtonTertiaryActiveLight,
    buttonTertiaryDisabled = ButtonTertiaryDisabledLight,
    buttonBrandDefault = ButtonBrandDefaultLight,
    buttonBrandActive = ButtonBrandActiveLight,
    buttonBrandDisabled = ButtonBrandDisabledLight,
    buttonCriticalDefault = ButtonCriticalDefaultLight,
    buttonCriticalActive = ButtonCriticalActiveLight,
    buttonCriticalDisabled = ButtonCriticalDisabledLight,
    inputDefault = InputDefaultLight,
    inputActive = InputActiveLight,
    inputActiveCursor = InputActiveCursorLight,
    inputSelected = InputSelectedLight,
    inputPositive = InputPositiveLight,
    inputNegative = InputNegativeLight,
    inputDisabled = InputDisabledLight,
    tagNeutral = TagNeutralLight,
    tagBrandStrong = TagBrandStrongLight,
    tagBrandSubtle = TagBrandSubtleLight,
    tagPositive = TagPositiveLight,
    tagWarning = TagWarningLight,
    tagNegative = TagNegativeLight,
)

internal val DarkColorTheme = Colors(
    background = BackgroundDark,
    backgroundContainer = BackgroundContainerDark,
    backgroundObject = BackgroundObjectDark,
    backgroundModal = BackgroundModalDark,
    backgroundBrand = BackgroundBrandDark,
    backgroundBrandSubtle = BackgroundBrandSubtleDark,
    backgroundPositive = BackgroundPositiveDark,
    backgroundWarning = BackgroundWarningDark,
    backgroundNegative = BackgroundNegativeDark,
    backgroundContrast = BackgroundContrastDark,
    backgroundDisabled = BackgroundDisabledDark,
    backgroundOverlay = BackgroundOverlayDark,
    strokeNeutralSubtle = StrokeNeutralSubtleDark,
    strokeNeutral = StrokeNeutralDark,
    strokeNeutralStrong = StrokeNeutralStrongDark,
    strokeBrand = StrokeBrandDark,
    strokePositive = StrokePositiveDark,
    strokeWarning = StrokeWarningDark,
    strokeNegative = StrokeNegativeDark,
    textTitle = TextTitleDark,
    textSubtitle = TextSubtitleDark,
    textBody = TextBodyDark,
    textCaption = TextCaptionDark,
    textPlaceholder = TextPlaceholderDark,
    textDisabled = TextDisabledDark,
    textOnColorDark = TextOnColorDarkDark,
    textOnColorLight = TextOnColorLightDark,
    textOnContrast = TextOnContrastDark,
    textLink = TextLinkDark,
    textBrand = TextBrandDark,
    textPositive = TextPositiveDark,
    textWarning = TextWarningDark,
    textNegative = TextNegativeDark,
    iconNeutralSubtle = IconNeutralSubtleDark,
    iconNeutral = IconNeutralDark,
    iconNeutralStrong = IconNeutralStrongDark,
    iconBrand = IconBrandDark,
    iconPositive = IconPositiveDark,
    iconWarning = IconWarningDark,
    iconNegative = IconNegativeDark,
    iconOnColorDark = IconOnColorDarkDark,
    iconOnColorLight = IconOnColorLightDark,
    iconOnContrast = IconOnContrastDark,
    iconDisabled = IconDisabledDark,
    buttonPrimaryDefault = ButtonPrimaryDefaultDark,
    buttonPrimaryActive = ButtonPrimaryActiveDark,
    buttonPrimaryDisabled = ButtonPrimaryDisabledDark,
    buttonSecondaryDefault = ButtonSecondaryDefaultDark,
    buttonSecondaryActive = ButtonSecondaryActiveDark,
    buttonSecondaryDisabled = ButtonSecondaryDisabledDark,
    buttonTertiaryDefault = ButtonTertiaryDefaultDark,
    buttonTertiaryActive = ButtonTertiaryActiveDark,
    buttonTertiaryDisabled = ButtonTertiaryDisabledDark,
    buttonBrandDefault = ButtonBrandDefaultDark,
    buttonBrandActive = ButtonBrandActiveDark,
    buttonBrandDisabled = ButtonBrandDisabledDark,
    buttonCriticalDefault = ButtonCriticalDefaultDark,
    buttonCriticalActive = ButtonCriticalActiveDark,
    buttonCriticalDisabled = ButtonCriticalDisabledDark,
    inputDefault = InputDefaultDark,
    inputActive = InputActiveDark,
    inputActiveCursor = InputActiveCursorDark,
    inputSelected = InputSelectedDark,
    inputPositive = InputPositiveDark,
    inputNegative = InputNegativeDark,
    inputDisabled = InputDisabledDark,
    tagNeutral = TagNeutralDark,
    tagBrandStrong = TagBrandStrongDark,
    tagBrandSubtle = TagBrandSubtleDark,
    tagPositive = TagPositiveDark,
    tagWarning = TagWarningDark,
    tagNegative = TagNegativeDark,
)

internal val LocalColors = staticCompositionLocalOf {
    LightColorTheme
}
