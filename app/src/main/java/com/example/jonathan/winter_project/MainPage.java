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
public class MainPage extends AppCompatActivity implements View.OnClickListener {

    public static boolean light_state;
    public static TextView data;
    public static TextView CNCTConfirmText;
    public static Switch LightStatus;
    public static Button Connected;
    private static boolean ServerConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        Connected = findViewById(R.id.Verify_Connection);
        Connected.setOnClickListener(this);

        LightStatus = findViewById(R.id.LightState);
        LightStatus.setOnClickListener(this);

        data = findViewById(R.id.textEdit);
        CNCTConfirmText = findViewById(R.id.Connection_Text);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.LightState:
            {
                fetchData process = new fetchData();
                if(LightStatus.isChecked())
                {
                    process.execute();
                }
                else
                    process.Process_two();
                break;
            }
            case R.id.Verify_Connection:
            {
                NetworkConnectConfirm NetConfirm = new NetworkConnectConfirm();
                NetConfirm.execute();
            }
        }
    }
}
