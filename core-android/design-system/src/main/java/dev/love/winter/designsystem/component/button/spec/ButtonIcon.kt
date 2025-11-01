package dev.love.winter.designsystem.component.button.spec

import androidx.annotation.DrawableRes

sealed interface ButtonIcon {
    @get:DrawableRes
    val resource: Int
    val contentDescription: String

    data class Leading(
        override val resource: Int,
        override val contentDescription: String,
    ) : ButtonIcon

    data class Trailing(
        override val resource: Int,
        override val contentDescription: String,
    ) : ButtonIcon
}
