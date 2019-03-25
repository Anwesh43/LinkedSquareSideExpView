package com.anwesh.uiprojects.linkedsquaresideexpview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.squaresideexpview.SquareSideExpView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SquareSideExpView.create(this)
    }
}
