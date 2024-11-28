package com.bitcode.sep_24_room_demo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Student")
    data class Student(
        @PrimaryKey
        var rollNumber : Int,

        @ColumnInfo(name = "student_name")
        var name : String,

        var city : String,

        var isPresent : Boolean = true
    )