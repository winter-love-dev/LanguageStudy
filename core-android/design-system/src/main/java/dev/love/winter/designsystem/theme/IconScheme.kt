package dev.love.winter.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import dev.love.winter.designsystem.R

internal val Icon = IconScheme(
    global = GlobalIcon(
        home = AppIcon(
            filled = R.drawable.ic_home_filled,
            outlined = R.drawable.ic_home_outlined,
        ),
        settings = AppIcon(
            filled = R.drawable.ic_settings_filled,
            outlined = R.drawable.ic_settings_outlined,
        ),
        profile = AppIcon(
            filled = R.drawable.ic_profile_filled,
            outlined = R.drawable.ic_profile_outlined,
        ),
        highlights = AppIcon(
            filled = R.drawable.ic_highlights_filled,
            outlined = R.drawable.ic_highlights_outlined,
        ),
        notification = AppIcon(
            filled = R.drawable.ic_notification_filled,
            outlined = R.drawable.ic_notification_outlined,
        ),
        search = AppIcon(
            filled = R.drawable.ic_search,
            outlined = R.drawable.ic_search,
        ),
    ),
    navigation = NavigationIcon(
        arrowUp = AppIcon(
            filled = R.drawable.ic_arrow_up,
            outlined = R.drawable.ic_arrow_up,
        ),
        arrowDown = AppIcon(
            filled = R.drawable.ic_arrow_down,
            outlined = R.drawable.ic_arrow_down,
        ),
        arrowLeft = AppIcon(
            filled = R.drawable.ic_arrow_left,
            outlined = R.drawable.ic_arrow_left,
        ),
        arrowRight = AppIcon(
            filled = R.drawable.ic_arrow_right,
            outlined = R.drawable.ic_arrow_right,
        ),
        arrowUpRight = AppIcon(
            filled = R.drawable.ic_arrow_up_right,
            outlined = R.drawable.ic_arrow_up_right,
        ),
        chevronUp = AppIcon(
            filled = R.drawable.ic_chevron_up,
            outlined = R.drawable.ic_chevron_up,
        ),
        chevronDown = AppIcon(
            filled = R.drawable.ic_chevron_down,
            outlined = R.drawable.ic_chevron_down,
        ),
        chevronLeft = AppIcon(
            filled = R.drawable.ic_chevron_left,
            outlined = R.drawable.ic_chevron_left,
        ),
        chevronRight = AppIcon(
            filled = R.drawable.ic_chevron_right,
            outlined = R.drawable.ic_chevron_right,
        ),
        close = AppIcon(
            filled = R.drawable.ic_close,
            outlined = R.drawable.ic_close,
        ),
        filter = AppIcon(
            filled = R.drawable.ic_filter_filled,
            outlined = R.drawable.ic_filter_outlined,
        ),
        sort = AppIcon(
            filled = R.drawable.ic_sort,
            outlined = R.drawable.ic_sort,
        ),
        logout = AppIcon(
            filled = R.drawable.ic_logout,
            outlined = R.drawable.ic_logout,
        ),
        menu = AppIcon(
            filled = R.drawable.ic_menu_filled,
            outlined = R.drawable.ic_menu_outlined,
        ),
        menuHamburger = AppIcon(
            filled = R.drawable.ic_menu_hamburger,
            outlined = R.drawable.ic_menu_hamburger,
        ),
        more = AppIcon(
            filled = R.drawable.ic_more,
            outlined = R.drawable.ic_more,
        ),
        link = AppIcon(
            filled = R.drawable.ic_link,
            outlined = R.drawable.ic_link,
        ),
    ),
    input = InputIcon(
        edit = AppIcon(
            filled = R.drawable.ic_edit_filled,
            outlined = R.drawable.ic_edit_outlined,
        ),
        delete = AppIcon(
            filled = R.drawable.ic_delete_filled,
            outlined = R.drawable.ic_delete_outlined,
        ),
        plus = AppIcon(
            filled = R.drawable.ic_plus,
            outlined = R.drawable.ic_plus,
        ),
        minus = AppIcon(
            filled = R.drawable.ic_minus,
            outlined = R.drawable.ic_minus,
        ),
        check = AppIcon(
            filled = R.drawable.ic_check,
            outlined = R.drawable.ic_check,
        ),
        eye = AppIcon(
            filled = R.drawable.ic_eye_filled,
            outlined = R.drawable.ic_eye_outlined,
        ),
        eyeOff = AppIcon(
            filled = R.drawable.ic_eye_off_filled,
            outlined = R.drawable.ic_eye_off_outlined,
        ),
        heart = AppIcon(
            filled = R.drawable.ic_heart_filled,
            outlined = R.drawable.ic_heart_outlined,
        ),
        star = AppIcon(
            filled = R.drawable.ic_star_filled,
            outlined = R.drawable.ic_star_outlined,
        ),
        bookmark = AppIcon(
            filled = R.drawable.ic_bookmark_filled,
            outlined = R.drawable.ic_bookmark_outlined,
        ),
        download = AppIcon(
            filled = R.drawable.ic_download,
            outlined = R.drawable.ic_download,
        ),
        upload = AppIcon(
            filled = R.drawable.ic_upload,
            outlined = R.drawable.ic_upload,
        ),
    ),
    dateTime = DateTimeIcon(
        calendar = AppIcon(
            filled = R.drawable.ic_calendar_filled,
            outlined = R.drawable.ic_calendar_outlined,
        ),
        calendarDays = AppIcon(
            filled = R.drawable.ic_calendar_days_filled,
            outlined = R.drawable.ic_calendar_days_outlined,
        ),
        clock = AppIcon(
            filled = R.drawable.ic_clock_filled,
            outlined = R.drawable.ic_clock_outlined,
        ),
    ),
    message = MessageIcon(
        send = AppIcon(
            filled = R.drawable.ic_send_filled,
            outlined = R.drawable.ic_send_outlined,
        ),
        chat = AppIcon(
            filled = R.drawable.ic_chat_filled,
            outlined = R.drawable.ic_chat_outlined,
        ),
        mail = AppIcon(
            filled = R.drawable.ic_mail_filled,
            outlined = R.drawable.ic_mail_outlined,
        ),
        archive = AppIcon(
            filled = R.drawable.ic_archive_filled,
            outlined = R.drawable.ic_archive_outlined,
        ),
        camera = AppIcon(
            filled = R.drawable.ic_camera_filled,
            outlined = R.drawable.ic_camera_outlined,
        ),
        paperclip = AppIcon(
            filled = R.drawable.ic_paperclip,
            outlined = R.drawable.ic_paperclip,
        ),
        microphone = AppIcon(
            filled = R.drawable.ic_microphone_filled,
            outlined = R.drawable.ic_microphone_outlined,
        ),
    ),
    purchase = PurchaseIcon(
        bag = AppIcon(
            filled = R.drawable.ic_bag_filled,
            outlined = R.drawable.ic_bag_outlined,
        ),
        cart = AppIcon(
            filled = R.drawable.ic_cart_filled,
            outlined = R.drawable.ic_cart_outlined,
        ),
        tag = AppIcon(
            filled = R.drawable.ic_tag_filled,
            outlined = R.drawable.ic_tag_outlined,
        ),
        creditCard = AppIcon(
            filled = R.drawable.ic_credit_card_filled,
            outlined = R.drawable.ic_credit_card_outlined,
        ),
        wallet = AppIcon(
            filled = R.drawable.ic_wallet_filled,
            outlined = R.drawable.ic_wallet_outlined,
        ),
    ),
    location = LocationIcon(
        map = AppIcon(
            filled = R.drawable.ic_map_filled,
            outlined = R.drawable.ic_map_outlined,
        ),
        mapPin = AppIcon(
            filled = R.drawable.ic_map_pin_filled,
            outlined = R.drawable.ic_map_pin_outlined,
        ),
        navigation = AppIcon(
            filled = R.drawable.ic_navigation_filled,
            outlined = R.drawable.ic_navigation_outlined,
        ),
        globe = AppIcon(
            filled = R.drawable.ic_globe_filled,
            outlined = R.drawable.ic_globe_outlined,
        ),
    ),
    notification = NotificationIcon(
        info = AppIcon(
            filled = R.drawable.ic_info_filled,
            outlined = R.drawable.ic_info_outlined,
        ),
        success = AppIcon(
            filled = R.drawable.ic_success_filled,
            outlined = R.drawable.ic_success_outlined,
        ),
        warning = AppIcon(
            filled = R.drawable.ic_warning_filled,
            outlined = R.drawable.ic_warning_outlined,
        ),
        error = AppIcon(
            filled = R.drawable.ic_error_filled,
            outlined = R.drawable.ic_error_outlined,
        ),
    ),
    logo = LogoIcon(
        google = AppIcon(
            filled = R.drawable.ic_logo_google,
            outlined = R.drawable.ic_logo_google,
        ),
        facebook = AppIcon(
            filled = R.drawable.ic_logo_facebook,
            outlined = R.drawable.ic_logo_facebook,
        ),
        apple = AppIcon(
            filled = R.drawable.ic_logo_apple,
            outlined = R.drawable.ic_logo_apple,
        ),
    ),
)

internal val LocalIcons = staticCompositionLocalOf {
    Icon
}
