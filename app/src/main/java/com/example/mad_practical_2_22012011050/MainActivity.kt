package com.example.mad_practical_2_22012011050

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text = findViewById<TextView>(R.id.text_hello)
        Showmessage("onCreate Method is called")
    }
    fun Showmessage(msg:String)
    {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main),msg,Snackbar.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Showmessage("onStart Method is called")

    }
    override fun onResume() {
        super.onResume()
        Showmessage("onResume Method is called")
    }
    override fun onPause() {
        super.onPause()
        Showmessage("onPause Method is called")
    }
    override fun onStop() {
        super.onStop()
        Showmessage("onStop Method is callled")
    }
    override fun onDestroy() {
        super.onDestroy()
        Showmessage("onDestroy Method is called")
    }
    override fun onRestart() {
        super.onRestart()
        Showmessage("onRestart Method is called")
    }

}