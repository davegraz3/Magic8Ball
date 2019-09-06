package com.example.magic8ball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    public Button button1;
    public Button button2;



    private View.OnClickListener buttonOneClick;

    {
        buttonOneClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sayings(view);
            }
        };
    }

    private View.OnClickListener buttonTwoClick;

    {
        buttonTwoClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                reset(view);
            }
        };
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button1 = new Button(this);

    button1.setOnClickListener(buttonOneClick);

        button2 = new Button(this);

        button2.setOnClickListener(buttonTwoClick);

    }

    public void sayings(View view){

        TextView textView1 = findViewById(R.id.textView1);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.eightballback2);



        String[] sayings = {"It is certain", "It is decidedly so", "Without a doubt", "Yes - definitely", "You may rely on it",
                     "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later",
                     "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
                     "My sources say no", "Outlook not so good", "Very Doubtful"};


             Random generator = new Random();
             int answer;

             answer = generator.nextInt(20);
             textView1.setText(sayings[answer]);


         }

         public void reset(View view){

             imageView = findViewById(R.id.imageView);
             imageView.setImageResource(R.drawable.eightballfront);

         }



}