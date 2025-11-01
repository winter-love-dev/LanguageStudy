package dev.love.winter.dscatalog.catalog.button

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.love.winter.designsystem.component.button.Button
import dev.love.winter.designsystem.component.button.spec.ButtonIcon
import dev.love.winter.designsystem.component.button.spec.ButtonShape
import dev.love.winter.designsystem.component.button.spec.ButtonState
import dev.love.winter.designsystem.component.button.spec.ButtonType
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun ButtonRoute(
    modifier: Modifier = Modifier,
) {
    ButtonScreen(
        modifier = modifier,
    )
}

@Composable
fun ButtonScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(
                horizontal = WinterTheme.spacing.small,
                vertical = WinterTheme.spacing.extraExtraLarge,
            ),
    ) {
        TopSection()
        BottomSection()
    }
}

/**
 * - Summary
 * - Primary
 * - Secondary
 * - Tertiary
 */
@Composable
fun TopSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Text(
            text = "Summary",
            style = WinterTheme.typography.titleLarge,
        )
        Row(
            Modifier
                .background(color = WinterTheme.color.background)
                .padding(top = WinterTheme.spacing.medium)
                .width(350.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Button(
                label = "Button",
                onPress = {},
                shape = ButtonShape.Small,
            )
            Button(
                label = "Button",
                onPress = {},
                icon = ButtonIcon.Leading(
                    resource = WinterTheme.icon.input.plus.outlined,
                    contentDescription = "Settings",
                )
            )
            Button(
                label = "Button",
                onPress = {},
                shape = ButtonShape.Large,
                icon = ButtonIcon.Trailing(
                    resource = WinterTheme.icon.input.plus.outlined,
                    contentDescription = "Settings",
                )
            )
        }
        Divider()
        ButtonTypeSection(
            buttonTypes = persistentListOf(
                ButtonType.Primary,
                ButtonType.Secondary,
            ),
        )
    }
}

/**
 * - Brand
 * - Critical
 */
@Composable
private fun BottomSection(
    modifier: Modifier = Modifier,
) {
    ButtonTypeSection(
        modifier = modifier,
        buttonTypes = persistentListOf(
            ButtonType.Tertiary,
            ButtonType.Brand,
            ButtonType.Critical,
        ),
    )
}

@Composable
private fun ButtonTypeSection(
    buttonTypes: ImmutableList<ButtonType>,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        buttonTypes.forEach { buttonType ->
            Text(
                text = buttonType.toString(),
                style = WinterTheme.typography.titleLarge,
            )
            listOf(
                ButtonShape.Small,
                ButtonShape.Medium,
                ButtonShape.Large,
            ).forEach { buttonShape ->
                Text(
                    text = buttonShape.toString(),
                    style = WinterTheme.typography.titleSmall,
                    modifier = Modifier.padding(
                        top = WinterTheme.spacing.small,
                    )
                )
                Row(
                    modifier = Modifier.padding(
                        vertical = WinterTheme.spacing.extraSmall,
                    ),
                    horizontalArrangement = Arrangement.spacedBy(WinterTheme.spacing.small),
                ) {
                    Button(
                        label = "Default",
                        type = buttonType,
                        state = ButtonState.Default,
                        shape = buttonShape,
                        onPress = {},
                    )
                    Button(
                        label = "Active",
                        type = buttonType,
                        state = ButtonState.Active,
                        shape = buttonShape,
                        onPress = {},
                    )
                    Button(
                        label = "Disabled",
                        type = buttonType,
                        state = ButtonState.Disabled,
                        shape = buttonShape,
                        onPress = {},
                    )
                }
                Text(
                    text = "$buttonShape - with image",
                    style = WinterTheme.typography.titleSmall,
                    modifier = Modifier.padding(
                        top = WinterTheme.spacing.small,
                    )
                )
                Row(
                    modifier = Modifier.padding(
                        vertical = WinterTheme.spacing.extraSmall,
                    ),
                    horizontalArrangement = Arrangement.spacedBy(WinterTheme.spacing.small),
                ) {
                    Button(
                        label = "Leading",
                        type = buttonType,
                        state = ButtonState.Default,
                        shape = buttonShape,
                        icon = ButtonIcon.Leading(
                            resource = WinterTheme.icon.input.plus.outlined,
                            contentDescription = "Settings",
                        ),
                        onPress = {},
                    )
                    Button(
                        label = "Trailing",
                        type = buttonType,
                        state = ButtonState.Default,
                        shape = buttonShape,
                        icon = ButtonIcon.Trailing(
                            resource = WinterTheme.icon.input.plus.outlined,
                            contentDescription = "Settings",
                        ),
                        onPress = {},
                    )
                }
            }
            Divider()
        }
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

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 1450,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 1450,
)
@Composable
private fun Preview1() {
    WinterTheme {
        Box(
            Modifier.background(WinterTheme.color.background)
        ) {
            TopSection(
                modifier = Modifier.padding(
                    horizontal = WinterTheme.spacing.small,
                    vertical = WinterTheme.spacing.extraExtraLarge,
                ),
            )
        }
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 1900,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 1900,
)
@Composable
private fun Preview2() {
    WinterTheme {
        Box(
            Modifier.background(WinterTheme.color.background)
        ) {
            BottomSection(
                modifier = Modifier.padding(
                    horizontal = WinterTheme.spacing.small,
                    vertical = WinterTheme.spacing.extraExtraLarge,
                ),
            )
        }
    }
}
