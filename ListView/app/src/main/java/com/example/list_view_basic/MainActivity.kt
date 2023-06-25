package com.example.list_view_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addEvent()
    }

    private fun addEvent() {
        hienthiQuocGia()
    }

    private fun hienthiQuocGia() {
        var arrQuocGia = resources.getStringArray(R.array.arrQuocGia)

        lvQuocGia.adapter=ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arrQuocGia
        )
        lvQuocGia.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "Bạn chọn quốc gia: " + arrQuocGia[i],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}