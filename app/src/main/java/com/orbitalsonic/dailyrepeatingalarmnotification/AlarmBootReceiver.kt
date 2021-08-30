package com.orbitalsonic.dailyrepeatingalarmnotification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*

class AlarmBootReceiver : BroadcastReceiver(){

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            val calendar = Calendar.getInstance()
            val alarmUtils = AlarmUtils(context)
            alarmUtils.initRepeatingAlarm(calendar)
        }
    }

}