package com.exploresphere.exploresphere;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurveyQSix extends Activity implements View.OnClickListener{


    Button value1Button;
    Button value2Button;
    Button value3Button;
    Button value4Button;
    Button value5Button;
    Button value6Button;

    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        setContentView(R.layout.layout_survey_q6);
        value1Button=findViewById(R.id.button1);
        value2Button=findViewById(R.id.button2);
        value3Button=findViewById(R.id.button3);
        value4Button=findViewById(R.id.button4);
        value5Button=findViewById(R.id.button5);
        value6Button=findViewById(R.id.button6);
        value1Button.setOnClickListener(this);
        value2Button.setOnClickListener(this);
        value3Button.setOnClickListener(this);
        value4Button.setOnClickListener(this);
        value5Button.setOnClickListener(this);
        value6Button.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {

        Intent loginScreenIntent = new Intent(this,
                SurveyQSeven.class);

        startActivity(loginScreenIntent);
        this.finish();

    }
}



