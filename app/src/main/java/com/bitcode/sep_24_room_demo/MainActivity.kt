package com.bitcode.sep_24_room_demo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var studentDatabase = Room.databaseBuilder(
            this,
            StudentDatabase::class.java,
            "db_student"
        ).allowMainThreadQueries().build()

        val studentDao = studentDatabase.getStudentDao()
//        studentDao.insert(
//            Student(10,"Shahrukh","Pune", isPresent = true)
//        )
//
//        studentDao.insert(
//            Student(11,"Rohit","Pune", isPresent = false)
//        )
//
//        studentDao.insert(
//            Student(12,"Kartik","Pune", isPresent = true)
//        )
//
//        studentDao.insert(
//            Student(rollNumber = 13,"Anushka","Pune", isPresent = true)
//        )
//
//        studentDao.insert(
//            Student(14,"Vedanti", "Pune", isPresent = false)
//        )

        for (eachStudent in studentDao.getAllStudents()){
            Log.e("tag", eachStudent.name)
            Log.e("tag","$eachStudent.rollNumber")
            Log.e("tag",eachStudent.city)
        }

//        studentDao.update(
//            Student(rollNumber = 13,"Ashwini","Pune", isPresent = false)
//        )
//
//        studentDao.delete(
//            Student(11,"Rohit","Pune", isPresent = true)
//        )
//
//        for (eachStudent in studentDao.getAllStudents()){
//            Log.e("tag", eachStudent.name)
//            Log.e("tag","$eachStudent.rollNumber")
//            Log.e("tag",eachStudent.city)
//        }
    }
}