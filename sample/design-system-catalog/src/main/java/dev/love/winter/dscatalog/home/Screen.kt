package dev.love.winter.dscatalog.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation3.runtime.NavKey
import dev.love.winter.designsystem.component.button.Button
import dev.love.winter.designsystem.component.button.spec.ButtonIcon
import dev.love.winter.designsystem.component.button.spec.ButtonShape
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.dscatalog.Catalog
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HomeRoute(
    onNavigate: (screen: NavKey) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ViewModel = hiltViewModel(),
) {
    LaunchedEffect(viewModel.sideEffect) {
        viewModel.sideEffect.collectLatest { sideEffect ->
            when (sideEffect) {
                is SideEffect.NavigateTo -> {
                    onNavigate(sideEffect.catalog)
                }
            }
        }
    }
    HomeScreen(
        modifier = modifier,
        onClick = {
            viewModel.onEvent(Event.OnCatalogItemClick(it))
        },
    )
}

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
    onClick: (item: Catalog) -> Unit = { },
) {
    Box(modifier) {
        Content(
            modifier = Modifier
                .fillMaxSize()
                .background(color = WinterTheme.color.background),
            onClick = onClick,
        )
        BottomBar(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    onClick: (item: Catalog) -> Unit,
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(
            horizontal = WinterTheme.spacing.small,
        ),
    ) {
        item {
            Text(
                text = "👋 About",
                style = WinterTheme.typography.displaySmall,
                color = WinterTheme.color.textTitle,
                modifier = Modifier.padding(
                    top = WinterTheme.spacing.small,
                ),
            )
        }
        item {
            Text(
                text = "LanguageStudy",
                style = WinterTheme.typography.displayLarge,
                color = WinterTheme.color.textBrand,
                modifier = Modifier.padding(
                    top = WinterTheme.spacing.small,
                ),
            )
        }
        item {
            Text(
                text = "Design System",
                style = WinterTheme.typography.displayLarge,
                color = WinterTheme.color.textTitle,
            )
        }
        item {
            Text(
                text = "A comprehensive catalog of\n" +
                        "components and styles",
                style = WinterTheme.typography.displaySmall,
                color = WinterTheme.color.textTitle,
                modifier = Modifier.padding(
                    top = WinterTheme.spacing.small,
                ),
            )
        }
        item {
            Divider()
        }
        stickyHeader {
            SectionTitle(text = "🎨  DESIGN TOKENS")
        }
        items(
            items = Catalog.designTokenEntries,
            key = { it.toString() },
        ) { item ->
            Button(
                label = item.toString(),
                onPress = {
                    onClick(item)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = WinterTheme.spacing.small),
            )
        }
        item {
            Divider()
        }
        stickyHeader {
            SectionTitle(text = "🧩  COMPONENTS")
        }
        items(
            items = Catalog.componentEntries.chunked(2),
            key = { it.first().toString() },
        ) { itemPair ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = WinterTheme.spacing.small),
                horizontalArrangement = Arrangement.spacedBy(
                    space = WinterTheme.spacing.small,
                ),
            ) {
                itemPair.forEach { item ->
                    Button(
                        label = item.toString(),
                        onPress = {
                            onClick(item)
                        },
                        enabled = item.destination != null,
                        modifier = Modifier.weight(1f),
                    )
                }
            }
        }
        item {
            Divider()
        }
        item {
            Spacer(Modifier.height(WinterTheme.spacing.extraExtraLarge))
        }
    }
}

@Composable
private fun SectionTitle(text: String) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = WinterTheme.color.background,
    ) {
        Text(
            text = text,
            style = WinterTheme.typography.titleLarge,
            color = WinterTheme.color.textTitle,
        )
    }
}

@Composable
private fun BottomBar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .clip(shape = WinterTheme.borderRadius.large)
            .background(color = WinterTheme.color.backgroundContainer)
            .padding(
                top = WinterTheme.spacing.small,
                bottom = WinterTheme.spacing.large,
            ),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        Text(
            text = createHighlightedText(
                text = "Designed & Developed by Winter\n© 2025 All rights reserved.",
                highlightWord = "Winter",
                highlightColor = WinterTheme.color.textBrand,
                baseStyle = WinterTheme.typography.bodySmall,
            ),
            style = WinterTheme.typography.bodySmall,
            color = WinterTheme.color.textTitle,
        )
        Button(
            label = "option",
            onPress = { },
            shape = ButtonShape.Small,
            icon = ButtonIcon.Leading(
                resource = WinterTheme.icon.global.settings.outlined,
                contentDescription = "Option button icon",
            )
        )
    }
}

@Composable
private fun Divider() {
    HorizontalDivider(
        color = WinterTheme.color.strokeNeutral,
        modifier = Modifier.padding(
            top = WinterTheme.spacing.large,
            bottom = WinterTheme.spacing.medium,
        )
    )
}

@Composable
private fun createHighlightedText(
    text: String,
    highlightWord: String,
    highlightColor: Color,
    baseStyle: TextStyle,
): AnnotatedString {
    return buildAnnotatedString {
        val baseSpanStyle = baseStyle.toSpanStyle()
        val startIndex = text.indexOf(highlightWord)
        if (startIndex != -1) {
            withStyle(style = baseSpanStyle) {
                append(text.substring(0, startIndex))
            }
            withStyle(style = baseSpanStyle.copy(color = highlightColor)) {
                append(highlightWord)
            }
            withStyle(style = baseSpanStyle) {
                append(text.substring(startIndex + highlightWord.length))
            }
        } else {
            withStyle(style = baseSpanStyle) {
                append(text)
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    WinterTheme {
        HomeScreen()
    }
}

@Preview
@Composable
private fun PreviewDark() {
    WinterTheme(darkTheme = true) {
        HomeScreen()
    }
}
