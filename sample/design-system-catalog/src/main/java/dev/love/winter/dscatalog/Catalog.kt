package dev.love.winter.dscatalog

import androidx.navigation3.runtime.NavKey

sealed class Catalog(
    val destination: NavKey? = null,
) {
    data object Home : Catalog(
        destination = HomeScreen,
    )

    sealed class DesignToken(
        destination: NavKey? = null,
    ) : Catalog(
        destination = destination,
    ) {
        data object Colors : DesignToken(
            destination = ColorsScreen,
        )
        data object Typography : DesignToken(
            destination = TypographyScreen,
        )
        data object Spacing : DesignToken(
            destination = SpacingScreen,
        )
        data object BorderRadius : DesignToken(
            destination = BorderRadiusScreen,
        )
        data object Icons : DesignToken(
            destination = IconsScreen,
        )
    }

    sealed class Component(
        destination: NavKey? = null,
    ) : Catalog(destination = destination) {
        data object Accordion : Component()
        data object ActionSheet : Component(
            destination = ActionSheetScreen,
        )
        data object Avatar : Component()
        data object Badge : Component()
        data object Button : Component(
            destination = ButtonScreen,
        )
        data object Chat : Component()
        data object Checkbox : Component()
        data object Chips : Component()
        data object ContentSwitcher : Component()
        data object Dialog : Component()
        data object Divider : Component(
            destination = DividerScreen,
        )
        data object FilterButton : Component()
        data object FormInputs : Component()
        data object List : Component()
        data object Loader : Component()
        data object NavBar : Component()
        data object PaginationDots : Component()
        data object Pickers : Component()
        data object ProgressBar : Component()
        data object ProgressIndicator : Component()
        data object RadioButton : Component()
        data object Schedule : Component()
        data object Slider : Component(
            destination = SliderScreen,
        )
        data object StarRating : Component()
        data object TabBar : Component()
        data object Tabs : Component()
        data object Tag : Component()
        data object Toast : Component()
        data object Toggle : Component()
    }

    companion object {
        val designTokenEntries: List<DesignToken> = listOf(
            DesignToken.Colors,
            DesignToken.Typography,
            DesignToken.Spacing,
            DesignToken.BorderRadius,
            DesignToken.Icons,
        )

        val componentEntries: List<Component> = listOf(
            Component.Accordion,
            Component.ActionSheet,
            Component.Avatar,
            Component.Badge,
            Component.Button,
            Component.Chat,
            Component.Checkbox,
            Component.Chips,
            Component.ContentSwitcher,
            Component.Dialog,
            Component.Divider,
            Component.FilterButton,
            Component.FormInputs,
            Component.List,
            Component.Loader,
            Component.NavBar,
            Component.PaginationDots,
            Component.Pickers,
            Component.ProgressBar,
            Component.ProgressIndicator,
            Component.RadioButton,
            Component.Schedule,
            Component.Slider,
            Component.StarRating,
            Component.TabBar,
            Component.Tabs,
            Component.Tag,
            Component.Toast,
            Component.Toggle,
        )
    }
}
