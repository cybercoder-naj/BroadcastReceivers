package com.nishant.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExampleReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            if ("com.nishant.EXAMPLE_ACTION" == it.action) {
                val receivedString = it.getStringExtra("com.nishant.EXTRA_TEXT")
                Toast.makeText(context, receivedString, Toast.LENGTH_SHORT).show()
            }
        }
    }
}