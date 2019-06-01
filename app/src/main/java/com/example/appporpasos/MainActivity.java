package com.example.appporpasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//  Creamos objetos de aquello con lo que queremos interactuar de la interfaz
    Button btnsiguiente;
    EditText edttuNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Inicializamos los objeros de la iterfaz
        btnsiguiente = (Button)findViewById(R.id.btnpassvalue);
        edttuNombre = (EditText)findViewById(R.id.edtpassvalue);

//      Creamos el evento onClick
        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              Guardamos el valor del EditText en un String
                String valorPasado = edttuNombre.getText().toString();

                Toast.makeText(MainActivity.this, valorPasado, Toast.LENGTH_LONG).show();

//              Creamos el Intent para generar una accion
                Intent pasaTexto = new Intent(MainActivity.this, SegundaActivity.class);
                pasaTexto.putExtra("valor", valorPasado);
                startActivity(pasaTexto);

            }
        });
    }
}
