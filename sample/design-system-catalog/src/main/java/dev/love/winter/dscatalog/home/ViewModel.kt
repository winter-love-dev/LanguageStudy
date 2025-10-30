package dev.love.winter.dscatalog.home

import androidx.lifecycle.ViewModel
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
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor() : ViewModel() {
    val uiState: StateFlow<State> = _uiState.asStateFlow()
    val sideEffect: SharedFlow<SideEffect> = _sideEffect.asSharedFlow()

    private val _uiState get() = MutableStateFlow(State.Default)
    private val _sideEffect get() = MutableSharedFlow<SideEffect>(
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
    )

    init {
        _uiState.update {
            it.copy(
                designTokenEntries = Catalog.designTokenEntries,
                componentEntries = Catalog.componentEntries,
            )
        }
    }
}
