package dev.love.winter.uicomponent.theme

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable

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
data class IconResource(
    @param:DrawableRes val filled: Int,
    @param:DrawableRes val outlined: Int,
)

@Immutable
data class GlobalIcon(
    val home: IconResource,
    val settings: IconResource,
    val profile: IconResource,
    val highlights: IconResource,
    val notification: IconResource,
    val search: IconResource,
)

@Immutable
data class NavigationIcon(
    val arrowUp: IconResource,
    val arrowDown: IconResource,
    val arrowLeft: IconResource,
    val arrowRight: IconResource,
    val arrowUpRight: IconResource,
    val chevronUp: IconResource,
    val chevronDown: IconResource,
    val chevronLeft: IconResource,
    val chevronRight: IconResource,
    val close: IconResource,
    val filter: IconResource,
    val sort: IconResource,
    val logout: IconResource,
    val menu: IconResource,
    val menuHamburger: IconResource,
    val more: IconResource,
    val link: IconResource,
)

@Immutable
data class InputIcon(
    val edit: IconResource,
    val delete: IconResource,
    val plus: IconResource,
    val minus: IconResource,
    val check: IconResource,
    val eye: IconResource,
    val eyeOff: IconResource,
    val heart: IconResource,
    val star: IconResource,
    val bookmark: IconResource,
    val download: IconResource,
    val upload: IconResource,
)

@Immutable
data class DateTimeIcon(
    val calendar: IconResource,
    val calendarDays: IconResource,
    val clock: IconResource,
)

@Immutable
data class MessageIcon(
    val send: IconResource,
    val chat: IconResource,
    val mail: IconResource,
    val archive: IconResource,
    val camera: IconResource,
    val paperclip: IconResource,
    val microphone: IconResource,
)

@Immutable
data class PurchaseIcon(
    val bag: IconResource,
    val cart: IconResource,
    val tag: IconResource,
    val creditCard: IconResource,
    val wallet: IconResource,
)

@Immutable
data class LocationIcon(
    val map: IconResource,
    val mapPin: IconResource,
    val navigation: IconResource,
    val globe: IconResource,
)

@Immutable
data class NotificationIcon(
    val info: IconResource,
    val success: IconResource,
    val warning: IconResource,
    val error: IconResource,
)

@Immutable
data class LogoIcon(
    val google: IconResource,
    val facebook: IconResource,
    val apple: IconResource,
)
