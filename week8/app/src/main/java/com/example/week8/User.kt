package com.example.week8

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User( // 유저 객체 만듦
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "age") val age: Int,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "userId") val userId: Int = 0
)
