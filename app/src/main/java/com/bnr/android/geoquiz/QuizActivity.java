package com.bnr.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Toast toast =
                Toast.makeText(QuizActivity.this, R.string.correct_toast,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL,
                        0, 0);
                toast.show();
            }

        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){Toast toast =
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast,
                        Toast.LENGTH_LONG);
                toast.setGravity(0, 0, 03 );
                toast.show();
            }
        });
    }
}
