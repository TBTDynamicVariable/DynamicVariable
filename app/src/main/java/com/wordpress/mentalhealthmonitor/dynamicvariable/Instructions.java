package com.wordpress.mentalhealthmonitor.dynamicvariable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {
private Button toGame;
private Button toMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);


        toMain = (Button) findViewById(R.id.buttonMainInstruct);
        toGame = (Button) findViewById(R.id.gameButInstructions);
        toGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
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
    public void openGame(){
        Intent intent = new Intent(this, Game.class);
        finish();
        startActivity(intent);
    }
}
