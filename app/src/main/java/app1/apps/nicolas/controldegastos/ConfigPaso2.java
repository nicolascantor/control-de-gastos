package app1.apps.nicolas.controldegastos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ConfigPaso2 extends AppCompatActivity implements CuadroDialogoNuevoValor.finalizoCuadroDialgo{

    Context contexto;
    TextView nombreIngresado, valorIngresado;
    ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso2);

        list = (ListView) findViewById(R.id.listaIngresos);

        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_item_layout, arrayList);
        list.setAdapter(adapter);


        contexto = this;


        Button agregarIngreso = findViewById(R.id.btnAgregarMas);

        agregarIngreso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                new CuadroDialogoNuevoValor(contexto, ConfigPaso2.this);
            }
        });
    }


    @Override
    public void resultadoCuadroDialogo(String nombre, String valor) {

        //nombreIngresado.setText(nombre);
        //valorIngresado.setText(valor);
        arrayList.add(nombre);
        adapter.notifyDataSetChanged();

    }
}

