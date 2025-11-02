package dev.love.winter.uicomponent.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import dev.love.winter.designsystem.R

@Immutable
data class Icon(
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

val IconTheme = Icon(
    global = GlobalIcon(
        home = IconResource(
            filled = R.drawable.ic_home_filled,
            outlined = R.drawable.ic_home_outlined,
        ),
        settings = IconResource(
            filled = R.drawable.ic_settings_filled,
            outlined = R.drawable.ic_settings_outlined,
        ),
        profile = IconResource(
            filled = R.drawable.ic_profile_filled,
            outlined = R.drawable.ic_profile_outlined,
        ),
        highlights = IconResource(
            filled = R.drawable.ic_highlights_filled,
            outlined = R.drawable.ic_highlights_outlined,
        ),
        notification = IconResource(
            filled = R.drawable.ic_notification_filled,
            outlined = R.drawable.ic_notification_outlined,
        ),
        search = IconResource(
            filled = R.drawable.ic_search,
            outlined = R.drawable.ic_search,
        ),
    ),
    navigation = NavigationIcon(
        arrowUp = IconResource(
            filled = R.drawable.ic_arrow_up,
            outlined = R.drawable.ic_arrow_up,
        ),
        arrowDown = IconResource(
            filled = R.drawable.ic_arrow_down,
            outlined = R.drawable.ic_arrow_down,
        ),
        arrowLeft = IconResource(
            filled = R.drawable.ic_arrow_left,
            outlined = R.drawable.ic_arrow_left,
        ),
        arrowRight = IconResource(
            filled = R.drawable.ic_arrow_right,
            outlined = R.drawable.ic_arrow_right,
        ),
        arrowUpRight = IconResource(
            filled = R.drawable.ic_arrow_up_right,
            outlined = R.drawable.ic_arrow_up_right,
        ),
        chevronUp = IconResource(
            filled = R.drawable.ic_chevron_up,
            outlined = R.drawable.ic_chevron_up,
        ),
        chevronDown = IconResource(
            filled = R.drawable.ic_chevron_down,
            outlined = R.drawable.ic_chevron_down,
        ),
        chevronLeft = IconResource(
            filled = R.drawable.ic_chevron_left,
            outlined = R.drawable.ic_chevron_left,
        ),
        chevronRight = IconResource(
            filled = R.drawable.ic_chevron_right,
            outlined = R.drawable.ic_chevron_right,
        ),
        close = IconResource(
            filled = R.drawable.ic_close,
            outlined = R.drawable.ic_close,
        ),
        filter = IconResource(
            filled = R.drawable.ic_filter_filled,
            outlined = R.drawable.ic_filter_outlined,
        ),
        sort = IconResource(
            filled = R.drawable.ic_sort,
            outlined = R.drawable.ic_sort,
        ),
        logout = IconResource(
            filled = R.drawable.ic_logout,
            outlined = R.drawable.ic_logout,
        ),
        menu = IconResource(
            filled = R.drawable.ic_menu_filled,
            outlined = R.drawable.ic_menu_outlined,
        ),
        menuHamburger = IconResource(
            filled = R.drawable.ic_menu_hamburger,
            outlined = R.drawable.ic_menu_hamburger,
        ),
        more = IconResource(
            filled = R.drawable.ic_more,
            outlined = R.drawable.ic_more,
        ),
        link = IconResource(
            filled = R.drawable.ic_link,
            outlined = R.drawable.ic_link,
        ),
    ),
    input = InputIcon(
        edit = IconResource(
            filled = R.drawable.ic_edit_filled,
            outlined = R.drawable.ic_edit_outlined,
        ),
        delete = IconResource(
            filled = R.drawable.ic_delete_filled,
            outlined = R.drawable.ic_delete_outlined,
        ),
        plus = IconResource(
            filled = R.drawable.ic_plus,
            outlined = R.drawable.ic_plus,
        ),
        minus = IconResource(
            filled = R.drawable.ic_minus,
            outlined = R.drawable.ic_minus,
        ),
        check = IconResource(
            filled = R.drawable.ic_check,
            outlined = R.drawable.ic_check,
        ),
        eye = IconResource(
            filled = R.drawable.ic_eye_filled,
            outlined = R.drawable.ic_eye_outlined,
        ),
        eyeOff = IconResource(
            filled = R.drawable.ic_eye_off_filled,
            outlined = R.drawable.ic_eye_off_outlined,
        ),
        heart = IconResource(
            filled = R.drawable.ic_heart_filled,
            outlined = R.drawable.ic_heart_outlined,
        ),
        star = IconResource(
            filled = R.drawable.ic_star_filled,
            outlined = R.drawable.ic_star_outlined,
        ),
        bookmark = IconResource(
            filled = R.drawable.ic_bookmark_filled,
            outlined = R.drawable.ic_bookmark_outlined,
        ),
        download = IconResource(
            filled = R.drawable.ic_download,
            outlined = R.drawable.ic_download,
        ),
        upload = IconResource(
            filled = R.drawable.ic_upload,
            outlined = R.drawable.ic_upload,
        ),
    ),
    dateTime = DateTimeIcon(
        calendar = IconResource(
            filled = R.drawable.ic_calendar_filled,
            outlined = R.drawable.ic_calendar_outlined,
        ),
        calendarDays = IconResource(
            filled = R.drawable.ic_calendar_days_filled,
            outlined = R.drawable.ic_calendar_days_outlined,
        ),
        clock = IconResource(
            filled = R.drawable.ic_clock_filled,
            outlined = R.drawable.ic_clock_outlined,
        ),
    ),
    message = MessageIcon(
        send = IconResource(
            filled = R.drawable.ic_send_filled,
            outlined = R.drawable.ic_send_outlined,
        ),
        chat = IconResource(
            filled = R.drawable.ic_chat_filled,
            outlined = R.drawable.ic_chat_outlined,
        ),
        mail = IconResource(
            filled = R.drawable.ic_mail_filled,
            outlined = R.drawable.ic_mail_outlined,
        ),
        archive = IconResource(
            filled = R.drawable.ic_archive_filled,
            outlined = R.drawable.ic_archive_outlined,
        ),
        camera = IconResource(
            filled = R.drawable.ic_camera_filled,
            outlined = R.drawable.ic_camera_outlined,
        ),
        paperclip = IconResource(
            filled = R.drawable.ic_paperclip,
            outlined = R.drawable.ic_paperclip,
        ),
        microphone = IconResource(
            filled = R.drawable.ic_microphone_filled,
            outlined = R.drawable.ic_microphone_outlined,
        ),
    ),
    purchase = PurchaseIcon(
        bag = IconResource(
            filled = R.drawable.ic_bag_filled,
            outlined = R.drawable.ic_bag_outlined,
        ),
        cart = IconResource(
            filled = R.drawable.ic_cart_filled,
            outlined = R.drawable.ic_cart_outlined,
        ),
        tag = IconResource(
            filled = R.drawable.ic_tag_filled,
            outlined = R.drawable.ic_tag_outlined,
        ),
        creditCard = IconResource(
            filled = R.drawable.ic_credit_card_filled,
            outlined = R.drawable.ic_credit_card_outlined,
        ),
        wallet = IconResource(
            filled = R.drawable.ic_wallet_filled,
            outlined = R.drawable.ic_wallet_outlined,
        ),
    ),
    location = LocationIcon(
        map = IconResource(
            filled = R.drawable.ic_map_filled,
            outlined = R.drawable.ic_map_outlined,
        ),
        mapPin = IconResource(
            filled = R.drawable.ic_map_pin_filled,
            outlined = R.drawable.ic_map_pin_outlined,
        ),
        navigation = IconResource(
            filled = R.drawable.ic_navigation_filled,
            outlined = R.drawable.ic_navigation_outlined,
        ),
        globe = IconResource(
            filled = R.drawable.ic_globe_filled,
            outlined = R.drawable.ic_globe_outlined,
        ),
    ),
    notification = NotificationIcon(
        info = IconResource(
            filled = R.drawable.ic_info_filled,
            outlined = R.drawable.ic_info_outlined,
        ),
        success = IconResource(
            filled = R.drawable.ic_success_filled,
            outlined = R.drawable.ic_success_outlined,
        ),
        warning = IconResource(
            filled = R.drawable.ic_warning_filled,
            outlined = R.drawable.ic_warning_outlined,
        ),
        error = IconResource(
            filled = R.drawable.ic_error_filled,
            outlined = R.drawable.ic_error_outlined,
        ),
    ),
    logo = LogoIcon(
        google = IconResource(
            filled = R.drawable.ic_logo_google,
            outlined = R.drawable.ic_logo_google,
        ),
        facebook = IconResource(
            filled = R.drawable.ic_logo_facebook,
            outlined = R.drawable.ic_logo_facebook,
        ),
        apple = IconResource(
            filled = R.drawable.ic_logo_apple,
            outlined = R.drawable.ic_logo_apple,
        ),
    ),
)

internal val LocalIcons = staticCompositionLocalOf {
    IconTheme
}
