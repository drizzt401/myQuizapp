package com.example.android.myquizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {

        String toastDisplay;
        int correct_answer1;
        int correct_answer2;
        int correct_answer3;
        int correct_answer4;
        int finalScore;

        // Name of User//
        EditText userName = findViewById(R.id.user_name);
        Editable nameOfUser = userName.getText();


        // Question 1 - Correct Answer is option 1 (Muhammadu Buhari)//

        boolean firstAnswer;
        RadioButton answer1 = findViewById(R.id.muhammadu_bubu_rButton);
        firstAnswer = answer1.isChecked();
        if (firstAnswer) {
            correct_answer1 = 1;
        } else {
            correct_answer1 = 0;
        }


        // Question 2 - Correct Answers are United Stated, China and United Kingdom
        CheckBox answer2 = this.findViewById(R.id.usa_chkbx);
        CheckBox answer3 = this.findViewById(R.id.china_chkbx);
        CheckBox answer4 = this.findViewById(R.id.uk_chkbx);
        CheckBox answer5 = this.findViewById(R.id.germany_chkbx);
        boolean secondAnswer = answer2.isChecked();
        boolean thirdAnswer = answer3.isChecked();
        boolean fourthAnswer = answer4.isChecked();
        boolean fifthAnswer = answer5.isChecked();

        if (secondAnswer && thirdAnswer && fourthAnswer && !fifthAnswer) {
            correct_answer2 = 1;
        } else {
            correct_answer2 = 0;
        }

        // Question 3 - Correct Answer is 'True'
        boolean sixthAnswer;
        RadioButton answer6 = findViewById(R.id.true1_rButton);
        sixthAnswer = answer6.isChecked();
        if (sixthAnswer) {
            correct_answer3 = 1;
        } else {
            correct_answer3 = 0;
        }

        // Question 4 - Correct Answer is 'False'. Germany's capital is 'Berlin' not 'Berling'
        boolean seventhAnswer;
        RadioButton answer7 = findViewById(R.id.false2_rButton);
        seventhAnswer = answer7.isChecked();
        if (seventhAnswer) {
            correct_answer4 = 1;
        } else {
            correct_answer4 = 0;
        }

        // Final score
        finalScore = correct_answer1 + correct_answer2 + correct_answer3 + correct_answer4;

        if (finalScore == 4) {
            toastDisplay = "Perfect! " + nameOfUser + " You scored 4 out of 4";
        } else {
            toastDisplay = "Not bad " + nameOfUser + "! You scored " + finalScore + " out of 4";
        }

        //Displays the toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, toastDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }


}
