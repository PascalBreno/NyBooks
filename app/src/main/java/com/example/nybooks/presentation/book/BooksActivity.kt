package com.example.nybooks.presentation.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nybooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
        toolbarMain.title
        setSupportActionBar(toolbarMain)
    }
}
