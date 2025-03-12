package com.example.testfont

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.shared.FontView
import com.example.testfont.ui.theme.TestFontTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestFontTheme {
                FontView()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FontViewPreview() {
    TestFontTheme {
        FontView()
    }
}