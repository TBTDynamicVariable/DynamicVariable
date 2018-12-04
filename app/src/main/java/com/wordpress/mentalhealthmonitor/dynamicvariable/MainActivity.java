package com.wordpress.mentalhealthmonitor.dynamicvariable;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    private Button toGame;
    private Button toLeaderboard;
    private Button toSettingsBut;
    private Button toInstructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toGame = (Button) findViewById(R.id.toGameButton);
        toLeaderboard = (Button) findViewById(R.id.toHighScore);
        toSettingsBut = (Button) findViewById(R.id.toSettings);
        toInstructions = (Button) findViewById(R.id.toInstructoionsButtton);




        toGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });
        toLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLeaderboard();
            }
        });
        toSettingsBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });
        toInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInstructions();
            }
        });

       // toSettingsBut.setOnClickListener(this);
       // toInstructions.setOnClickListener(this);
    }
    public void openGame(){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }
    public void openLeaderboard(){
        Intent intent = new Intent(this, Leaderboard.class);
        startActivity(intent);
    }
    public void openSettings(){
        Intent intent = new Intent(this, MySettings.class);
        startActivity(intent);
    }
    public void openInstructions(){
        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}
