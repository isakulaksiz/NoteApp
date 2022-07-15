package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesDataSource{
    fun loadNotes(): List<Note>{

        return listOf(
            Note(title = "Android Compose", description = "Learning on Jetpack Compose"),
            Note(title = "Passion", description = "Be yourself no matter what they say!")
        )
    }
}