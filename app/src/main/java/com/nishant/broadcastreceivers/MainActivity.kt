package com.nishant.broadcastreceivers

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var broadcast: ExampleReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).also {
            registerReceiver(broadcast, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcast)
    }
}
