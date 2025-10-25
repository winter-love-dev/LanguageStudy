package dev.love.winter.designsystem.theme

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

/**
 * Icon tokens
 *
 * Icons are graphic assets that improve usability by providing extra meaning
 * to actions and components, making them more visually appealing and easier to understand.
 *
 * Guidelines:
 * - Size: 24px base
 * - Stroke: 1.5px
 * - Use Icon grid for consistency
 */

@Immutable
data class AppIcon(
    @param:DrawableRes val filled: Int,
    @param:DrawableRes val outlined: Int,
)

@Immutable
data class GlobalIcon(
    val home: AppIcon,
    val settings: AppIcon,
    val profile: AppIcon,
    val highlights: AppIcon,
    val notification: AppIcon,
    val search: AppIcon,
)

@Immutable
data class NavigationIcon(
    val arrowUp: AppIcon,
    val arrowDown: AppIcon,
    val arrowLeft: AppIcon,
    val arrowRight: AppIcon,
    val arrowUpRight: AppIcon,
    val chevronUp: AppIcon,
    val chevronDown: AppIcon,
    val chevronLeft: AppIcon,
    val chevronRight: AppIcon,
    val close: AppIcon,
    val filter: AppIcon,
    val sort: AppIcon,
    val logout: AppIcon,
    val menu: AppIcon,
    val menuHamburger: AppIcon,
    val more: AppIcon,
    val link: AppIcon,
)

@Immutable
data class InputIcon(
    val edit: AppIcon,
    val delete: AppIcon,
    val plus: AppIcon,
    val minus: AppIcon,
    val check: AppIcon,
    val eye: AppIcon,
    val eyeOff: AppIcon,
    val heart: AppIcon,
    val star: AppIcon,
    val bookmark: AppIcon,
    val download: AppIcon,
    val upload: AppIcon,
)

@Immutable
data class DateTimeIcon(
    val calendar: AppIcon,
    val calendarDays: AppIcon,
    val clock: AppIcon,
)

@Immutable
data class MessageIcon(
    val send: AppIcon,
    val chat: AppIcon,
    val mail: AppIcon,
    val archive: AppIcon,
    val camera: AppIcon,
    val paperclip: AppIcon,
    val microphone: AppIcon,
)

@Immutable
data class PurchaseIcon(
    val bag: AppIcon,
    val cart: AppIcon,
    val tag: AppIcon,
    val creditCard: AppIcon,
    val wallet: AppIcon,
)

@Immutable
data class LocationIcon(
    val map: AppIcon,
    val mapPin: AppIcon,
    val navigation: AppIcon,
    val globe: AppIcon,
)

@Immutable
data class NotificationIcon(
    val info: AppIcon,
    val success: AppIcon,
    val warning: AppIcon,
    val error: AppIcon,
)

@Immutable
data class LogoIcon(
    val google: AppIcon,
    val facebook: AppIcon,
    val apple: AppIcon,
)

/**
 * Icon scheme for the app
 */
@Immutable
data class IconScheme(
    val global: GlobalIcon,
    val navigation: NavigationIcon,
    val input: InputIcon,
    val dateTime: DateTimeIcon,
    val message: MessageIcon,
    val purchase: PurchaseIcon,
    val location: LocationIcon,
    val notification: NotificationIcon,
    val logo: LogoIcon,
)
