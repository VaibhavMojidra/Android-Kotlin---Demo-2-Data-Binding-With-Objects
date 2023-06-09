package com.vaibhavmojidra.kotlindemo2databindingwithobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaibhavmojidra.kotlindemo2databindingwithobjects.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            getEmployeeDetails.setOnClickListener {
                binding.employee=Employee("Vaibhav Mojidra",695939)
            }
        }
    }
}