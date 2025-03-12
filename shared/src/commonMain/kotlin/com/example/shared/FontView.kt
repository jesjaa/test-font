package com.example.shared

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import com.example.shared.resources.Res
import com.example.shared.resources.testfont
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FontView() {
    Text(
        "Lorem ipsum dolor",
        fontFamily = FontFamily(
            Font(
                Res.font.testfont
            )
        )
    )
}