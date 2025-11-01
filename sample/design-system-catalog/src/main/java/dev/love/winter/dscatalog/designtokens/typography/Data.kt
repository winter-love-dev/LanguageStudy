package dev.love.winter.dscatalog.designtokens.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import dev.love.winter.designsystem.theme.WinterTheme

sealed class TypographyListItem {
    data class Header(
        val title: String,
        val description: String,
    ) : TypographyListItem()

    data class Item(
        val data: TypographyItemData,
    ) : TypographyListItem()
}

@Immutable
data class TypographyItemData(
    val tokenName: String,
    val size: String,
    val lineHeight: String,
    val weight: String,
    val case: String? = null,
    val letterSpacing: String? = null,
)

val typographyItems: List<TypographyItemData> = listOf(
    TypographyItemData(
        tokenName = "font-display-LG",
        size = "28px",
        lineHeight = "34px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-display-MD",
        size = "24px",
        lineHeight = "30px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-display-SM",
        size = "20px",
        lineHeight = "26px",
        weight = "Medium (500)",
    ),
)

val typographyTitleItems: List<TypographyItemData> = listOf(
    TypographyItemData(
        tokenName = "font-title-LG",
        size = "18px",
        lineHeight = "24px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-title-MD",
        size = "16px",
        lineHeight = "22px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-title-SM",
        size = "14px",
        lineHeight = "20px",
        weight = "Medium (500)",
    ),
)

val typographyBodyItems: List<TypographyItemData> = listOf(
    TypographyItemData(
        tokenName = "font-body-LG",
        size = "16px",
        lineHeight = "24px",
        weight = "Regular (400)",
    ),
    TypographyItemData(
        tokenName = "font-body-MD",
        size = "14px",
        lineHeight = "20px",
        weight = "Regular (400)",
    ),
    TypographyItemData(
        tokenName = "font-body-SM",
        size = "12px",
        lineHeight = "18px",
        weight = "Regular (400)",
    ),
)

val typographyActionItems: List<TypographyItemData> = listOf(
    TypographyItemData(
        tokenName = "font-action-LG",
        size = "16px",
        lineHeight = "20px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-action-MD",
        size = "14px",
        lineHeight = "18px",
        weight = "Medium (500)",
    ),
    TypographyItemData(
        tokenName = "font-action-SM",
        size = "12px",
        lineHeight = "16px",
        weight = "Semibold (600)",
    ),
)

val typographyCaptionItems: List<TypographyItemData> = listOf(
    TypographyItemData(
        tokenName = "font-caption-LG",
        size = "14px",
        lineHeight = "18px",
        weight = "Medium (500)",
        case = "All caps",
        letterSpacing = "4%",
    ),
    TypographyItemData(
        tokenName = "font-caption-MD",
        size = "12px",
        lineHeight = "16px",
        weight = "Medium (500)",
        case = "All caps",
        letterSpacing = "4%",
    ),
    TypographyItemData(
        tokenName = "font-caption-SM",
        size = "10px",
        lineHeight = "14px",
        weight = "Medium (500)",
        case = "All caps",
        letterSpacing = "4%",
    ),
)

@Composable
fun getTypographyStyle(tokenName: String): TextStyle {
    return when (tokenName) {
        "font-display-LG" -> WinterTheme.typography.displayLarge
        "font-display-MD" -> WinterTheme.typography.displayMedium
        "font-display-SM" -> WinterTheme.typography.displaySmall
        "font-title-LG" -> WinterTheme.typography.titleLarge
        "font-title-MD" -> WinterTheme.typography.titleMedium
        "font-title-SM" -> WinterTheme.typography.titleSmall
        "font-body-LG" -> WinterTheme.typography.bodyLarge
        "font-body-MD" -> WinterTheme.typography.bodyMedium
        "font-body-SM" -> WinterTheme.typography.bodySmall
        "font-action-LG" -> WinterTheme.typography.actionLarge
        "font-action-MD" -> WinterTheme.typography.actionMedium
        "font-action-SM" -> WinterTheme.typography.actionSmall
        "font-caption-LG" -> WinterTheme.typography.captionSmall
        "font-caption-MD" -> WinterTheme.typography.captionMedium
        "font-caption-SM" -> WinterTheme.typography.captionSmall
        else -> WinterTheme.typography.bodyMedium
    }
}
