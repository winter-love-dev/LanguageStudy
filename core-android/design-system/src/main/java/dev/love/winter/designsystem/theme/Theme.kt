package dev.love.winter.designsystem.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = Primary500,
    onPrimary = Color.White,
    primaryContainer = Primary100,
    onPrimaryContainer = Primary900,
    secondary = Grey600,
    onSecondary = Color.White,
    secondaryContainer = Grey200,
    onSecondaryContainer = Grey900,
    tertiary = Green600,
    onTertiary = Color.White,
    tertiaryContainer = Green100,
    onTertiaryContainer = Green900,
    error = Red500,
    onError = Color.White,
    errorContainer = Red100,
    onErrorContainer = Red900,
    background = Grey50,
    onBackground = Grey900,
    surface = Grey100,
    onSurface = Grey900,
    surfaceVariant = Grey200,
    onSurfaceVariant = Grey700,
    outline = Grey400,
    outlineVariant = Grey300,
    scrim = Grey900,
)

private val DarkColorScheme = darkColorScheme(
    primary = Primary400,
    onPrimary = Primary900,
    primaryContainer = Primary800,
    onPrimaryContainer = Primary100,
    secondary = Grey400,
    onSecondary = Grey900,
    secondaryContainer = Grey700,
    onSecondaryContainer = Grey100,
    tertiary = Green400,
    onTertiary = Green900,
    tertiaryContainer = Green800,
    onTertiaryContainer = Green100,
    error = Red400,
    onError = Red900,
    errorContainer = Red800,
    onErrorContainer = Red100,
    background = Grey900,
    onBackground = Grey50,
    surface = Grey800,
    onSurface = Grey50,
    surfaceVariant = Grey700,
    onSurfaceVariant = Grey300,
    outline = Grey600,
    outlineVariant = Grey700,
    scrim = Grey900,
)

val LocalDarkTheme = compositionLocalOf { false }

@Composable
fun WinterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }
    val appColorScheme = if (darkTheme) {
        DarkAppColorScheme
    } else {
        LightAppColorScheme
    }

    if (!LocalInspectionMode.current) {
        val view = LocalView.current
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = !darkTheme
        }
    }

    CompositionLocalProvider(
        LocalDarkTheme provides darkTheme,
        LocalAppColorScheme provides appColorScheme,
        LocalTypography provides Typography,
        LocalSpacing provides Spacing,
        LocalBorderRadius provides BorderRadius,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content,
        )
    }
}

object AppTheme {
    val colors: ColorScheme
        @Composable
        get() = LocalAppColorScheme.current

    val typography: TypographyScheme
        @Composable
        get() = LocalTypography.current

    val spacing: SpacingScheme
        @Composable
        get() = LocalSpacing.current

    val borderRadius: BorderRadiusScheme
        @Composable
        get() = LocalBorderRadius.current
}
