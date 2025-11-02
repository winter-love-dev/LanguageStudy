package dev.love.winter.dscatalog.designtokens.icons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import dev.love.winter.uicomponent.theme.IconResource
import dev.love.winter.uicomponent.theme.WinterTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

internal data class IconInfo(
    val token: String,
    val iconResource: IconResource,
)

internal data class IconGroup(
    val title: String,
    val icons: ImmutableList<IconInfo>,
)

@Composable
internal fun rememberIconGroups(): ImmutableList<IconGroup> {
    val global = WinterTheme.icon.global
    val navigation = WinterTheme.icon.navigation
    val input = WinterTheme.icon.input

    return remember(global, navigation, input) {
        persistentListOf(
            IconGroup(
                title = "Global",
                icons = persistentListOf(
                    IconInfo("icon-home", global.home),
                    IconInfo("icon-settings", global.settings),
                    IconInfo("icon-profile", global.profile),
                    IconInfo("icon-highlights", global.highlights),
                    IconInfo("icon-notification", global.notification),
                    IconInfo("icon-search", global.search),
                )
            ),
            IconGroup(
                title = "Navigation",
                icons = persistentListOf(
                    IconInfo("icon-arrow-up", navigation.arrowUp),
                    IconInfo("icon-arrow-down", navigation.arrowDown),
                    IconInfo("icon-arrow-left", navigation.arrowLeft),
                    IconInfo("icon-arrow-right", navigation.arrowRight),
                    IconInfo("icon-arrow-up-right", navigation.arrowUpRight),
                    IconInfo("icon-chevron-up", navigation.chevronUp),
                    IconInfo("icon-chevron-down", navigation.chevronDown),
                    IconInfo("icon-chevron-left", navigation.chevronLeft),
                    IconInfo("icon-chevron-right", navigation.chevronRight),
                    IconInfo("icon-close", navigation.close),
                    IconInfo("icon-filter", navigation.filter),
                    IconInfo("icon-sort", navigation.sort),
                    IconInfo("icon-logout", navigation.logout),
                    IconInfo("icon-menu", navigation.menu),
                    IconInfo("icon-menu-hamburger", navigation.menuHamburger),
                    IconInfo("icon-more", navigation.more),
                    IconInfo("icon-link", navigation.link),
                )
            ),
            IconGroup(
                title = "Input",
                icons = persistentListOf(
                    IconInfo("icon-edit", input.edit),
                    IconInfo("icon-delete", input.delete),
                    IconInfo("icon-plus", input.plus),
                    IconInfo("icon-minus", input.minus),
                    IconInfo("icon-check", input.check),
                    IconInfo("icon-eye", input.eye),
                    IconInfo("icon-eye-off", input.eyeOff),
                    IconInfo("icon-heart", input.heart),
                    IconInfo("icon-star", input.star),
                    IconInfo("icon-bookmark", input.bookmark),
                    IconInfo("icon-download", input.download),
                    IconInfo("icon-upload", input.upload),
                )
            )
        )
    }
}
