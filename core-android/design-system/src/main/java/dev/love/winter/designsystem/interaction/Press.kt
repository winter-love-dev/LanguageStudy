package dev.love.winter.designsystem.interaction

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput

class Press

@Stable
internal class PressableState {
    var pressed: Boolean by mutableStateOf(false)
        internal set
}

@Composable
internal fun rememberPressedState(): PressableState {
    return remember {
        PressableState()
    }
}

internal fun Modifier.pressable(
    enabled: Boolean = true,
    pressState: PressableState,
    onPress: () -> Unit,
): Modifier {
    return pointerInput(enabled) {
        detectTapGestures(
            onPress = {
                if (enabled) {
                    pressState.pressed = true
                    val released = tryAwaitRelease()
                    pressState.pressed = false
                    if (released) {
                        onPress()
                    }
                }
            }
        )
    }
}
