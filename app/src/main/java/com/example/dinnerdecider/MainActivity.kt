package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dinnerdecider.databinding.ActivityMainBinding
var p1=Choose()
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.selectedFoodTxt.setText("Borsch")
     //   binding.selectedFoodTxt.text="Borsch"

        binding.addNewFood.setOnClickListener{
            p1.add(binding.editTextTextPersonName.text.toString())
           // binding.allList.text=p1.list.joinToString(", ")
            binding.editTextTextPersonName.setText("")
        }
        binding.decideBtn.setOnClickListener {
            binding.selectedFoodTxt.text=p1.deceide()
        }
    }
}