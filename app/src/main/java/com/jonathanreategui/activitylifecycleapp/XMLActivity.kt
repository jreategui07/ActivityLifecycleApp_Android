package com.jonathanreategui.activitylifecycleapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class XMLActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xmlactivity)
        Log.d("XML", "#1: onCreate called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("XML", "#2: onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("XML", "#3: onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("XML", "#4: onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("XML", "#5: onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("XML", "#6: onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("XML", "#7: onDestroy called")
    }
}
