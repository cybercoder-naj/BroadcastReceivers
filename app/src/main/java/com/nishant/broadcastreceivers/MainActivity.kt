package com.nishant.broadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var broadcast: ExampleReceiver = ExampleReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Intent("com.nishant.EXAMPLE_ACTION").apply {
                putExtra("com.nishant.EXTRA_TEXT", "Broadcast Received.")
            }.also {
                sendBroadcast(it)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        IntentFilter("com.nishant.EXAMPLE_ACTION").also {
            registerReceiver(broadcast, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcast)
    }
}
