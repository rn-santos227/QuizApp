package com.rnsantos.quizapp.com.rnsantos.quizapp.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.rnsantos.quizapp.R
import com.rnsantos.quizapp.com.rnsantos.quizapp.models.Question


class QuestionAdapter(private val context: Activity, private val questions: ArrayList<Question>)
    : ArrayAdapter<Question>(context, R.layout.question_list, questions) {

    @SuppressLint("InflateParams", "ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.question_list, null, true)

        val txtQuestion = rowView.findViewById<TextView>(R.id.txt_question)
        val rgbOptions = arrayListOf<RadioButton>(
            rowView.findViewById(R.id.rdb_option1),
            rowView.findViewById(R.id.rdb_option2),
            rowView.findViewById(R.id.rdb_option3),
            rowView.findViewById(R.id.rdb_option4)
        )

        txtQuestion.text = questions[position].question;
        for(i in questions[position].options.indices) {
            rgbOptions[i].text = questions[position].options[i]
            rgbOptions[i].setOnCheckedChangeListener {
                    _, isChecked ->
                if(isChecked) {
                    questions[position].answer = i
                }

                if(questions[position].answer == questions[position].correct) {

                } else {

                }
            }
            if(questions[position].answer == i) {
                rgbOptions[i].isChecked = true
            }
        }



        return rowView
    }

}
