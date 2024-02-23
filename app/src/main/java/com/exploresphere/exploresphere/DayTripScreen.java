package com.exploresphere.exploresphere;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class DayTripScreen extends Activity implements View.OnClickListener{

Button idBackButton;

    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        setContentView(R.layout.layout_day_trip);
idBackButton =findViewById(R.id.back_button);

idBackButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if( view.getId() == R.id.layout_button) {
            //  value1Button.setBackground(ContextCompat.getDrawable(this, R.drawable.layout_select_button));
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
                    //   value1Button.setBackground(ContextCompat.getDrawable(SurveyQEigth.this, R.drawable.layout_white_background));

                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        } else if (view.getId() == R.id.back_button) {


            Intent loginScreenIntent = new Intent(this,
                    NewMainScreen.class);

            startActivity(loginScreenIntent);
            this.finish();
        }




    }
}