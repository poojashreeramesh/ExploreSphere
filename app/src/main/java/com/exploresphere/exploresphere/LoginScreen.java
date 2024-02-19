package com.exploresphere.exploresphere;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class LoginScreen extends Activity implements View.OnClickListener {
    Button logInButton;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        logInButton=findViewById(R.id.signIn_button);

        logInButton.setOnClickListener(this);
       // SignInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.signIn_button) {
            Intent loginScreenIntent = new Intent(this,
                    SurveyQOne.class);

            startActivity(loginScreenIntent);
            this.finish();
        }
    }
}
