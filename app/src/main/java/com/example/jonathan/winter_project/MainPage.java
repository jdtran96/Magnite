package com.example.jonathan.winter_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class MainPage extends AppCompatActivity {

    public static boolean light_state;
    public static TextView data;
    public static Switch LightStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        data = findViewById(R.id.textEdit);
        LightStatus = findViewById(R.id.LightState);

        LightStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                if(LightStatus.isChecked())
                {
                    process.execute();
                }
                else
                process.Process_two();
            }
        });




    }


}
