package com.example.appporpasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

//  Creamos los dos metodos para crear el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_en_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

//  Creamos el método para configurar las acciones
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//      Estamos capturando el id del elemento del menú para establecer la acción
        int id = item.getItemId();
        if (id == R.id.configuracion){
            Toast.makeText(MainActivity.this, "Has pulsado configuración", Toast.LENGTH_LONG).show();
            return  true;
        }
        if (id == R.id.informacion){
            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            startActivity(intent);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
