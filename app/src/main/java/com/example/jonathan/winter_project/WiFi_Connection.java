package com.example.jonathan.winter_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class WiFi_Connection extends AppCompatActivity implements View.OnClickListener{

    private Button Submit;
    public static EditText SSID;
    public static EditText PW;
    public static TextView Post_Result;
    public static SendToServer example = new SendToServer();
   static String action = "readstring";

   static SendToServer ex1 = new SendToServer();
    public static String jsonex = ex1.Wifi_Submit_SSID(SSID);
    public static String jsonex1 = ex1.Wifi_Submit_PW(PW);
    public static String json = ex1.Wifi_Submit(SSID,PW);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi__connection);

        SSID = findViewById(R.id.WiFi_SSID);
        PW = findViewById(R.id.WiFi_Password);
        Post_Result = findViewById(R.id.PostResult);
        Submit = findViewById(R.id.WiFi_Submit);
        Submit.setOnClickListener(this);

    }

    public void Entry() throws IOException {


        String json = example.Wifi_Submit_SSID(SSID);
        String json1 = example.Wifi_Submit_PW(PW);

      //  System.out.println(response);

    }
    SendToServer sendToServer = new SendToServer();
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.WiFi_Submit:
            {
                sendToServer.execute();
                break;
            }
        }
    }
}