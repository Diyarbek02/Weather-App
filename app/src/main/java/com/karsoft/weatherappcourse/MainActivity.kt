package com.karsoft.weatherappcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karsoft.weatherappcourse.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, MainFragment.newInstance())
            .commit()
    }
}