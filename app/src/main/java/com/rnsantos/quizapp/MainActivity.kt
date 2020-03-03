package com.rnsantos.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rnsantos.quizapp.com.rnsantos.quizapp.adapters.QuestionAdapter
import com.rnsantos.quizapp.com.rnsantos.quizapp.models.Question
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val questions = arrayListOf<Question>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questions.add(Question("A general-purpose Object-Oriented Programming Language used by Google to develop Android Mobile Application with Android Studio.",
            arrayListOf("Java", "Kotlin", "Dart", "Groovy"), 0, 5))
        questions.add(Question("A programming language developed by IntelliJ that targets to run on the Java Virtual Machine. It was officially supported by Google for Android App Development.",
            arrayListOf("Groovy", "Scala", "Ceylon", "Kotlin"), 3, 5))
        questions.add(Question("A programming language developed by Google which is based on JavaScript which allows to create web and mobile application.",
            arrayListOf("Clojure", "Dart", "TypeScript", "Groovy"), 2, 5))
        questions.add(Question("An Android development kit which allow to C++ and C to build native scripts and implementing libraries on Android Applications.",
            arrayListOf("Android SDK", "Gradle", "Android NDK", "Ant"), 3, 5))
        questions.add(Question("Android Studio test library which build application and track downs runtime errors.",
            arrayListOf("Manifest", "Ant", "Gradle", "Synthetics"), 2, 5))
        questions.add(Question("Who invented Java?",
            arrayListOf("James Gosling", "Bjarne Stoutstrup", "Larry Wall", "Rasmus Landorf"), 0, 5))

        val mListView = question_list
        val myListAdapter = QuestionAdapter(this, questions)
        mListView.adapter = myListAdapter

    }
}
