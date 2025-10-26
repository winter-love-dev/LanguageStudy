package dev.love.winter.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf

internal val LocalDarkTheme = compositionLocalOf { false }

@Composable
fun WinterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val designSystemColorTheme: Colors = if (darkTheme) {
        DarkColorTheme
    } else {
        LightColorTheme
    }
    val materialColorScheme: ColorScheme = if (darkTheme) {
        MaterialDarkColorTheme
    } else {
        MaterialLightColorTheme
    }
    CompositionLocalProvider(
        LocalDarkTheme provides darkTheme,
        LocalColors provides designSystemColorTheme,
        LocalTypography provides TypographyTheme,
        LocalSpacing provides SpacingTheme,
        LocalBorderRadius provides BorderRadiusTheme,
        LocalIcons provides IconTheme,
    ) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            content = content,
        )
    }
}

object WinterTheme {
    val color: Colors
        @Composable
        get() = LocalColors.current

    val typography: Typography
        @Composable
        get() = LocalTypography.current

    val spacing: Spacing
        @Composable
        get() = LocalSpacing.current

    val borderRadius: BorderRadius
        @Composable
        get() = LocalBorderRadius.current

    val icon: Icon
        @Composable
        get() = LocalIcons.current
}
