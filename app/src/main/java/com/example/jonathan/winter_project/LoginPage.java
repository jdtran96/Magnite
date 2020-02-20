package com.example.jonathan.winter_project;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class LoginPage extends AppCompatActivity implements View.OnClickListener{
    public static TextView data;
    private CardView Login;
    private TextView Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
       // AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
       // animationDrawable.setEnterFadeDuration(2000);
        //animationDrawable.setExitFadeDuration(4000);
        //animationDrawable.start();

        Login = (CardView) findViewById(R.id.Login_Button);
        Login.setOnClickListener(this);
        Reg = (TextView) findViewById(R.id.Reg_Link);
        Reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.Login_Button:
                openLoginSuccess();
                break;
            case R.id.Reg_Link:
                openRegister();
                break;
        }

    }

    public void openRegister()
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    public void openLoginSuccess()
    {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
}
