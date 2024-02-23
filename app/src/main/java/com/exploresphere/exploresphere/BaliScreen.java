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

public class BaliScreen extends Activity implements View.OnClickListener{

Button rightButton;
RelativeLayout relativeLayout;
    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        setContentView(R.layout.layout_place_explaination);
        rightButton= findViewById(R.id.right_button);
relativeLayout =findViewById(R.id.layout_explain);
rightButton.setOnClickListener(this);
relativeLayout.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if( view.getId() == R.id.layout_explain) {
            rightButton.setBackground(ContextCompat.getDrawable(this, R.drawable.ic_check_circle_text));
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
                    rightButton.setBackground(ContextCompat.getDrawable(BaliScreen.this, R.drawable.ic_check_circle));

                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        } else if (view.getId() == R.id.right_button) {


            Intent loginScreenIntent = new Intent(this,
                   DayTripScreen.class);

            startActivity(loginScreenIntent);
            this.finish();
        }




    }
}
