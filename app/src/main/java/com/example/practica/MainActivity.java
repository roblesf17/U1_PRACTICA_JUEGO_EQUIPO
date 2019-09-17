package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView txt_1 , txt_2 ;

    public Button btn_1_disminuir ;
    public Button btn_2_disminuir ;

    public Button btn_1_aumnetar ;
    public Button btn_2_aumnetar ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclic_1disminuir(View v)
    {
        txt_1 = (TextView) findViewById(R.id.textView);
        String numero1 = txt_1.getText().toString();

        int num = Integer.parseInt(numero1);

        if (num > 0)
        {
            int resultado = Integer.parseInt(numero1) - 1 ;

            txt_1.setText(String.valueOf(resultado));

            Button btn =(Button) findViewById(R.id.btn_1_disminuir);
            btn.setBackgroundResource(R.drawable.menos_presionado);


            Button btn2 =(Button) findViewById(R.id.btn_1_aumentar);
            btn2.setBackgroundResource(R.drawable.sumar);

        }





        /*
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context , numero1 , duration);
        toast.show();
        */

    }

    public void onclic_2disminuir(View v)
    {
        txt_2 = (TextView) findViewById(R.id.textView2);
        String numero1 = txt_2.getText().toString();






        int num = Integer.parseInt(numero1);

        if (num > 0)
        {
            int resultado = Integer.parseInt(numero1) - 1 ;

            txt_2.setText(String.valueOf(resultado));

            Button btn =(Button) findViewById(R.id.btn_2_disminuir);
            btn.setBackgroundResource(R.drawable.menos_presionado);


            Button btn2 =(Button) findViewById(R.id.btn_2_aumentar);
            btn2.setBackgroundResource(R.drawable.sumar);
        }




        /*
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context , numero1 , duration);
        toast.show();
        */

    }


    public void onclic_1aumentar(View v)
    {
        txt_1 = (TextView) findViewById(R.id.textView);
        String numero1 = txt_1.getText().toString();






        int resultado = Integer.parseInt(numero1) + 1 ;

        txt_1.setText(String.valueOf(resultado));


        Button btn =(Button) findViewById(R.id.btn_1_disminuir);
        btn.setBackgroundResource(R.drawable.menos);

        Button btn2 =(Button) findViewById(R.id.btn_1_aumentar);
        btn2.setBackgroundResource(R.drawable.sumar_presionado);



        /*
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context , numero1 , duration);
        toast.show();
        */

    }

    public void onclic_2aumentar(View v)
    {
        txt_2 = (TextView) findViewById(R.id.textView2);
        String numero1 = txt_2.getText().toString();

        int resultado = Integer.parseInt(numero1) + 1 ;

        txt_2.setText(String.valueOf(resultado));



        Button btn =(Button) findViewById(R.id.btn_2_disminuir);
        btn.setBackgroundResource(R.drawable.menos);


        Button btn2 =(Button) findViewById(R.id.btn_2_aumentar);
        btn2.setBackgroundResource(R.drawable.sumar_presionado);


        /*
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context , numero1 , duration);
        toast.show();
        */

    }

    public void onclic_resultado(View v)
    {
        txt_1 = (TextView) findViewById(R.id.textView);
        String numero1 = txt_1.getText().toString();
        int num1 = Integer.parseInt(numero1);


        txt_2 = (TextView) findViewById(R.id.textView2);
        String numero2 = txt_2.getText().toString();
        int num2 = Integer.parseInt(numero2);



        if (num1 < num2)
        {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context , "El ganador es EQUIPO 2" , duration);
        toast.show();
        }

        if (num1 > num2)
        {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context , "El ganador es EQUIPO 1" , duration);
            toast.show();

        }

        if (numero1.equals(numero2))
        {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context , "EMPATE DE EQUIPOS" , duration);
            toast.show();


        }


    }



}
