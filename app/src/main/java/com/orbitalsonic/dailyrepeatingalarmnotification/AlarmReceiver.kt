package com.orbitalsonic.dailyrepeatingalarmnotification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*

class AlarmReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, mIntent: Intent?) {
        val notificationUtils = NotificationUtils(context!!)
        notificationUtils.launchNotification()

        /***
         * setInexactRepeating() is not working
         * so i use set() it trigger again when it finished
         */

        // if you are using setInexactRepeating() in AlarmUtils.kt then remove following code
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 1)
        val daysNextCalendar = calendar
        val alarmUtils = AlarmUtils(context)
        alarmUtils.initRepeatingAlarm(daysNextCalendar)
    }
}