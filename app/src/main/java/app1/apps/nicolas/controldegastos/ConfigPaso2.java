package app1.apps.nicolas.controldegastos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfigPaso2 extends AppCompatActivity implements CuadroDialogoNuevoValor.finalizoCuadroDialgo{

    Context contexto;
    TextView nombreIngresado, valorIngresado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso2);

        nombreIngresado = (TextView) findViewById(R.id.textNombre);
        valorIngresado  = (TextView) findViewById(R.id.textValor);

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
        nombreIngresado.setText(nombre);
        valorIngresado.setText(valor);
    }
}

