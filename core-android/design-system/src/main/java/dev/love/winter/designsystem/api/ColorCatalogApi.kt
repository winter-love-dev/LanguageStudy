package dev.love.winter.designsystem.api

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import dev.love.winter.designsystem.theme.Colors
import dev.love.winter.designsystem.tokens.Blue100
import dev.love.winter.designsystem.tokens.Blue200
import dev.love.winter.designsystem.tokens.Blue300
import dev.love.winter.designsystem.tokens.Blue400
import dev.love.winter.designsystem.tokens.Blue50
import dev.love.winter.designsystem.tokens.Blue500
import dev.love.winter.designsystem.tokens.Blue600
import dev.love.winter.designsystem.tokens.Blue700
import dev.love.winter.designsystem.tokens.Blue800
import dev.love.winter.designsystem.tokens.Blue900
import dev.love.winter.designsystem.tokens.Green100
import dev.love.winter.designsystem.tokens.Green200
import dev.love.winter.designsystem.tokens.Green300
import dev.love.winter.designsystem.tokens.Green400
import dev.love.winter.designsystem.tokens.Green50
import dev.love.winter.designsystem.tokens.Green500
import dev.love.winter.designsystem.tokens.Green600
import dev.love.winter.designsystem.tokens.Green700
import dev.love.winter.designsystem.tokens.Green800
import dev.love.winter.designsystem.tokens.Green900
import dev.love.winter.designsystem.tokens.Grey100
import dev.love.winter.designsystem.tokens.Grey200
import dev.love.winter.designsystem.tokens.Grey300
import dev.love.winter.designsystem.tokens.Grey400
import dev.love.winter.designsystem.tokens.Grey50
import dev.love.winter.designsystem.tokens.Grey500
import dev.love.winter.designsystem.tokens.Grey600
import dev.love.winter.designsystem.tokens.Grey700
import dev.love.winter.designsystem.tokens.Grey800
import dev.love.winter.designsystem.tokens.Grey900
import dev.love.winter.designsystem.tokens.Primary100
import dev.love.winter.designsystem.tokens.Primary200
import dev.love.winter.designsystem.tokens.Primary300
import dev.love.winter.designsystem.tokens.Primary400
import dev.love.winter.designsystem.tokens.Primary50
import dev.love.winter.designsystem.tokens.Primary500
import dev.love.winter.designsystem.tokens.Primary600
import dev.love.winter.designsystem.tokens.Primary700
import dev.love.winter.designsystem.tokens.Primary800
import dev.love.winter.designsystem.tokens.Primary900
import dev.love.winter.designsystem.tokens.Red100
import dev.love.winter.designsystem.tokens.Red200
import dev.love.winter.designsystem.tokens.Red300
import dev.love.winter.designsystem.tokens.Red400
import dev.love.winter.designsystem.tokens.Red50
import dev.love.winter.designsystem.tokens.Red500
import dev.love.winter.designsystem.tokens.Red600
import dev.love.winter.designsystem.tokens.Red700
import dev.love.winter.designsystem.tokens.Red800
import dev.love.winter.designsystem.tokens.Red900
import dev.love.winter.designsystem.tokens.Yellow100
import dev.love.winter.designsystem.tokens.Yellow200
import dev.love.winter.designsystem.tokens.Yellow300
import dev.love.winter.designsystem.tokens.Yellow400
import dev.love.winter.designsystem.tokens.Yellow50
import dev.love.winter.designsystem.tokens.Yellow500
import dev.love.winter.designsystem.tokens.Yellow600
import dev.love.winter.designsystem.tokens.Yellow700
import dev.love.winter.designsystem.tokens.Yellow800
import dev.love.winter.designsystem.tokens.Yellow900
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

class ColorCatalogApi

@Immutable
data class ColorToken(
    val name: String,
    val color: Color,
)

val brandColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "primary-50", color = Primary50),
    ColorToken(name = "primary-100", color = Primary100),
    ColorToken(name = "primary-200", color = Primary200),
    ColorToken(name = "primary-300", color = Primary300),
    ColorToken(name = "primary-400", color = Primary400),
    ColorToken(name = "primary-500", color = Primary500),
    ColorToken(name = "primary-600", color = Primary600),
    ColorToken(name = "primary-700", color = Primary700),
    ColorToken(name = "primary-800", color = Primary800),
    ColorToken(name = "primary-900", color = Primary900),
)

val blueColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "blue-50", color = Blue50),
    ColorToken(name = "blue-100", color = Blue100),
    ColorToken(name = "blue-200", color = Blue200),
    ColorToken(name = "blue-300", color = Blue300),
    ColorToken(name = "blue-400", color = Blue400),
    ColorToken(name = "blue-500", color = Blue500),
    ColorToken(name = "blue-600", color = Blue600),
    ColorToken(name = "blue-700", color = Blue700),
    ColorToken(name = "blue-800", color = Blue800),
    ColorToken(name = "blue-900", color = Blue900),
)

val neutralColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "grey-50", color = Grey50),
    ColorToken(name = "grey-100", color = Grey100),
    ColorToken(name = "grey-200", color = Grey200),
    ColorToken(name = "grey-300", color = Grey300),
    ColorToken(name = "grey-400", color = Grey400),
    ColorToken(name = "grey-500", color = Grey500),
    ColorToken(name = "grey-600", color = Grey600),
    ColorToken(name = "grey-700", color = Grey700),
    ColorToken(name = "grey-800", color = Grey800),
    ColorToken(name = "grey-900", color = Grey900),
)

val greenColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "green-50", color = Green50),
    ColorToken(name = "green-100", color = Green100),
    ColorToken(name = "green-200", color = Green200),
    ColorToken(name = "green-300", color = Green300),
    ColorToken(name = "green-400", color = Green400),
    ColorToken(name = "green-500", color = Green500),
    ColorToken(name = "green-600", color = Green600),
    ColorToken(name = "green-700", color = Green700),
    ColorToken(name = "green-800", color = Green800),
    ColorToken(name = "green-900", color = Green900),
)

val yellowColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "yellow-50", color = Yellow50),
    ColorToken(name = "yellow-100", color = Yellow100),
    ColorToken(name = "yellow-200", color = Yellow200),
    ColorToken(name = "yellow-300", color = Yellow300),
    ColorToken(name = "yellow-400", color = Yellow400),
    ColorToken(name = "yellow-500", color = Yellow500),
    ColorToken(name = "yellow-600", color = Yellow600),
    ColorToken(name = "yellow-700", color = Yellow700),
    ColorToken(name = "yellow-800", color = Yellow800),
    ColorToken(name = "yellow-900", color = Yellow900),
)

val redColorTokens: ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "red-50", color = Red50),
    ColorToken(name = "red-100", color = Red100),
    ColorToken(name = "red-200", color = Red200),
    ColorToken(name = "red-300", color = Red300),
    ColorToken(name = "red-400", color = Red400),
    ColorToken(name = "red-500", color = Red500),
    ColorToken(name = "red-600", color = Red600),
    ColorToken(name = "red-700", color = Red700),
    ColorToken(name = "red-800", color = Red800),
    ColorToken(name = "red-900", color = Red900),
)

fun Colors.iconColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "icon-neutral-subtle", color = iconNeutralSubtle),
    ColorToken(name = "icon-neutral", color = iconNeutral),
    ColorToken(name = "icon-neutral-strong", color = iconNeutralStrong),
    ColorToken(name = "icon-brand", color = iconBrand),
    ColorToken(name = "icon-positive", color = iconPositive),
    ColorToken(name = "icon-warning", color = iconWarning),
    ColorToken(name = "icon-negative", color = iconNegative),
    ColorToken(name = "icon-on-color-dark", color = iconOnColorDark),
    ColorToken(name = "icon-on-color-light", color = iconOnColorLight),
    ColorToken(name = "icon-on-contrast", color = iconOnContrast),
    ColorToken(name = "icon-disabled", color = iconDisabled),
)

