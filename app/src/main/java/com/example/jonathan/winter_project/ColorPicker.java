package com.example.jonathan.winter_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.EditText;

import com.skydoves.colorpickerpreference.ColorEnvelope;
import com.skydoves.colorpickerpreference.ColorListener;
import com.skydoves.colorpickerpreference.ColorPickerView;

public class ColorPicker extends AppCompatActivity {

    public ColorPickerView colorPicker;
    public EditText colorHex;
    public CardView ColorD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        colorPicker = findViewById(R.id.colorPickerView);
        colorHex = findViewById(R.id.Hex_Value_Edit);
        ColorD = findViewById(R.id.colorDisplay);

        colorPicker.setColorListener(new ColorListener() {
            @Override
            public void onColorSelected(ColorEnvelope colorEnvelope) {

               colorHex.setText(colorEnvelope.getColorHtml());
               ColorD.setCardBackgroundColor(colorEnvelope.getColor());
            }

        });

    }
}
