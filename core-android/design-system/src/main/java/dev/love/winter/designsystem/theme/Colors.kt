package dev.love.winter.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import dev.love.winter.designsystem.tokens.BackgroundBrandDark
import dev.love.winter.designsystem.tokens.BackgroundBrandLight
import dev.love.winter.designsystem.tokens.BackgroundBrandSubtleDark
import dev.love.winter.designsystem.tokens.BackgroundBrandSubtleLight
import dev.love.winter.designsystem.tokens.BackgroundContainerDark
import dev.love.winter.designsystem.tokens.BackgroundContainerLight
import dev.love.winter.designsystem.tokens.BackgroundContrastDark
import dev.love.winter.designsystem.tokens.BackgroundContrastLight
import dev.love.winter.designsystem.tokens.BackgroundDark
import dev.love.winter.designsystem.tokens.BackgroundDisabledDark
import dev.love.winter.designsystem.tokens.BackgroundDisabledLight
import dev.love.winter.designsystem.tokens.BackgroundLight
import dev.love.winter.designsystem.tokens.BackgroundModalDark
import dev.love.winter.designsystem.tokens.BackgroundModalLight
import dev.love.winter.designsystem.tokens.BackgroundNegativeDark
import dev.love.winter.designsystem.tokens.BackgroundNegativeLight
import dev.love.winter.designsystem.tokens.BackgroundObjectDark
import dev.love.winter.designsystem.tokens.BackgroundObjectLight
import dev.love.winter.designsystem.tokens.BackgroundOverlayDark
import dev.love.winter.designsystem.tokens.BackgroundOverlayLight
import dev.love.winter.designsystem.tokens.BackgroundPositiveDark
import dev.love.winter.designsystem.tokens.BackgroundPositiveLight
import dev.love.winter.designsystem.tokens.BackgroundWarningDark
import dev.love.winter.designsystem.tokens.BackgroundWarningLight
import dev.love.winter.designsystem.tokens.ButtonBrandActiveDark
import dev.love.winter.designsystem.tokens.ButtonBrandActiveLight
import dev.love.winter.designsystem.tokens.ButtonBrandDefaultDark
import dev.love.winter.designsystem.tokens.ButtonBrandDefaultLight
import dev.love.winter.designsystem.tokens.ButtonBrandDisabledDark
import dev.love.winter.designsystem.tokens.ButtonBrandDisabledLight
import dev.love.winter.designsystem.tokens.ButtonCriticalActiveDark
import dev.love.winter.designsystem.tokens.ButtonCriticalActiveLight
import dev.love.winter.designsystem.tokens.ButtonCriticalDefaultDark
import dev.love.winter.designsystem.tokens.ButtonCriticalDefaultLight
import dev.love.winter.designsystem.tokens.ButtonCriticalDisabledDark
import dev.love.winter.designsystem.tokens.ButtonCriticalDisabledLight
import dev.love.winter.designsystem.tokens.ButtonPrimaryActiveDark
import dev.love.winter.designsystem.tokens.ButtonPrimaryActiveLight
import dev.love.winter.designsystem.tokens.ButtonPrimaryDefaultDark
import dev.love.winter.designsystem.tokens.ButtonPrimaryDefaultLight
import dev.love.winter.designsystem.tokens.ButtonPrimaryDisabledDark
import dev.love.winter.designsystem.tokens.ButtonPrimaryDisabledLight
import dev.love.winter.designsystem.tokens.ButtonSecondaryActiveDark
import dev.love.winter.designsystem.tokens.ButtonSecondaryActiveLight
import dev.love.winter.designsystem.tokens.ButtonSecondaryDefaultDark
import dev.love.winter.designsystem.tokens.ButtonSecondaryDefaultLight
import dev.love.winter.designsystem.tokens.ButtonSecondaryDisabledDark
import dev.love.winter.designsystem.tokens.ButtonSecondaryDisabledLight
import dev.love.winter.designsystem.tokens.ButtonTertiaryActiveDark
import dev.love.winter.designsystem.tokens.ButtonTertiaryActiveLight
import dev.love.winter.designsystem.tokens.ButtonTertiaryDefaultDark
import dev.love.winter.designsystem.tokens.ButtonTertiaryDefaultLight
import dev.love.winter.designsystem.tokens.ButtonTertiaryDisabledDark
import dev.love.winter.designsystem.tokens.ButtonTertiaryDisabledLight
import dev.love.winter.designsystem.tokens.Green100
import dev.love.winter.designsystem.tokens.Green400
import dev.love.winter.designsystem.tokens.Green600
import dev.love.winter.designsystem.tokens.Green800
import dev.love.winter.designsystem.tokens.Green900
import dev.love.winter.designsystem.tokens.Grey100
import dev.love.winter.designsystem.tokens.Grey200
import dev.love.winter.designsystem.tokens.Grey300
import dev.love.winter.designsystem.tokens.Grey400
import dev.love.winter.designsystem.tokens.Grey50
import dev.love.winter.designsystem.tokens.Grey600
import dev.love.winter.designsystem.tokens.Grey700
import dev.love.winter.designsystem.tokens.Grey800
import dev.love.winter.designsystem.tokens.Grey900
import dev.love.winter.designsystem.tokens.IconBrandDark
import dev.love.winter.designsystem.tokens.IconBrandLight
import dev.love.winter.designsystem.tokens.IconDisabledDark
import dev.love.winter.designsystem.tokens.IconDisabledLight
import dev.love.winter.designsystem.tokens.IconNegativeDark
import dev.love.winter.designsystem.tokens.IconNegativeLight
import dev.love.winter.designsystem.tokens.IconNeutralDark
import dev.love.winter.designsystem.tokens.IconNeutralLight
import dev.love.winter.designsystem.tokens.IconNeutralStrongDark
import dev.love.winter.designsystem.tokens.IconNeutralStrongLight
import dev.love.winter.designsystem.tokens.IconNeutralSubtleDark
import dev.love.winter.designsystem.tokens.IconNeutralSubtleLight
import dev.love.winter.designsystem.tokens.IconOnColorDarkDark
import dev.love.winter.designsystem.tokens.IconOnColorDarkLight
import dev.love.winter.designsystem.tokens.IconOnColorLightDark
import dev.love.winter.designsystem.tokens.IconOnColorLightLight
import dev.love.winter.designsystem.tokens.IconOnContrastDark
import dev.love.winter.designsystem.tokens.IconOnContrastLight
import dev.love.winter.designsystem.tokens.IconPositiveDark
import dev.love.winter.designsystem.tokens.IconPositiveLight
import dev.love.winter.designsystem.tokens.IconWarningDark
import dev.love.winter.designsystem.tokens.IconWarningLight
import dev.love.winter.designsystem.tokens.InputActiveCursorDark
import dev.love.winter.designsystem.tokens.InputActiveCursorLight
import dev.love.winter.designsystem.tokens.InputActiveDark
import dev.love.winter.designsystem.tokens.InputActiveLight
import dev.love.winter.designsystem.tokens.InputDefaultDark
import dev.love.winter.designsystem.tokens.InputDefaultLight
import dev.love.winter.designsystem.tokens.InputDisabledDark
import dev.love.winter.designsystem.tokens.InputDisabledLight
import dev.love.winter.designsystem.tokens.InputNegativeDark
import dev.love.winter.designsystem.tokens.InputNegativeLight
import dev.love.winter.designsystem.tokens.InputPositiveDark
import dev.love.winter.designsystem.tokens.InputPositiveLight
import dev.love.winter.designsystem.tokens.InputSelectedDark
import dev.love.winter.designsystem.tokens.InputSelectedLight
import dev.love.winter.designsystem.tokens.Primary100
import dev.love.winter.designsystem.tokens.Primary400
import dev.love.winter.designsystem.tokens.Primary500
import dev.love.winter.designsystem.tokens.Primary800
import dev.love.winter.designsystem.tokens.Primary900
import dev.love.winter.designsystem.tokens.Red100
import dev.love.winter.designsystem.tokens.Red400
import dev.love.winter.designsystem.tokens.Red500
import dev.love.winter.designsystem.tokens.Red800
import dev.love.winter.designsystem.tokens.Red900
import dev.love.winter.designsystem.tokens.StrokeBrandDark
import dev.love.winter.designsystem.tokens.StrokeBrandLight
import dev.love.winter.designsystem.tokens.StrokeNegativeDark
import dev.love.winter.designsystem.tokens.StrokeNegativeLight
import dev.love.winter.designsystem.tokens.StrokeNeutralDark
import dev.love.winter.designsystem.tokens.StrokeNeutralLight
import dev.love.winter.designsystem.tokens.StrokeNeutralStrongDark
import dev.love.winter.designsystem.tokens.StrokeNeutralStrongLight
import dev.love.winter.designsystem.tokens.StrokeNeutralSubtleDark
import dev.love.winter.designsystem.tokens.StrokeNeutralSubtleLight
import dev.love.winter.designsystem.tokens.StrokePositiveDark
import dev.love.winter.designsystem.tokens.StrokePositiveLight
import dev.love.winter.designsystem.tokens.StrokeWarningDark
import dev.love.winter.designsystem.tokens.StrokeWarningLight
import dev.love.winter.designsystem.tokens.TagBrandStrongDark
import dev.love.winter.designsystem.tokens.TagBrandStrongLight
import dev.love.winter.designsystem.tokens.TagBrandSubtleDark
import dev.love.winter.designsystem.tokens.TagBrandSubtleLight
import dev.love.winter.designsystem.tokens.TagNegativeDark
import dev.love.winter.designsystem.tokens.TagNegativeLight
import dev.love.winter.designsystem.tokens.TagNeutralDark
import dev.love.winter.designsystem.tokens.TagNeutralLight
import dev.love.winter.designsystem.tokens.TagPositiveDark
import dev.love.winter.designsystem.tokens.TagPositiveLight
import dev.love.winter.designsystem.tokens.TagWarningDark
import dev.love.winter.designsystem.tokens.TagWarningLight
import dev.love.winter.designsystem.tokens.TextBodyDark
import dev.love.winter.designsystem.tokens.TextBodyLight
import dev.love.winter.designsystem.tokens.TextBrandDark
import dev.love.winter.designsystem.tokens.TextBrandLight
import dev.love.winter.designsystem.tokens.TextCaptionDark
import dev.love.winter.designsystem.tokens.TextCaptionLight
import dev.love.winter.designsystem.tokens.TextDisabledDark
import dev.love.winter.designsystem.tokens.TextDisabledLight
import dev.love.winter.designsystem.tokens.TextLinkDark
import dev.love.winter.designsystem.tokens.TextLinkLight
import dev.love.winter.designsystem.tokens.TextNegativeDark
import dev.love.winter.designsystem.tokens.TextNegativeLight
import dev.love.winter.designsystem.tokens.TextOnColorDarkDark
import dev.love.winter.designsystem.tokens.TextOnColorDarkLight
import dev.love.winter.designsystem.tokens.TextOnColorLightDark
import dev.love.winter.designsystem.tokens.TextOnColorLightLight
import dev.love.winter.designsystem.tokens.TextOnContrastDark
import dev.love.winter.designsystem.tokens.TextOnContrastLight
import dev.love.winter.designsystem.tokens.TextPlaceholderDark
import dev.love.winter.designsystem.tokens.TextPlaceholderLight
import dev.love.winter.designsystem.tokens.TextPositiveDark
import dev.love.winter.designsystem.tokens.TextPositiveLight
import dev.love.winter.designsystem.tokens.TextSubtitleDark
import dev.love.winter.designsystem.tokens.TextSubtitleLight
import dev.love.winter.designsystem.tokens.TextTitleDark
import dev.love.winter.designsystem.tokens.TextTitleLight
import dev.love.winter.designsystem.tokens.TextWarningDark
import dev.love.winter.designsystem.tokens.TextWarningLight

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
