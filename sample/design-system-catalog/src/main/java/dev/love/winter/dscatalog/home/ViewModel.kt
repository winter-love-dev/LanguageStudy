package dev.love.winter.dscatalog.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.love.winter.dscatalog.Catalog
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(State.Default)
    val uiState: StateFlow<State> = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<SideEffect>(
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
    )
    val sideEffect: SharedFlow<SideEffect> = _sideEffect.asSharedFlow()

    init {
        _uiState.update {
            it.copy(
                designTokenEntries = Catalog.designTokenEntries,
                componentEntries = Catalog.componentEntries,
            )
        }
    }

    fun onEvent(event: Event) {
        when (event) {
            is Event.OnCatalogItemClick -> {
                handleCatalogItemClick(event.item)
            }
            is Event.OnLanguageChange -> {
                _sideEffect.tryEmit(
                    SideEffect.RestartApp(
                        languageTag = event.languageTag,
                    )
                )
            }
        }
    }

    private fun handleCatalogItemClick(item: Catalog) {
        item.destination?.let { destination ->
            viewModelScope.launch {
                _sideEffect.emit(
                    SideEffect.NavigateTo(
                        catalog = destination,
                    )
                )
            }
        }
    }
}
