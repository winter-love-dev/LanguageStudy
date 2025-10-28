package dev.love.winter.designsystem.component.button

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
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
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.love.winter.designsystem.component.button.spec.ButtonColors
import dev.love.winter.designsystem.component.button.spec.ButtonIcon
import dev.love.winter.designsystem.component.button.spec.ButtonShape
import dev.love.winter.designsystem.component.button.spec.ButtonState
import dev.love.winter.designsystem.component.button.spec.ButtonType
import dev.love.winter.designsystem.theme.WinterTheme

/**
 * Buttons communicate actions users can perform by tapping it.
 * They are typically placed where the user can take
 * any action throughout your UI – such as in Dialogs, Forms, Banners, Cards, etc.
 *
 * Use different types of buttons to reflect the hierarchy of actions.
 */

private const val SCALE_DEFAULT = 1.0f
private const val SCALE_PRESSED = 0.98f

@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ButtonIcon? = null,
    type: ButtonType = ButtonType.Primary,
    state: ButtonState = ButtonState.Default,
    shape: ButtonShape = ButtonShape.Medium,
    enabled: Boolean = true,
) {
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressed: State<Boolean> = interactionSource.collectIsPressedAsState()
    val effectiveEnabled: Boolean = enabled && state != ButtonState.Disabled
    val pressEffect: Boolean =
        (effectiveEnabled && pressed.value && state == ButtonState.Default) ||
        state == ButtonState.Active
    val scale: State<Float> = animateFloatAsState(
        targetValue = if (pressEffect) {
            SCALE_PRESSED
        } else {
            SCALE_DEFAULT
        },
    )

    val currentState: ButtonState = if (effectiveEnabled && pressed.value) {
        ButtonState.Active
    } else {
        state
    }
    val currentColors: ButtonColors = type.colors(currentState)

    Row(
        modifier = (if (effectiveEnabled) {
                modifier.scale(scale.value)
            } else {
                modifier
            })
            .clip(shape.shape())
            .defaultMinSize(minHeight = shape.height)
            .background(currentColors.container)
            .semantics {
                stateDescription = when (state) {
                    ButtonState.Default -> {
                        state.toString()
                    }
                    ButtonState.Active -> {
                        state.toString()
                    }
                    ButtonState.Disabled -> {
                        state.toString()
                    }
                }
            }
            .clickable(
                role = Role.Button,
                enabled = effectiveEnabled,
                onClick = onClick,
                interactionSource = interactionSource,
                indication = null,
            )
            .padding(
                vertical = shape.paddingVertical(),
                horizontal = shape.paddingHorizontal(),
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (icon is ButtonIcon.Leading) {
            Icon(
                painter = painterResource(icon.resource),
                contentDescription = icon.contentDescription,
                modifier = Modifier.size(shape.iconSize),
                tint = currentColors.icon,
            )
            Spacer(Modifier.width(WinterTheme.spacing.extraSmall))
        }
        Text(
            text = label,
            style = shape.textStyle(),
            color = currentColors.content,
        )
        if (icon is ButtonIcon.Trailing) {
            Spacer(Modifier.width(WinterTheme.spacing.extraSmall))
            Icon(
                painter = painterResource(icon.resource),
                contentDescription = icon.contentDescription,
                modifier = Modifier.size(shape.iconSize),
                tint = currentColors.icon,
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
                onClick = {},
                shape = ButtonShape.Small,
            )
            Button(
                label = "Button",
                onClick = {},
                icon = ButtonIcon.Leading(
                    resource = WinterTheme.icon.input.plus.outlined,
                    contentDescription = "Settings",
                )
            )
            Button(
                label = "Button",
                onClick = {},
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
                            onClick = {},
                        )
                        Button(
                            label = "Active",
                            type = buttonType,
                            state = ButtonState.Active,
                            shape = buttonShape,
                            onClick = {},
                        )
                        Button(
                            label = "Disabled",
                            type = buttonType,
                            state = ButtonState.Disabled,
                            shape = buttonShape,
                            onClick = {},
                        )
                    }
                }
            }
        }
    }
}
