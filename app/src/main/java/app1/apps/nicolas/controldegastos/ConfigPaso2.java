package app1.apps.nicolas.controldegastos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ConfigPaso2 extends AppCompatActivity implements CuadroDialogoNuevoValor.finalizoCuadroDialgo{

    Context contexto;
    ArrayList<Ingreso> ingreso;
    ListView lv;
    AdapterIngreso adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso2);

        ingreso = new ArrayList<Ingreso>();
        lv = (ListView) findViewById(R.id.listaIngresos);
        adapter = new AdapterIngreso(this, ingreso);

        lv.setAdapter(adapter);

        contexto = this;


        Button agregarIngreso = (Button) findViewById(R.id.btnAgregarMas);

        Button guardarIngreso = (Button) findViewById(R.id.btnGuardarIngresos);

        agregarIngreso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                new CuadroDialogoNuevoValor(contexto, ConfigPaso2.this);
            }
        });

        guardarIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigPaso2.this, ConfigPaso3.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void resultadoCuadroDialogo(String nombre, String valor) {

        Ingreso ingresoNuevo = new Ingreso(nombre, valor);
        ingreso.add(ingresoNuevo);
        adapter.notifyDataSetChanged();

    }
}

