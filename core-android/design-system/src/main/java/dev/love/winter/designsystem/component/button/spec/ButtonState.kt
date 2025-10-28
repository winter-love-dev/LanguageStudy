package dev.love.winter.designsystem.component.button.spec

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * ButtonState
 *
 * Represents the interaction state of a button.
 *
 * [Default]: The default resting state of the button
 * [Active]: The pressed/active state of the button
 * [Disabled]: The disabled state of the button
 */
sealed interface ButtonState {
    data object Default : ButtonState
    data object Active : ButtonState
    data object Disabled : ButtonState
}

@Immutable
data class ButtonColors(
    val container: Color,
    val content: Color,
)
