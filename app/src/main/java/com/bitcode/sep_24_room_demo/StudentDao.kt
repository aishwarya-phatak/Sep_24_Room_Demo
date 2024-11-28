package com.bitcode.sep_24_room_demo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StudentDao {
    @Query("select * from Student")
    fun getAllStudents(): List<Student>

    @Insert
    fun insert(student : Student)

    @Update
    fun update(student: Student)

    @Delete
    fun delete(student: Student)

    @Query("delete from Student where rollNumber = :rollNumber")
    fun delete(rollNumber : Int) : Int
}