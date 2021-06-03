package com.example.fitfit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView excerciseText = (TextView)findViewById(R.id.excerciseTitle);
        ImageView excerciseView = (ImageView)findViewById(R.id.excerciseView);
        LinearLayout mainBG = (LinearLayout)findViewById((R.id.mainBG));

        String excerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        excerciseText.setText(excerciseTitle);

        if(excerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_WEIGHTS)){
            excerciseView.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }else if(excerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_CARDIO)){
            excerciseView.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#4CAF50"));
        }else {
            excerciseView.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#BB86FC"));
        }
    }
}