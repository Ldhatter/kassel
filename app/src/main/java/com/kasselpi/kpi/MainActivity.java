package com.kasselpi.kpi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.kasselpi.kpi.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** When user submits source and destination locations */
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText inputSrc = (EditText) findViewById(R.id.formSrc);
        EditText inputDest = (EditText) findViewById(R.id.formDest);
        Bundle extras = new Bundle();
        String inputS = inputSrc.getText().toString();
        String inputD = inputDest.getText().toString();
        extras.putString("EXTRA_SRC", inputS);
        extras.putString("EXTRA_DEST", inputD);

        intent.putExtras(extras);
        startActivity(intent);
    }

    /** Test google maps */
    public void getDirections(View view){
        Intent intent = new Intent(this, MapsActivity.class);

        // TODO: add logic, bind source and destination locations and send to google maps

        startActivity(intent);
    }
}
