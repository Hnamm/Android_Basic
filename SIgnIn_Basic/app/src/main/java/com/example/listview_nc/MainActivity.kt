package com.example.listview_nc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listview_nc.databinding.ActivityMainBinding
import kotlinx.coroutines.newFixedThreadPoolContext

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addEvent();
    }
    private fun addEvent() {
        //login
        loGin();
    }
    private fun loGin() {
        var flag=false
        //login
        binding.btnLogin.setOnClickListener{
            if(binding.username.text.toString().equals("HaiNam")
                && binding.password.text.toString().equals("HaiNam")){
                //correct
                Toast.makeText(
                    this,
                    "Login Succesfull",
                    Toast.LENGTH_SHORT
                ).show()

                flag=true

            }else{
                //not correct
                Toast.makeText(
                    this,
                    "Login Failed!!" +
                            " Usename: HaiNam; Password: HaiNam",
                    Toast.LENGTH_SHORT
                ).show()

            }
            if(flag){
                val sk_login = Intent(this, AfterSingIn::class.java)
                startActivity(sk_login)
            }
        }
    }
}

