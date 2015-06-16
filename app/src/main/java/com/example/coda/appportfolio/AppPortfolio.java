package com.example.coda.appportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class AppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    public void onClick(View v) {
        CharSequence text = "";
        switch(v.getId()) {
            case R.id.button1:
                text = "This button will launch the Spotify Streamer";
                break;
            case R.id.button2:
                text = "This button will launch the Scores App";
                break;
            case R.id.button3:
                text = "This button will launch the Library App";
                break;
            case R.id.button4:
                text = "This button will launch the Build it Bigger App";
                break;
            case R.id.button5:
                text = "This button will launch the XYZ Reader App";
                break;
            case R.id.button6:
                text = "This button will launch the Capstone App";
                break;
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }
}
