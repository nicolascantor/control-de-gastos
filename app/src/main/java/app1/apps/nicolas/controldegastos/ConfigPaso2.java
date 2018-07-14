package app1.apps.nicolas.controldegastos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfigPaso2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso2);
        final EditText nombre = new EditText(this);
        final EditText valor = new EditText(this);

        nombre.setHint("Nombre");
        valor.setHint("Valor.");


        Button agregarIngreso = findViewById(R.id.button);
        agregarIngreso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ConfigPaso2.this);

                // Configura el titulo.
                alertDialogBuilder.setTitle("Agregar Ingreso");

                // Configura el mensaje.
                alertDialogBuilder
                        .setMessage("Por favor ingrese ")
                        .setView(nombre)
                        .setView(valor)
                        .setCancelable(false)
                        .setPositiveButton("Si",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                //Si la respuesta es afirmativa aquí agrega tu función a realizar.
                            }
                        })
                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        }).create().show();
            }
        });
    }



}

