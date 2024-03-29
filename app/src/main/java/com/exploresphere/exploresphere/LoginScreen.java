package com.exploresphere.exploresphere;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class LoginScreen extends Activity implements View.OnClickListener {
    Button logInButton;
    RelativeLayout relativeLayout;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        logInButton=findViewById(R.id.signIn_button);
relativeLayout=findViewById(R.id.Layout_username);
        logInButton.setOnClickListener(this);
       relativeLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.Layout_username){
            logInButton.setBackground(ContextCompat.getDrawable(LoginScreen.this, R.drawable.layout_select_button));
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
                    logInButton.setBackground(ContextCompat.getDrawable(LoginScreen.this, R.drawable.layout_button));

                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        }
        if (view.getId() == R.id.signIn_button) {
            Intent loginScreenIntent = new Intent(this,
                    SurveyQOne.class);

            startActivity(loginScreenIntent);
            this.finish();
        }
    }
}
