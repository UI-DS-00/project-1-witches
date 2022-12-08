package com.example.imdb

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.imdb.databinding.ActivityStart2Binding
import java.util.Timer
import kotlin.concurrent.timerTask

class StartActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityStart2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStart2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var textArray = arrayOf(
            "Movies",
            "TV Shows",
            "Awards & Events",
            "Celebs",
            "Find all of them in IMDb!",
            "Lets go!"
        )

        var i = 1;
        for (i in 1..6){
            helpTextGenerator((i * 1000).toLong(), textArray[i - 1])
        }

        // for start page
        Timer().schedule(timerTask {
         startActivity(Intent(this@StartActivity2, MainActivity::class.java))
         finish()
        }, 7000)
    }

    private fun helpTextGenerator(delayTime:Long, helpText:String)
    {
        Timer().schedule(timerTask {
           runOnUiThread(timerTask {
               binding.helpText.text = helpText
           })
        }, delayTime)
    }
}