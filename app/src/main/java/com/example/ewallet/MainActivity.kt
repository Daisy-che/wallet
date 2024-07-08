package com.example.ewallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ewallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayWallet()


    }
    fun displayWallet(){
        val text1=Enwallet(
            "Salary",
            "KES 4000",
            "1 july 2024",
            ""
        )
        val text2=Enwallet(
            "Rent",
            "KES 16000",
            "2 july 2024",
            ""
        )
        val text4=Enwallet(
            "Dividend",
            "KES 2400",
            "4 july 2024",
            ""
        )
        val text5=Enwallet(
            "Electricity",
            "KES 800",
            "5 july 2024",
            ""
        )
        val  mytext = listOf(text1,text2,text4,text5)
        val  enwalletAdapter = EnwalletAdapter(mytext)
        binding.rvWallet.adapter = enwalletAdapter

    }
}