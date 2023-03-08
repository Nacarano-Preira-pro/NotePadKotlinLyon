package com.example.notepadkotlinlyon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_list)
    }
}