fun Colors.textColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "text-title", color = textTitle),
    ColorToken(name = "text-subtitle", color = textSubtitle),
    ColorToken(name = "text-body", color = textBody),
    ColorToken(name = "text-caption", color = textCaption),
    ColorToken(name = "text-placeholder", color = textPlaceholder),
    ColorToken(name = "text-disabled", color = textDisabled),
    ColorToken(name = "text-onColor-dark", color = textOnColorDark),
    ColorToken(name = "text-onColor-light", color = textOnColorLight),
    ColorToken(name = "text-on-contrast", color = textOnContrast),
    ColorToken(name = "text-link", color = textLink),
    ColorToken(name = "text-brand", color = textBrand),
    ColorToken(name = "text-positive", color = textPositive),
    ColorToken(name = "text-warning", color = textWarning),
    ColorToken(name = "text-negative", color = textNegative),
)

fun Colors.strokeColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "stroke-neutral-subtle", color = strokeNeutralSubtle),
    ColorToken(name = "stroke-neutral", color = strokeNeutral),
    ColorToken(name = "stroke-neutral-strong", color = strokeNeutralStrong),
    ColorToken(name = "stroke-brand", color = strokeBrand),
    ColorToken(name = "stroke-positive", color = strokePositive),
    ColorToken(name = "stroke-warning", color = strokeWarning),
    ColorToken(name = "stroke-negative", color = strokeNegative),
)

fun Colors.buttonColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "button-primary-default", color = buttonPrimaryDefault),
    ColorToken(name = "button-primary-active", color = buttonPrimaryActive),
    ColorToken(name = "button-primary-disabled", color = buttonPrimaryDisabled),
    ColorToken(name = "button-secondary-default", color = buttonSecondaryDefault),
    ColorToken(name = "button-secondary-active", color = buttonSecondaryActive),
    ColorToken(name = "button-secondary-disabled", color = buttonSecondaryDisabled),
    ColorToken(name = "button-tertiary-default", color = buttonTertiaryDefault),
    ColorToken(name = "button-tertiary-active", color = buttonTertiaryActive),
    ColorToken(name = "button-tertiary-disabled", color = buttonTertiaryDisabled),
    ColorToken(name = "button-brand-default", color = buttonBrandDefault),
    ColorToken(name = "button-brand-active", color = buttonBrandActive),
    ColorToken(name = "button-brand-disabled", color = buttonBrandDisabled),
    ColorToken(name = "button-critical-default", color = buttonCriticalDefault),
    ColorToken(name = "button-critical-active", color = buttonCriticalActive),
    ColorToken(name = "button-critical-disabled", color = buttonCriticalDisabled),
)

fun Colors.inputColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "input-default", color = inputDefault),
    ColorToken(name = "input-active", color = inputActive),
    ColorToken(name = "input-active-cursor", color = inputActiveCursor),
    ColorToken(name = "input-selected", color = inputSelected),
    ColorToken(name = "input-positive", color = inputPositive),
    ColorToken(name = "input-negative", color = inputNegative),
    ColorToken(name = "input-disabled", color = inputDisabled),
)

fun Colors.tagColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "tag-neutral", color = tagNeutral),
    ColorToken(name = "tag-brand-strong", color = tagBrandStrong),
    ColorToken(name = "tag-brand-subtle", color = tagBrandSubtle),
    ColorToken(name = "tag-positive", color = tagPositive),
    ColorToken(name = "tag-warning", color = tagWarning),
    ColorToken(name = "tag-negative", color = tagNegative),
)

fun Colors.backgroundColorTokens(): ImmutableList<ColorToken> = persistentListOf(
    ColorToken(name = "background", color = background),
    ColorToken(name = "background-container", color = backgroundContainer),
    ColorToken(name = "background-object", color = backgroundObject),
    ColorToken(name = "background-modal", color = backgroundModal),
    ColorToken(name = "background-brand", color = backgroundBrand),
    ColorToken(name = "background-brandSubtle", color = backgroundBrandSubtle),
    ColorToken(name = "background-positive", color = backgroundPositive),
    ColorToken(name = "background-warning", color = backgroundWarning),
    ColorToken(name = "background-negative", color = backgroundNegative),
    ColorToken(name = "background-contrast", color = backgroundContrast),
    ColorToken(name = "background-disabled", color = backgroundDisabled),
    ColorToken(name = "background-overlay", color = backgroundOverlay),
)
