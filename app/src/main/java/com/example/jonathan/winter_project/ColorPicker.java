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
    public EditText Rcolor,Gcolor,Bcolor;

    int array[] = new int[3];
    int r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        colorPicker = findViewById(R.id.colorPickerView);
        colorHex = findViewById(R.id.Hex_Value_Edit);
        ColorD = findViewById(R.id.colorDisplay);
        Rcolor = findViewById(R.id.Rnum);
        Gcolor = findViewById(R.id.Gnum);
        Bcolor = findViewById(R.id.Bnum);

        colorPicker.setColorListener(new ColorListener() {

            @Override
            public void onColorSelected(ColorEnvelope colorEnvelope) {
                colorHex.setText(colorEnvelope.getColorHtml());
                ColorD.setCardBackgroundColor(colorEnvelope.getColor());
               array = colorEnvelope.getColorRGB();
               r = array[0];
               g = array[1];
               b = array[2];
              String r_string = Integer.toString(r);
              String g_string = Integer.toString(g);
              String b_string = Integer.toString(b);
              Rcolor.setText(r_string);
              Gcolor.setText(g_string);
              Bcolor.setText(b_string);
            }
        });

    }
}
