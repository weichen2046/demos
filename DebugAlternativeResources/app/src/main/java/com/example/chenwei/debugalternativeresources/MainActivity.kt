package com.example.chenwei.debugalternativeresources

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

val TAG: String = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icon: Bitmap = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
        Log.d(TAG, "launcher icon width: ${icon.width}, icon height: ${icon.height}")

        device_dpi.text = "Device dpi: ${resources.displayMetrics.densityDpi} dpi"
    }
}
