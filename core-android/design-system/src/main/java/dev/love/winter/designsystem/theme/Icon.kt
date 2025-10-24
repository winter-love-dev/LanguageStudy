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

// TODO: Replace with actual drawable resources
internal val Icon = IconScheme(
    global = GlobalIcon(
        home = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_home_filled, R.drawable.ic_home_outlined
        settings = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_settings_filled, R.drawable.ic_settings_outlined
        profile = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_profile_filled, R.drawable.ic_profile_outlined
        highlights = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_highlights_filled, R.drawable.ic_highlights_outlined
        notification = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_notification_filled, R.drawable.ic_notification_outlined
        search = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_search_filled, R.drawable.ic_search_outlined
    ),
    navigation = NavigationIcon(
        arrowUp = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_arrow_up_filled, R.drawable.ic_arrow_up_outlined
        arrowDown = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_arrow_down_filled, R.drawable.ic_arrow_down_outlined
        arrowLeft = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_arrow_left_filled, R.drawable.ic_arrow_left_outlined
        arrowRight = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_arrow_right_filled, R.drawable.ic_arrow_right_outlined
        arrowUpRight = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_arrow_up_right_filled, R.drawable.ic_arrow_up_right_outlined
        chevronUp = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_chevron_up_filled, R.drawable.ic_chevron_up_outlined
        chevronDown = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_chevron_down_filled, R.drawable.ic_chevron_down_outlined
        chevronLeft = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_chevron_left_filled, R.drawable.ic_chevron_left_outlined
        chevronRight = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_chevron_right_filled, R.drawable.ic_chevron_right_outlined
        close = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_close_filled, R.drawable.ic_close_outlined
        filter = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_filter_filled, R.drawable.ic_filter_outlined
        sort = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_sort_filled, R.drawable.ic_sort_outlined
        logout = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_logout_filled, R.drawable.ic_logout_outlined
        menu = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_menu_filled, R.drawable.ic_menu_outlined
        menuHamburger = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_menu_hamburger_filled, R.drawable.ic_menu_hamburger_outlined
        more = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_more_filled, R.drawable.ic_more_outlined
        link = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_link_filled, R.drawable.ic_link_outlined
    ),
    input = InputIcon(
        edit = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_edit_filled, R.drawable.ic_edit_outlined
        delete = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_delete_filled, R.drawable.ic_delete_outlined
        plus = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_plus_filled, R.drawable.ic_plus_outlined
        minus = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_minus_filled, R.drawable.ic_minus_outlined
        check = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_check_filled, R.drawable.ic_check_outlined
        eye = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_eye_filled, R.drawable.ic_eye_outlined
        eyeOff = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_eye_off_filled, R.drawable.ic_eye_off_outlined
        heart = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_heart_filled, R.drawable.ic_heart_outlined
        star = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_star_filled, R.drawable.ic_star_outlined
        bookmark = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_bookmark_filled, R.drawable.ic_bookmark_outlined
        download = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_download_filled, R.drawable.ic_download_outlined
        upload = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_upload_filled, R.drawable.ic_upload_outlined
    ),
    dateTime = DateTimeIcon(
        calendar = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_calendar_filled, R.drawable.ic_calendar_outlined
        calendarDays = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_calendar_days_filled, R.drawable.ic_calendar_days_outlined
        clock = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_clock_filled, R.drawable.ic_clock_outlined
    ),
    message = MessageIcon(
        send = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_send_filled, R.drawable.ic_send_outlined
        chat = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_chat_filled, R.drawable.ic_chat_outlined
        mail = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_mail_filled, R.drawable.ic_mail_outlined
        archive = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_archive_filled, R.drawable.ic_archive_outlined
        camera = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_camera_filled, R.drawable.ic_camera_outlined
        paperclip = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_paperclip_filled, R.drawable.ic_paperclip_outlined
        microphone = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_microphone_filled, R.drawable.ic_microphone_outlined
    ),
    purchase = PurchaseIcon(
        bag = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_bag_filled, R.drawable.ic_bag_outlined
        cart = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_cart_filled, R.drawable.ic_cart_outlined
        tag = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_tag_filled, R.drawable.ic_tag_outlined
        creditCard = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_credit_card_filled, R.drawable.ic_credit_card_outlined
        wallet = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_wallet_filled, R.drawable.ic_wallet_outlined
    ),
    location = LocationIcon(
        map = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_map_filled, R.drawable.ic_map_outlined
        mapPin = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_map_pin_filled, R.drawable.ic_map_pin_outlined
        navigation = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_navigation_filled, R.drawable.ic_navigation_outlined
        globe = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_globe_filled, R.drawable.ic_globe_outlined
    ),
    notification = NotificationIcon(
        info = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_info_filled, R.drawable.ic_info_outlined
        success = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_success_filled, R.drawable.ic_success_outlined
        warning = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_warning_filled, R.drawable.ic_warning_outlined
        error = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_error_filled, R.drawable.ic_error_outlined
    ),
    logo = LogoIcon(
        google = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_logo_google_filled, R.drawable.ic_logo_google_outlined
        facebook = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_logo_facebook_filled, R.drawable.ic_logo_facebook_outlined
        apple = AppIcon(filled = 0, outlined = 0), // R.drawable.ic_logo_apple_filled, R.drawable.ic_logo_apple_outlined
    ),
)

internal val LocalIcons = staticCompositionLocalOf {
    Icon
}
