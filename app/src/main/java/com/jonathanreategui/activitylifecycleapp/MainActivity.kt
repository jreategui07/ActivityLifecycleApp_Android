package com.jonathanreategui.activitylifecycleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jonathanreategui.activitylifecycleapp.ui.theme.ActivityLifecycleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActivityLifecycleAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        onJavaButtonClick = {
                            val intent = Intent(this, JavaActivity::class.java)
                            startActivity(intent)
                        },
                        onKotlinButtonClick = {
                            val intent = Intent(this, KotlinActivity::class.java)
                            startActivity(intent)
                        },
                        onComposeButtonClick = {
                            val intent = Intent(this, ComposeActivity::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    onJavaButtonClick: () -> Unit,
    onKotlinButtonClick: () -> Unit,
    onComposeButtonClick: () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = onJavaButtonClick, modifier = Modifier.padding(8.dp)) {
                Text(text = "Go to Java + XML Activity")
            }
            Button(onClick = onKotlinButtonClick, modifier = Modifier.padding(8.dp)) {
                Text(text = "Go to Kotlin + XML Activity")
            }
            Button(onClick = onComposeButtonClick, modifier = Modifier.padding(8.dp)) {
                Text(text = "Go to Compose Activity")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ActivityLifecycleAppTheme {
        MainScreen(
            onJavaButtonClick = {},
            onKotlinButtonClick = {},
            onComposeButtonClick = {}
        )
    }
}