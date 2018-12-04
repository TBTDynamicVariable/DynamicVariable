package teambestteam.teambestteammhm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button button;				// First, for every button you have on the screen you have to decare a Button Variable
    private Button DataAnalButton;		// Also, above import android.widget.Button; has to be there - android studio will usually put it there
    private Button SelfHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        DataAnalButton = findViewById(R.id.DataAnalButton); // For each button declared above, you have to do this findViewById line. Basically connects button variable to physical button
        DataAnalButton.setOnClickListener(new View.OnClickListener() { // This is what happens when you hit the button. This will change depending on the purpose of the button	
            @Override
            public void onClick(View v) {
                openDataAnal(); // Here, we say a button press will call a function to open the data analysis page which is defined later
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJournal();
            }
        });
        SelfHelp = findViewById(R.id.SelfHelp);
        SelfHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelfHelp();
            }
        });

    }
    public void openJournal(){ // These are the buttons to open an activity - note that this doesn't close the OLD activity, and a strin go opening them can be WAYY to memory intensive
        Intent intent = new Intent(this, Journal.class);
        startActivity(intent);
    }
    public void openDataAnal(){
        Intent dataAnalIntent = new Intent(this, DataAnal.class);
        startActivity(dataAnalIntent);
    }
    public void openSelfHelp(){
        Intent selfHelpIntent = new Intent(this, SelfHelp.class);
        startActivity(selfHelpIntent);
    }





}
