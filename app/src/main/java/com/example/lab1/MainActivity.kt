package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1)
        Log.d("CREATION", "Created!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("START", "Started!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RESTART", "Restarted!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("PAUSE", "Paused!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RESUME", "Resume!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DESTROY", "Destroyed!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("STOP", "Stopped!")
    }
}