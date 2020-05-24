package com.nishant.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            if (Intent.ACTION_BOOT_COMPLETED == it.action)
                Toast.makeText(context, "Boot Completed", Toast.LENGTH_SHORT).show()

            if (ConnectivityManager.CONNECTIVITY_ACTION == it.action)
                Toast.makeText(context, "Connectivity Change", Toast.LENGTH_SHORT).show()
        }
    }
}