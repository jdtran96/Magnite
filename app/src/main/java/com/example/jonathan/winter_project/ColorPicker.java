package com.example.jonathan.winter_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.skydoves.colorpickerpreference.ColorEnvelope;
import com.skydoves.colorpickerpreference.ColorListener;
import com.skydoves.colorpickerpreference.ColorPickerView;

public class ColorPicker extends AppCompatActivity {

    public ColorPickerView colorPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        colorPicker = findViewById(R.id.colorPickerView);

        colorPicker.setColorListener(new ColorListener() {
            @Override
            public void onColorSelected(ColorEnvelope colorEnvelope) {

            }

        });

    }
}
