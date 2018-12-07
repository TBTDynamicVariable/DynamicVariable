package com.wordpress.mentalhealthmonitor.dynamicvariable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MySettings extends AppCompatActivity {

    public Button VolumeOnButton;
    public Button VolumeOffButton;

    private Button toMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_settings);

        VolumeOnButton = (Button) findViewById(R.id.VolumeOn);
        VolumeOffButton = (Button) findViewById(R.id.VolumeOff);
        toMain = (Button) findViewById(R.id.mainButSettings);

        VolumeOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnVolumeOff();
                // This will be the function to turn off the button
            }
        });
        VolumeOnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnVolumeOn();
                // THis turns the volume on, it wull probably have to error check and see if the volume is slready on
            }
        });

        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });


    }
    public void openMain(){
       finish();
    }
    public void turnVolumeOn(){
        //This turns the volume on
    }
    public void turnVolumeOff(){
        //Thus turns the volume off
    }
}
