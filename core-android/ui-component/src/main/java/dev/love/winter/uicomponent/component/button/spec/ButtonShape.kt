package dev.love.winter.uicomponent.component.button.spec

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.love.winter.uicomponent.theme.WinterTheme

/**
 * ButtonSize
 *
 * Defines button sizes with dimension and shape specifications.
 *
 * [Small]: Compact button for tight spaces
 * [Medium]: Default button size for most use cases
 * [Large]: Prominent button for primary actions
 */
sealed interface ButtonShape {
    val iconSize: Dp
    val height: Dp

    @Composable
    fun textStyle(): TextStyle

    @Composable
    fun paddingVertical(): Dp

    @Composable
    fun paddingHorizontal(): Dp

    @Composable
    fun shape(): Shape

    data object Small : ButtonShape {
        override val iconSize: Dp = 14.dp
        override val height: Dp = 32.dp

        @Composable
        override fun textStyle(): TextStyle {
            return WinterTheme.typography.actionSmall
        }

        @Composable
        override fun paddingVertical(): Dp {
            return WinterTheme.spacing.extraSmall
        }

        @Composable
        override fun paddingHorizontal(): Dp {
            return WinterTheme.spacing.small
        }

        @Composable
        override fun shape(): Shape {
            return WinterTheme.borderRadius.pill
        }
    }

    data object Medium : ButtonShape {
        override val iconSize: Dp = 16.dp
        override val height: Dp = 44.dp

        @Composable
        override fun textStyle(): TextStyle {
            return WinterTheme.typography.actionMedium
        }

        @Composable
        override fun paddingVertical(): Dp {
            return WinterTheme.spacing.extraSmall
        }

        @Composable
        override fun paddingHorizontal(): Dp {
            return WinterTheme.spacing.medium
        }

        @Composable
        override fun shape(): Shape {
            return WinterTheme.borderRadius.small
        }
    }

    data object Large : ButtonShape {
        override val iconSize: Dp = 18.dp
        override val height: Dp = 56.dp

        @Composable
        override fun textStyle(): TextStyle {
            return WinterTheme.typography.actionLarge
        }

        @Composable
        override fun paddingVertical(): Dp {
            return WinterTheme.spacing.small
        }

        @Composable
        override fun paddingHorizontal(): Dp {
            return WinterTheme.spacing.medium
        }

        @Composable
        override fun shape(): Shape {
            return WinterTheme.borderRadius.small
        }
    }
}
