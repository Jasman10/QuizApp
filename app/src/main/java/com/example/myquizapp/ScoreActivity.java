package com.example.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    public static String TAG = "ScoreActivity";

    private TextView scoreView;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreView = findViewById(R.id.textView);
        backButton = findViewById(R.id.Back_Btn);

        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);
        scoreView.setText(""+score);

        Log.d(TAG, "score: "+ score);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}