package com.chekmazova.olga.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //We set it final to make sure that the array of dice will never change
        final int diceArray[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: The button has been pressed!");

                Random randomNumberGenerator = new Random();
                //generate number between 0 and 5 ->
                int number = randomNumberGenerator.nextInt(6);
                Log.d(TAG, "The random number is: " + number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });


    }
}
