package com.nishant.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExampleReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            Toast.makeText(context, "ER Triggered", Toast.LENGTH_SHORT).show()
        }
    }
}