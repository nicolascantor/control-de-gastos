package app1.apps.nicolas.controldegastos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ConfigPaso3 extends AppCompatActivity implements CuadroDialogoNuevoEgreso.finalizoCuadroDialgoEgreso {



    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso3);

        contexto = this;



        Button agregarEgreso = (Button) findViewById(R.id.btnAgregarEgre);
        Button guardarEgresos = (Button) findViewById(R.id.btnGuardadEgre);

        agregarEgreso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                new CuadroDialogoNuevoEgreso(contexto, ConfigPaso3.this);
            }
        });



    }

    @Override
    public void resultadoCuadroDialogo(String nombre, String valor, String fijo) {
        String nombre1 = nombre;
    }
}
