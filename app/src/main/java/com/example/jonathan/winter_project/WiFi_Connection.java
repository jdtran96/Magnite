package com.example.jonathan.winter_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WiFi_Connection extends AppCompatActivity {

    private Button Submit;
    public EditText SSID, PW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi__connection);

        SSID = (EditText) findViewById(R.id.WiFi_SSID);
        PW = (EditText) findViewById(R.id.WiFi_Password);
        Submit = (Button) findViewById(R.id.WiFi_Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
