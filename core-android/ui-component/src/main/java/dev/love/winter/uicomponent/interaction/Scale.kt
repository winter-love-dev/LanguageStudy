package dev.love.winter.uicomponent.interaction

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer

private const val DEFAULT_SCALE = 0.95f

internal fun Modifier.updateScale(
    pressed: Boolean,
    pressedScale: Float = DEFAULT_SCALE,
    animationSpec: AnimationSpec<Float> = spring(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessHigh,
    ),
): Modifier = composed {
    val scale by animateFloatAsState(
        targetValue = if (pressed) {
            pressedScale
        } else {
            1f
        },
        animationSpec = animationSpec,
        label = "pressScale",
    )

    graphicsLayer {
        scaleX = scale
        scaleY = scale
    }
}
