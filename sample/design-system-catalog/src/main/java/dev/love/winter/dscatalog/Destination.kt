package dev.love.winter.dscatalog

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

////////////////////////////////////////////////////////////////////////////////////////////////////

@Serializable data object HomeScreen : NavKey

@Serializable data object ColorsScreen : NavKey

@Serializable data object TypographyScreen : NavKey

@Serializable data object SpacingScreen : NavKey

@Serializable data object BorderRadiusScreen : NavKey

@Serializable data object IconsScreen : NavKey

///////////////////////////////////////////////////////////////////////////////////////////////////

@Serializable data object ButtonScreen : NavKey

@Serializable data object ActionSheetScreen : NavKey

@Serializable data object DividerScreen : NavKey

@Serializable data object SliderScreen : NavKey
