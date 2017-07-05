package com.example.chenwei.debugalternativeresources

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icon: Bitmap = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
        Log.d(TAG, "launcher icon width: ${icon.width}, icon height: ${icon.height}")
        val iconWH: TextView = findViewById(R.id.icon_wh) as TextView
        iconWH.text = "w: ${icon.width} * h: ${icon.height}"

        Log.d(TAG, "density: ${resources.displayMetrics.density}")
        Log.d(TAG, "densityDpi: ${resources.displayMetrics.densityDpi}")
        Log.d(TAG, "scaledDensity: ${resources.displayMetrics.scaledDensity}")
        Log.d(TAG, "xdpi: ${resources.displayMetrics.xdpi}")
        Log.d(TAG, "ydpi: ${resources.displayMetrics.ydpi}")
        Log.d(TAG, "widthPixels: ${resources.displayMetrics.widthPixels}")
        Log.d(TAG, "heightPixels: ${resources.displayMetrics.heightPixels}")

        val density: TextView = findViewById(R.id.density) as TextView
        density.text = resources.displayMetrics.density.toString()

        val densityDpi: TextView = findViewById(R.id.density_dpi) as TextView
        densityDpi.text = resources.displayMetrics.densityDpi.toString()

        val scaledDensity: TextView = findViewById(R.id.scaled_density) as TextView
        scaledDensity.text = resources.displayMetrics.scaledDensity.toString()

        val xdpi: TextView = findViewById(R.id.xdpi) as TextView
        xdpi.text = resources.displayMetrics.xdpi.toString()

        val ydpi: TextView = findViewById(R.id.ydpi) as TextView
        ydpi.text = resources.displayMetrics.ydpi.toString()

        val widthPixels: TextView = findViewById(R.id.width_pixels) as TextView
        widthPixels.text = resources.displayMetrics.widthPixels.toString()

        val heightPixels: TextView = findViewById(R.id.height_pixels) as TextView
        heightPixels.text = resources.displayMetrics.heightPixels.toString()
    }

    companion object {
        const val TAG = "DebugResources"
    }
}
