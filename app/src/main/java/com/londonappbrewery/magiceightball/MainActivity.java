package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button;
        ask_button = (Button) findViewById(R.id.ask_button);

        final ImageView magic_ball = (ImageView) findViewById(R.id.magic_ball);

        final int[] ballArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5,};

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magiceightball", "Ask button has been pressed");

                Random randomNumberGenerator = new Random ();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("magiceightball", "The random number is:" + number);
                magic_ball.setImageResource(ballArray[number]);


            }
        });



    }
}
