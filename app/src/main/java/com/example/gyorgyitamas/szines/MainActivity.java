package com.example.gyorgyitamas.szines;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {


    private Button bttnKek, bttnSarga, bttnZold, bttnPiros;
    private int hatterRed;
    private int hatterGreen;
    private int hatterBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.bttnKek = (Button)findViewById(R.id.buttonKek);
        this.bttnSarga = (Button)findViewById(R.id.buttonSarga);
        this.bttnZold = (Button)findViewById(R.id.buttonZold);
        this.bttnPiros = (Button)findViewById(R.id.buttonPiros);

        this.bttnKek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hatterRed=64;
                hatterGreen=93;
                hatterBlue=255;

                bttnKek.setBackgroundColor(Color.rgb(hatterRed,hatterGreen,hatterBlue));
                Drawable background = view.getBackground();

                Toast.makeText(MainActivity.this,background + "", Toast.LENGTH_SHORT).show();
//getWindow().getDecorView().getBackground().toString()
                getWindow().getDecorView().setBackgroundColor(rgb(64,93,252));

            }
        });

        this.bttnSarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hatterRed=255;
                hatterGreen=242;
                hatterBlue=51;

                bttnKek.setBackgroundColor(Color.rgb(hatterRed,hatterGreen,hatterBlue));
                getWindow().getDecorView().setBackgroundColor(rgb(255,242,51));
                /*
                <color name="colorPiros">#ff4053</color> <!--255,64,83 -->
                <color name="colorZold">#12b731</color> <!--18,183,49-->

 * */
            }
        });
    }


}
