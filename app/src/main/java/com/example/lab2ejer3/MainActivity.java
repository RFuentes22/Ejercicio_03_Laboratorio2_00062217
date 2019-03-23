package com.example.lab2ejer3;


import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.red);
        btn2 = findViewById(R.id.green);
        btn3 = findViewById(R.id.blue);

        setButtonOnClickListeners();
    }

    private int nextColorRed() {

        int rndN = rand.nextInt(6) + 1;
        String color = "red" + rndN;
        Resources res = getResources();
        int id = res.getIdentifier(color, "color", getPackageName());

        return id;
    }
    private int nextColorGreen() {

        int rndN = rand.nextInt(6) + 1;
        String color = "green" + rndN;
        Resources res = getResources();
        int id = res.getIdentifier(color, "color", getPackageName());

        return id;
    }
    private int nextColorBlue() {

        int rndN = rand.nextInt(6) + 1;
        String color = "blue" + rndN;
        Resources res = getResources();
        int id = res.getIdentifier(color, "color", getPackageName());

        return id;
    }


    private void setButtonOnClickListeners() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonClicked) {
                if (buttonClicked.getId() == R.id.red) {

                    btn1.setBackgroundColor(getResources().getColor(nextColorRed()));
                }
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonClicked) {
                if (buttonClicked.getId() == R.id.green) {

                    btn2.setBackgroundColor(getResources().getColor(nextColorGreen()));
                }
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonClicked) {
                if (buttonClicked.getId() == R.id.blue) {

                    btn3.setBackgroundColor(getResources().getColor(nextColorBlue()));
                }
            }

        });
    }
}
