package com.example.plrunningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plrunningapp.R
import com.example.plrunningapp.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("runDao", "RUNDAO: ${runDAO.hashCode()}")
    }
}