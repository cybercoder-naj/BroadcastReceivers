package com.nishant.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            if (ConnectivityManager.CONNECTIVITY_ACTION == it.action) {
                val noConnectivity = it.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false)
                Toast.makeText(context, if (noConnectivity) "Disconnected" else "Connected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}