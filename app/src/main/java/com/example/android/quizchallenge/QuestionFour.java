package com.example.android.quizchallenge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuestionFour extends AppCompatActivity {

    AnimationDrawable anim;
    ConstraintLayout container;
    int score4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_question_one);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(80);

        container = findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            score4 = extras.getInt("score3",0);
            //The key argument here must match that used in the other activity
        }

        TextView question = findViewById(R.id.question);
        question.setText("Question 4 \n What is the highest mountain in the world?");
        Button op1 = findViewById(R.id.button1);
        op1.setText("K-2");
        Button op2 = findViewById(R.id.button2);
        op2.setText("Mount Everest");
        Button op3 = findViewById(R.id.button3);
        op3.setText("Kangchenjunga");
        Button op4 = findViewById(R.id.button4);
        op4.setText("Lhotse");
    }

    public void optionOne(View view){
        Intent myIntent = new Intent(QuestionFour.this, QuestionFive.class);
        myIntent.putExtra("score", score4);
        QuestionFour.this.startActivity(myIntent);
        this.finish();
    }
    public void optionTwo(View view){
        score4 = score4 +1;
        Intent myIntent = new Intent(QuestionFour.this, QuestionFive.class);
        myIntent.putExtra("score", score4);
        QuestionFour.this.startActivity(myIntent);
        this.finish();
    }
    public void optionThree(View view){
        Intent myIntent = new Intent(QuestionFour.this, QuestionFive.class);
        myIntent.putExtra("score", score4);
        QuestionFour.this.startActivity(myIntent);
        this.finish();
    }
    public void optionFour(View view){
        Intent myIntent = new Intent(QuestionFour.this, QuestionFive.class);
        myIntent.putExtra("score", score4);
        QuestionFour.this.startActivity(myIntent);
        this.finish();
    }
}
