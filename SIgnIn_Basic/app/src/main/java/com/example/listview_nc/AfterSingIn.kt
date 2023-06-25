package com.example.listview_nc

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.example.listview_nc.databinding.ActivityAfterSingInBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding:ActivityAfterSingInBinding
class AfterSingIn : AppCompatActivity() {
    lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAfterSingInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        eventLw();
    }
    private fun eventLw() {
        binding.btnlw.setOnClickListener {
            showDialog();
        }
    }
    private fun showDialog() {
        val build = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.dialog_gth, null)
        build.setView(view)
        //btn_close
        val btn_close = view.findViewById<ImageButton>(R.id.btn_close)
        btn_close.setOnClickListener {
            dialog.dismiss()
        }
        //btn_fb
        val btn_fb = view.findViewById<ImageView>(R.id.btn_fb)
        btn_fb.setOnClickListener {
            val sk_fb = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nguyenhai.nam.5473894"))
            startActivity(sk_fb)
        }
        dialog=build.create()
        dialog.show()
    }
}