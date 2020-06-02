package com.example.jonathan.winter_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private CardView register;
    private TextView email;
    private TextView password;
    private TextView pwConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.email_Input);
        password = findViewById(R.id.pwInput);
        pwConfirm = findViewById(R.id.confirm);
        register = findViewById(R.id.reg_button);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
