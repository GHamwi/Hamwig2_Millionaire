package com.example.hamwig2_millionaire;

/**************** Created by George B. Hamwi Project 3 *******************/

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/* All of the question activities follow this same format */

public class question5 extends AppCompatActivity {

    /* This is the variable that is the starting score */
    int count = 10000;

    private boolean answered = false;
    private boolean correctAnswer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }

    public void onRadioButtonClicked(View view) {

    /* This checks if the user has clicked radio button and checks if answer is correct or not */
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

        /* When the answer is correct cases will look like this, user score is updated and user is brought to next question activity */
            case R.id.radio_Communism:
                if (checked) {
                    count += 10000;
                    Toast toastCorrect = Toast.makeText(question5.this, "This is the CORRECT answer you earned $10,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question5.this, question6.class));
                }
                break;

        /* When the answer is incorrect cases will look like this, the toast is shown and the user directed to losing screen */
            case R.id.radio_Republicanism:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }
                break;

        /* When the answer is incorrect cases will look like this, the toast is shown and the user directed to losing screen */
            case R.id.radio_Liberalism:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }

                break;
        /* When the answer is incorrect cases will look like this, the toast is shown and the user directed to losing screen */
            case R.id.radio_Conservatism:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }

                break;

        }}

    /* When the confirm button is pressed it will change to the next screen based on the users answer */
    public void goto_next_question(View view) {
        if(!answered)
            return;
        if(!correctAnswer){
            Intent intent = new Intent(this,question5.class);
            intent.putExtra("level", 2);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, question6.class);
            startActivity(intent);

        }}}
