package dev.love.winter.designsystem.component.button.spec

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.love.winter.designsystem.theme.WinterTheme

/**
 * ButtonType
 *
 * Defines button variants with state-specific colors (Default, Active, Disabled).
 *
 * [Primary]: Use primary buttons for the main actions.
 *            Avoid using multiple primary buttons in the same context.
 *
 * [Secondary]: Use secondary buttons for actions that are relevant but not the main focus of the screen.
 *              You can use multiple secondary buttons in the same context.
 *
 * [Tertiary]: Use tertiary buttons for low-priority actions, such as links to other pages or sections.
 *
 * [Brand]: Use brand buttons when you want to catch the user's attention,
 *          for calls to action, and brand-related content.
 *          Avoid using multiple brand buttons in the same context.
 *
 * [Critical]: Use critical buttons only for urgent and/or destructive actions.
 *             Avoid using multiple critical buttons on the same screen.
 *             For negative actions that are not destructive, prefer using the secondary or tertiary buttons.
 */
sealed interface ButtonType {
    @Composable
    fun colors(state: ButtonState): ButtonColors

    data object Primary : ButtonType {
        @Composable
        override fun colors(state: ButtonState): ButtonColors = when (state) {
            ButtonState.Default -> ButtonColors(
                container = WinterTheme.color.buttonPrimaryDefault,
                content = WinterTheme.color.textOnContrast,
                icon = WinterTheme.color.iconOnContrast,
            )
            ButtonState.Active -> ButtonColors(
                container = WinterTheme.color.buttonPrimaryActive,
                content = WinterTheme.color.textOnContrast,
                icon = WinterTheme.color.iconOnContrast,
            )
            ButtonState.Disabled -> ButtonColors(
                container = WinterTheme.color.buttonPrimaryDisabled,
                content = WinterTheme.color.textDisabled,
                icon = WinterTheme.color.iconDisabled,
            )
        }
    }

    data object Secondary : ButtonType {
        @Composable
        override fun colors(state: ButtonState): ButtonColors = when (state) {
            ButtonState.Default -> ButtonColors(
                container = WinterTheme.color.buttonSecondaryDefault,
                content = WinterTheme.color.textTitle,
                icon = WinterTheme.color.iconNeutralStrong,
            )
            ButtonState.Active -> ButtonColors(
                container = WinterTheme.color.buttonSecondaryActive,
                content = WinterTheme.color.textTitle,
                icon = WinterTheme.color.iconNeutralStrong,
            )
            ButtonState.Disabled -> ButtonColors(
                container = WinterTheme.color.buttonSecondaryDisabled,
                content = WinterTheme.color.textDisabled,
                icon = WinterTheme.color.iconDisabled,
            )
        }
    }

    data object Tertiary : ButtonType {
        @Composable
        override fun colors(state: ButtonState): ButtonColors = when (state) {
            ButtonState.Default -> ButtonColors(
                container = Color.Transparent,
                content = WinterTheme.color.buttonTertiaryDefault,
                icon = WinterTheme.color.buttonTertiaryDefault,
            )
            ButtonState.Active -> ButtonColors(
                container = Color.Transparent,
                content = WinterTheme.color.buttonTertiaryActive,
                icon = WinterTheme.color.buttonTertiaryActive,
            )
            ButtonState.Disabled -> ButtonColors(
                container = Color.Transparent,
                content = WinterTheme.color.buttonTertiaryDisabled,
                icon = WinterTheme.color.buttonTertiaryDisabled,
            )
        }
    }

    data object Brand : ButtonType {
        @Composable
        override fun colors(state: ButtonState): ButtonColors = when (state) {
            ButtonState.Default -> ButtonColors(
                container = WinterTheme.color.buttonBrandDefault,
                content = WinterTheme.color.textOnColorDark,
                icon = WinterTheme.color.iconOnColorDark,
            )
            ButtonState.Active -> ButtonColors(
                container = WinterTheme.color.buttonBrandActive,
                content = WinterTheme.color.textOnColorDark,
                icon = WinterTheme.color.iconOnColorDark,
            )
            ButtonState.Disabled -> ButtonColors(
                container = WinterTheme.color.buttonBrandDisabled,
                content = WinterTheme.color.textDisabled,
                icon = WinterTheme.color.iconDisabled,
            )
        }
    }

    data object Critical : ButtonType {
        @Composable
        override fun colors(state: ButtonState): ButtonColors = when (state) {
            ButtonState.Default -> ButtonColors(
                container = WinterTheme.color.buttonCriticalDefault,
                content = WinterTheme.color.textOnColorDark,
                icon = WinterTheme.color.iconOnColorDark,
            )
            ButtonState.Active -> ButtonColors(
                container = WinterTheme.color.buttonCriticalActive,
                content = WinterTheme.color.textOnColorDark,
                icon = WinterTheme.color.iconOnColorDark,
            )
            ButtonState.Disabled -> ButtonColors(
                container = WinterTheme.color.buttonCriticalDisabled,
                content = WinterTheme.color.textDisabled,
                icon = WinterTheme.color.iconDisabled,
            )
        }
    }
}