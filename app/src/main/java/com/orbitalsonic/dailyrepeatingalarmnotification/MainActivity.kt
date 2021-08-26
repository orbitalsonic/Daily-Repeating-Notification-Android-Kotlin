package com.orbitalsonic.dailyrepeatingalarmnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()
        val alarmUtils = AlarmUtils(this)
        alarmUtils.initRepeatingAlarm(calendar)

    }

}