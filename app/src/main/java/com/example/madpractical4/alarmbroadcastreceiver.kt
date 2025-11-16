package com.example.madpractical4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Alarm ringing!", Toast.LENGTH_LONG).show()


        context?.let {
            val player = MediaPlayer.create(it, R.raw.alarm_sound)
            player.start()

            Thread {
                Thread.sleep(30000)
                player.stop()
                player.release()
            }.start()
        }
    }
}
