package com.example.aplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity {

    private TextView titulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo=(TextView)this.findViewById(R.id.txtTitulo);



    }

    public void Amarillo(View view){

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.yellow);
        titulo.setTextColor(Color.BLACK);

    }

    public void Azul(View view){

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.blue);
        titulo.setTextColor(Color.WHITE);

    }

    public void Rojo(View view){

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.red);
        titulo.setTextColor(Color.BLACK);

    }

    public void Negro(View view){

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.night);
        titulo.setTextColor(Color.WHITE);

    }









}
