package com.ccextractor.ultimate_alarm_clock.ultimate_alarm_clock.TimerBroadcasts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.ccextractor.ultimate_alarm_clock.MainActivity

class TimerDismiss: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val timerID = intent.getIntExtra("timerID", 0)
        MainActivity().dismissTimer(timerID)
    }
}