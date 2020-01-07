package com.example.jonathan.winter_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    public static boolean light_state;
    public static TextView data;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        click = (Button) findViewById(R.id.json_button);
        data = findViewById(R.id.textEdit);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
                //data.setText("button clicked succesfully");
            }
        });



    }


}
