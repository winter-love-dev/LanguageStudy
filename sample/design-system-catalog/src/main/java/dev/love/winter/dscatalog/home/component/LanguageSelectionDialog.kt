package dev.love.winter.dscatalog.home.component

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.window.Dialog
import dev.love.winter.designsystem.component.text.Text
import dev.love.winter.designsystem.theme.WinterTheme
import dev.love.winter.sample.common.R

private data class Language(
    val displayName: String,
    val languageTag: String,
)

@Composable
fun LanguageSelectionDialog(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    onLanguageChange: (languageTag: String) -> Unit,
) {
    val languages = remember {
        listOf(
            Language("English", "en"),
            Language("한국어", "ko"),
            Language("日本語", "ja"),
            Language("中文", "zh-CN"),
            Language("Tiếng Việt", "vi"),
            Language("ภาษาไทย", "th"),
        )
    }

    Dialog(onDismissRequest = onDismissRequest) {
        Surface(
            shape = WinterTheme.borderRadius.large,
            color = WinterTheme.color.background,
            modifier = modifier,
        ) {
            Column(
                modifier = Modifier.padding(WinterTheme.spacing.medium)
            ) {
                Text(
                    text = stringResource(R.string.select_language),
                    style = WinterTheme.typography.titleLarge,
                    color = WinterTheme.color.textTitle
                )
                Spacer(modifier = Modifier.height(WinterTheme.spacing.medium))
                LazyColumn {
                    items(languages) { language ->
                        Text(
                            text = language.displayName,
                            style = WinterTheme.typography.bodyLarge,
                            color = WinterTheme.color.textBody,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(WinterTheme.borderRadius.medium)
                                .clickable {
                                    onLanguageChange(language.languageTag)
                                }
                                .padding(WinterTheme.spacing.small)
                        )
                    }
                }
            }
        }
    }
}

fun Context.findActivity(): Activity? = when (this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}
