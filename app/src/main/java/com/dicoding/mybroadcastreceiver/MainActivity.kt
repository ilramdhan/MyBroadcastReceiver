package com.dicoding.mybroadcastreceiver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnPermission?.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}