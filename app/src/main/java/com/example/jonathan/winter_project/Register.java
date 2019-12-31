package com.example.jonathan.winter_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private CardView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = (CardView) findViewById(R.id.reg_button);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
