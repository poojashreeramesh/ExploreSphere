package com.exploresphere.exploresphere;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.core.content.ContextCompat;

public class LinkBioScreen   extends Activity implements View.OnClickListener {


    Button id_backbutton;
    Button value2Button;
    Button value3Button;
    Button value4Button;
    Button value5Button;
    Button value6Button;
    RelativeLayout relativeLayout;

    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        setContentView(R.layout.layout_steps);
        id_backbutton=findViewById(R.id.id_backbutton);
      /*  value1Button=findViewById(R.id.button1);
        value2Button=findViewById(R.id.button2);
        value3Button=findViewById(R.id.button3);
        value4Button=findViewById(R.id.button4);
        value5Button=findViewById(R.id.button5);
        value6Button=findViewById(R.id.button6);

        relativeLayout=findViewById(R.id.layout_button);
        relativeLayout.setOnClickListener(this);
        value1Button.setOnClickListener(this);
        value2Button.setOnClickListener(this);
        value3Button.setOnClickListener(this);
        value4Button.setOnClickListener(this);
        value5Button.setOnClickListener(this);
        value6Button.setOnClickListener(this);

       */
id_backbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       /* if( view.getId() == R.id.layout_button || view.getId()==R.id.button1 || view.getId()==R.id.button3||view.getId()==R.id.button4 ||view.getId()==R.id.button5||view.getId()== R.id.button6) {
            value2Button.setBackground(ContextCompat.getDrawable(this, R.drawable.layout_select_button));
            GradientDrawable highlightDrawable = new GradientDrawable();
            //  highlightDrawable.s(ContextCompat.getDrawable(SplashScreen.this, R.drawable.));

// Apply the new drawable as the background
            // logInButton.setBackground(highlightDrawable);

// Set a delay or duration for the highlight effect (optional)
            int duration = 500; // in milliseconds
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Restore the original background (optional)
                    value2Button.setBackground(ContextCompat.getDrawable(SurveyQFive.this, R.drawable.layout_white_background));

                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        } else if (view.getId() == R.id.button2) {


            Intent loginScreenIntent = new Intent(this,
                    SurveyQSix.class);

            startActivity(loginScreenIntent);
            this.finish();
        }


    }*/
        if (view.getId() == R.id.id_backbutton) {


            Intent loginScreenIntent = new Intent(this,
                    SplashScreen.class);

            startActivity(loginScreenIntent);
            this.finish();
        }
    }


}
