package dev.love.winter.dscatalog.home

import androidx.navigation3.runtime.NavKey
import dev.love.winter.dscatalog.Catalog
import dev.love.winter.dscatalog.Catalog.Component
import dev.love.winter.dscatalog.Catalog.DesignToken

data class State(
    val designTokenEntries: List<DesignToken>,
    val componentEntries: List<Component>
) {
    companion object {
        val Default = State(
            designTokenEntries = emptyList(),
            componentEntries = emptyList(),
        )
    }
}

sealed interface Event {
    data class OnCatalogItemClick(
        val item: Catalog,
    ) : Event
}

sealed interface SideEffect {
    data class NavigateTo(
        val catalog: NavKey,
    ) : SideEffect
}
