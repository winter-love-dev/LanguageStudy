package dev.love.winter.dscatalog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.catalog.button.ButtonRoute
import dev.love.winter.dscatalog.designtokens.borderradius.BorderRadiusRoute
import dev.love.winter.dscatalog.designtokens.color.ColorRoute
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
            onBack = {
                backStack.removeLastOrNull()
            },
            entryProvider = entryProvider {
                /**
                 * Design Tokens
                 */
                entry<BorderRadiusScreen> {
                    BorderRadiusRoute()
                }
                entry<ColorsScreen> {
                    ColorRoute()
                }
                entry<IconsScreen> {
                    Text(text = "Unknown screen")
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
                entry<HomeScreen> {
                    HomeRoute(
                        onNavigate = {
                            backStack.add(it)
                        }
                    )
                }
                entry<SliderScreen> {
                    Text(text = "Unknown screen")
                }
            },
        )
    }
}
