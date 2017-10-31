package com.example.aavi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button button=(Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(myIntent);
            }
        });

        final EditText name = (EditText) findViewById(R.id.editText2);
        final TextView text = (TextView) findViewById(R.id.textView3);
        Button enterButton = (Button) findViewById(R.id.button2);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = name.getText().toString();
                text.setText(getName);
            }
        });

    }
}
