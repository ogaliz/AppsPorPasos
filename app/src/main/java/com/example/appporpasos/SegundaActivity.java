package com.example.appporpasos;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

//  Instanciamos los Objetos de nuestra interfaz y el Bundle donde guardaremos los datos recibidos
    TextView txtpassValue;
    Button btnpassValueSecond;
    Bundle datos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      indicamos la actividad a la que hace referencia el archivo java
        setContentView(R.layout.second_activity);

//      Inicializamos los objeros de la iterfaz
        txtpassValue = (TextView)findViewById(R.id.txtsegundo);
        btnpassValueSecond = (Button)findViewById(R.id.botonsegundo);

//      Tomamos el texto que escribió el usuario
        datos = getIntent().getExtras();
        txtpassValue.setText(datos.getString("valor"));

//      Evento onClick para volver a la Activity anterior a traves de una accion o Intent
        btnpassValueSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(volver);
            }
        });
    }
}
