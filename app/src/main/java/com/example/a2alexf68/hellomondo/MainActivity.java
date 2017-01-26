package com.example.a2alexf68.hellomondo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;



public class MainActivity extends Activity implements View.OnClickListener {
/*Called when the activity is first created*/
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) /*add button as I am sure this is a button */ findViewById(R.id.calculateButton);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick (View view)
    {
        EditText userEditText = (EditText) findViewById(R.id.userEditText);
        String yearAsString = userEditText.getText().toString();
        TextView answerTextView = (TextView) findViewById(R.id.answerTextView);

        if (yearAsString.equals ("") ) {
            answerTextView.setText("No value detected... \n :/");
        } else {
            int year = Integer.parseInt(yearAsString);
            int result = 2016 - year;


            answerTextView.setText("" + result);
        }
    }
}
