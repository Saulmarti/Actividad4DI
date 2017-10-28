package com.example.a2dam.actividad4_di;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.a2dam.actividad4_di.R.id.fondoRojo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , View.OnLongClickListener{

    private TextView mensajeOculto;
    private LinearLayout layoutStar;
    private Button rojo;
    private Button negro;
    private CheckBox mensajeCheck;
    private TextView click;
    private TextView estrellasTxt;
    private RatingBar estrellas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeOculto = (TextView) findViewById(R.id.mensaje);
        mensajeCheck = (CheckBox) findViewById(R.id.mostrar);
        mensajeCheck.setOnClickListener(this);
        layoutStar = (LinearLayout) findViewById(R.id.layoutEstrellas);
        rojo = (Button) findViewById(R.id.fondoRojo);
        rojo.setOnClickListener(this);
        negro = (Button) findViewById(R.id.letrasNegras);
        negro.setOnClickListener(this);
        click = (TextView) findViewById(R.id.clickLargo);
        click.setOnLongClickListener(this);
        estrellas = (RatingBar) findViewById(R.id.ratingBar3);
        estrellasTxt = (TextView) findViewById(R.id.Estrellas);



        mensajeOculto.setVisibility(View.INVISIBLE);
        
        estrellas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                estrellasTxt.setText(String.valueOf(rating+"/5 Estrellas"));

            }
        });
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.fondoRojo) {
            layoutStar.setBackgroundColor(Color.RED);

        }

        if(v.getId()==R.id.letrasNegras){
            negro.setTextColor(Color.RED);

        }


        if(mensajeCheck.isChecked()){
            mensajeOculto.setVisibility(View.VISIBLE);

        }
        }





    public boolean onLongClick(View v) {
        Toast.makeText(getApplicationContext(),
                "Se ha hecho un click largo", Toast.LENGTH_SHORT).show();

        return false;
    }


}
