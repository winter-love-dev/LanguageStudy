package dev.love.winter.dscatalog.catalog.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.love.winter.designsystem.component.button.Button
import dev.love.winter.designsystem.component.button.spec.ButtonShape
import dev.love.winter.designsystem.component.button.spec.ButtonState
import dev.love.winter.designsystem.component.button.spec.ButtonType
import dev.love.winter.designsystem.theme.WinterTheme

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
            .padding(horizontal = WinterTheme.spacing.small)
            .verticalScroll(rememberScrollState()),
    ) {
        Spacer(
            Modifier.height(WinterTheme.spacing.extraExtraLarge)
        )
        listOf(
            ButtonType.Primary,
            ButtonType.Secondary,
            ButtonType.Tertiary,
            ButtonType.Brand,
            ButtonType.Critical,
        ).forEach { buttonType ->
            Text(
                text = buttonType.toString(),
                style = WinterTheme.typography.titleLarge,
                color = WinterTheme.color.textOnColorDark,
            )
            listOf(
                ButtonShape.Small,
                ButtonShape.Medium,
                ButtonShape.Large,
            ).forEach { buttonShape ->
                Text(
                    text = buttonShape.toString(),
                    style = WinterTheme.typography.titleSmall,
                    color = WinterTheme.color.textOnColorDark,
                    modifier = Modifier.padding(
                        top = WinterTheme.spacing.small,
                    )
                )
                Row(
                    modifier = Modifier
                        .padding(
                            vertical = WinterTheme.spacing.extraSmall,
                            horizontal = WinterTheme.spacing.small,
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
            }
            Divider()
        }
        Spacer(
            Modifier.height(WinterTheme.spacing.extraExtraLarge)
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
