package com.example.aavi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        /*button=(Button) findViewById(R.id.next_page) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(myIntent);
            }
        });
        */

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    /*Toast.makeText(SecondActivity.this, "Turned On", Toast.LENGTH_SHORT).show();*/
                    Intent myIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(myIntent);
                } else {
                    Toast.makeText(SecondActivity.this, "Turned Off", Toast.LENGTH_SHORT).show();
                }
            }
        });


        SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar);
        final ProgressBar progressbar = (ProgressBar) findViewById(R.id.progressBar);
        seekbar.setMax(100);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressbar.setProgress(progress);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
