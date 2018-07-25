package app1.apps.nicolas.controldegastos;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class CuadroDialogoNuevoEgreso {

    public String fijostrin;

    public interface finalizoCuadroDialgoEgreso{

        void resultadoCuadroDialogo(String nombre, String valor, String fijo);
    }

    private CuadroDialogoNuevoEgreso.finalizoCuadroDialgoEgreso interfaz;

    public CuadroDialogoNuevoEgreso(Context contexto, finalizoCuadroDialgoEgreso actividad){

        interfaz = actividad;

        final Dialog dialogoNuevoEgreso= new Dialog(contexto);
        dialogoNuevoEgreso.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogoNuevoEgreso.setCancelable(false);
        dialogoNuevoEgreso.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogoNuevoEgreso.setContentView(R.layout.dialog_config_paso3);

        final EditText nombre = (EditText) dialogoNuevoEgreso.findViewById(R.id.nombreNuevoEgreso);
        final EditText valor = (EditText) dialogoNuevoEgreso.findViewById(R.id.nuevoEgresoValor);
        final CheckBox fijo = (CheckBox) dialogoNuevoEgreso.findViewById(R.id.checkFijo);

        Button btnIngresarNuevoEgreso = (Button) dialogoNuevoEgreso.findViewById(R.id.btnNuevoEgreso);

        valor.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        btnIngresarNuevoEgreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fijo.isChecked()==true) {
                    fijostrin = "fijo";
                }
                if (fijo.isChecked()==true) {
                    fijostrin = "no";
                }

                interfaz.resultadoCuadroDialogo(nombre.getText().toString(), valor.getText().toString(), fijostrin);
                dialogoNuevoEgreso.dismiss();
            }
        });

        dialogoNuevoEgreso.show();

    }
}
