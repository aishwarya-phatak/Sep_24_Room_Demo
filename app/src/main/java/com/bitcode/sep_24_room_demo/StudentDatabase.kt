package com.bitcode.sep_24_room_demo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1)
abstract class StudentDatabase : RoomDatabase(){
    abstract fun getStudentDao() : StudentDao
}