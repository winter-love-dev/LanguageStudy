package dev.love.winter.designsystem.component.button

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.love.winter.designsystem.component.button.spec.ButtonColors
import dev.love.winter.designsystem.component.button.spec.ButtonIcon
import dev.love.winter.designsystem.component.button.spec.ButtonShape
import dev.love.winter.designsystem.component.button.spec.ButtonState
import dev.love.winter.designsystem.component.button.spec.ButtonType
import dev.love.winter.designsystem.interaction.PressableState
import dev.love.winter.designsystem.interaction.pressable
import dev.love.winter.designsystem.interaction.rememberPressedState
import dev.love.winter.designsystem.interaction.updateScale
import dev.love.winter.designsystem.theme.WinterTheme

private const val PRESSED_SCALE = 0.95f
private const val DURATION_ANIMATION = 100

@Composable
fun Button(
    label: String,
    onPress: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ButtonIcon? = null,
    type: ButtonType = ButtonType.Primary,
    state: ButtonState = ButtonState.Default,
    shape: ButtonShape = ButtonShape.Medium,
    enabled: Boolean = true,
) {
    val pressState: PressableState = rememberPressedState()

    val currentState: ButtonState = if (enabled) {
        state
    } else {
        ButtonState.Disabled
    }

    val buttonEnabled: Boolean =
        enabled && currentState != ButtonState.Disabled

    val pressedWhenDefaultState: Boolean =
        (buttonEnabled && pressState.pressed && currentState == ButtonState.Default) ||
        currentState == ButtonState.Active

    val buttonColors: ButtonColors = if (pressedWhenDefaultState) {
        type.colors(ButtonState.Active)
    } else {
        type.colors(currentState)
    }

    val containerColor by animateColorAsState(
        targetValue = buttonColors.container,
        animationSpec = tween(durationMillis = DURATION_ANIMATION),
        label = "containerColor",
    )
    val textColor by animateColorAsState(
        targetValue = buttonColors.content,
        animationSpec = tween(durationMillis = DURATION_ANIMATION),
        label = "textColor",
    )
    val iconColor by animateColorAsState(
        targetValue = buttonColors.icon,
        animationSpec = tween(durationMillis = DURATION_ANIMATION),
        label = "iconColor",
    )

    Row(
        modifier = modifier
            .updateScale(
                pressed = pressedWhenDefaultState,
                pressedScale = PRESSED_SCALE,
            )
            .clip(shape.shape())
            .defaultMinSize(minHeight = shape.height)
            .pressable(
                enabled = buttonEnabled,
                pressState = pressState,
                onPress = onPress,
            )
            .background(containerColor)
            .padding(
                vertical = shape.paddingVertical(),
                horizontal = shape.paddingHorizontal(),
            )
            .semantics {
                role = Role.Button
                stateDescription = "$label button is $currentState"
            },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (icon is ButtonIcon.Leading) {
            Icon(
                painter = painterResource(icon.resource),
                contentDescription = icon.contentDescription,
                modifier = Modifier.size(shape.iconSize),
                tint = iconColor,
            )
            Spacer(Modifier.width(WinterTheme.spacing.extraSmall))
        }
        Text(
            text = label,
            style = shape.textStyle(),
            color = textColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        if (icon is ButtonIcon.Trailing) {
            Spacer(Modifier.width(WinterTheme.spacing.extraSmall))
            Icon(
                painter = painterResource(icon.resource),
                contentDescription = icon.contentDescription,
                modifier = Modifier.size(shape.iconSize),
                tint = iconColor,
            )
        }
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun Preview() {
    WinterTheme {
        Row(
            Modifier
                .background(color = WinterTheme.color.background)
                .padding(all = WinterTheme.spacing.small)
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
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    heightDp = 1250,
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    heightDp = 1250,
)
@Composable
private fun Catalog() {
    WinterTheme {
        Column {
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
                    )
                    Row(
                        Modifier
                            .background(color = WinterTheme.color.background)
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
            }
        }
    }
}
