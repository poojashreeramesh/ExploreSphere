package com.exploresphere.exploresphere;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class SplashScreen extends Activity implements View.OnClickListener {
Button logInButton;
    Button SignInButton;
    RelativeLayout homeRelativeLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_aboutus);
logInButton=findViewById(R.id.login_button);
       SignInButton=findViewById(R.id.signIn_button);
       homeRelativeLayout = findViewById(R.id.layout_Explore);
      /*  if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            verifyStoragePermissions(this);
        } else {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    navigateToNextScreen();
                }
            }, 4000);
            Log.e("login1", "");

        }*/
logInButton.setOnClickListener(this);
        SignInButton.setOnClickListener(this);
        homeRelativeLayout.setOnClickListener(this);
    }









    String username = "";
    String password = "";

    private void navigateToNextScreen() {
     /*   SharedPreferences sharedPreferences=this.getSharedPreferences("Login", MODE_PRIVATE);

        username=sharedPreferences.getString("USERNAME", null);
        password = sharedPreferences.getString("PASSWORD", null);
        Log.e("username",""+username+password);
        Log.e("username1",""+(username=="" && password==""));
        if(!(username== null && password== null)) {
            if (username.equals("ANDROID1") &&
                    password.equals("1234")) {
                Intent submitIntent = new Intent(this, MainActivity.class);
                startActivity(submitIntent);
                finish();

            }else{
                Intent loginIntent = new Intent(this, LoginScreen.class);
                startActivity(loginIntent);
                finish();
            }



        }else {
            Log.e("login","");
            Intent loginIntent = new Intent(this, LoginScreen.class);
            startActivity(loginIntent);
            finish();
        }

    }*/
    }

    {
    }


    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.signIn_button) {
            Intent loginScreenIntent = new Intent(this,
                    LoginScreen.class);

            startActivity(loginScreenIntent);
            this.finish();
        } else if (view.getId() == R.id.layout_Explore) {
            Log.e("ssss","");

            logInButton.setBackground(ContextCompat.getDrawable(SplashScreen.this, R.drawable.layout_select_button));
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
                    logInButton.setBackground(ContextCompat.getDrawable(SplashScreen.this, R.drawable.layout_button));

                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        }
        if (view.getId() == R.id.login_button) {
        Intent ScreenIntent = new Intent(this,
                LoginScreen.class);
        startActivity(ScreenIntent);
        this.finish();
    }
        if (view.getId() == R.id.signIn_button) {
            Intent ScreenIntent = new Intent(this,
                    LinkBioScreen.class);
            startActivity(ScreenIntent);
            this.finish();
        }
        }
    }

