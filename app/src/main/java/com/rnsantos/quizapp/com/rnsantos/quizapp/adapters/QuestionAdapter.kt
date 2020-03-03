package com.rnsantos.quizapp.com.rnsantos.quizapp.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.rnsantos.quizapp.R
import com.rnsantos.quizapp.com.rnsantos.quizapp.models.Question


class QuestionAdapter(private val context: Activity, private val questions: ArrayList<Question>)
    : ArrayAdapter<Question>(context, R.layout.question_list, questions) {

    @SuppressLint("InflateParams", "ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.question_list, null, true)

        val txtQuestion = rowView.findViewById<TextView>(R.id.txt_question)
        val rbgOptionsGroup = rowView.findViewById<RadioGroup>(R.id.rbg_options)
        val rgbOptions = arrayListOf<RadioButton>(
            rowView.findViewById(R.id.rdb_option1),
            rowView.findViewById(R.id.rdb_option2),
            rowView.findViewById(R.id.rdb_option3),
            rowView.findViewById(R.id.rdb_option4)
        )

        txtQuestion.text = questions[position].question;
        for(i in questions[position].options.indices) {
            rgbOptions[i].text = questions[position].options[i]
        }

        rbgOptionsGroup.setOnCheckedChangeListener { group, checkedId ->
            group.clearCheck()
            val checked = rowView.findViewById<RadioButton>(checkedId)
            checked.isChecked = true
            if(checkedId == questions[position].correct) {

            }
        }
        return rowView
    }

}