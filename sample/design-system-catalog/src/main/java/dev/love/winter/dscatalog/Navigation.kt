package dev.love.winter.dscatalog

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.catalog.button.ButtonRoute
import dev.love.winter.dscatalog.designtokens.borderradius.BorderRadiusRoute
import dev.love.winter.dscatalog.designtokens.color.ColorRoute
import dev.love.winter.dscatalog.designtokens.icons.ColorsRoute
import dev.love.winter.dscatalog.designtokens.spacing.SpacingRoute
import dev.love.winter.dscatalog.designtokens.typography.TypographyRoute
import dev.love.winter.dscatalog.home.HomeRoute

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
) {
    val backStack = rememberNavBackStack(Catalog.Home.destination!!)

    Scaffold(
        modifier = modifier
            .background(color = WinterTheme.color.buttonCriticalActive)
            .fillMaxSize(),
    ) { paddingValues ->
        NavDisplay(
            backStack = backStack,
            modifier = Modifier.padding(paddingValues),
            entryDecorators = listOf(
                rememberSaveableStateHolderNavEntryDecorator(),
                rememberViewModelStoreNavEntryDecorator()
            ),
            onBack = {
                backStack.removeLastOrNull()
            },
            entryProvider = entryProvider {
                /**
                 * Root
                 */
                entry<HomeScreen> {
                    HomeRoute(
                        onNavigate = {
                            backStack.add(it)
                        }
                    )
                }
                /**
                 * Design Tokens
                 */
                entry<BorderRadiusScreen>(
                    metadata = TRANSITION_SPEC_EXAMPLE,
                ) {
                    BorderRadiusRoute()
                }
                entry<ColorsScreen> {
                    ColorRoute()
                }
                entry<IconsScreen> {
                    ColorsRoute()
                }
                entry<SpacingScreen> {
                    SpacingRoute()
                }
                entry<TypographyScreen> {
                    TypographyRoute()
                }
                /**
                 * Components
                 */
                entry<ActionSheetScreen> {
                    Text(text = "Unknown screen")
                }
                entry<ButtonScreen> {
                    ButtonRoute()
                }
                entry<DividerScreen> {
                    Text(text = "Unknown screen")
                }
                entry<SliderScreen> {
                    Text(text = "Unknown screen")
                }
            },
            transitionSpec = {
                // Slide in from right when navigating forward
                slideInHorizontally(initialOffsetX = { it }) togetherWith
                        slideOutHorizontally(targetOffsetX = { -it })
            },
            popTransitionSpec = {
                // Slide in from left when navigating back
                slideInHorizontally(initialOffsetX = { -it }) togetherWith
                        slideOutHorizontally(targetOffsetX = { it })
            },
            predictivePopTransitionSpec = {
                // Slide in from left when navigating back
                slideInHorizontally(initialOffsetX = { -it }) togetherWith
                        slideOutHorizontally(targetOffsetX = { it })
            },
        )
    }
}

private val TRANSITION_SPEC_EXAMPLE: Map<String, Any> = NavDisplay.transitionSpec {
    // Slide new content up, keeping the old content in place underneath
    slideInVertically(
        initialOffsetY = { it },
        animationSpec = tween(300)
    ) togetherWith ExitTransition.KeepUntilTransitionsFinished
} + NavDisplay.popTransitionSpec {
    // Slide old content down, revealing the new content in place underneath
    EnterTransition.None togetherWith
            slideOutVertically(
                targetOffsetY = { it },
                animationSpec = tween(300)
            )
} + NavDisplay.predictivePopTransitionSpec {
    // Slide old content down, revealing the new content in place underneath
    EnterTransition.None togetherWith
            slideOutVertically(
                targetOffsetY = { it },
                animationSpec = tween(300)
            )
}
