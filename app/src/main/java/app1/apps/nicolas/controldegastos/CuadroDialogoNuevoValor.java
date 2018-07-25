package app1.apps.nicolas.controldegastos;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class CuadroDialogoNuevoValor {

    public interface finalizoCuadroDialgo{
        void resultadoCuadroDialogo(String nombre, String valor);
    }

    private finalizoCuadroDialgo interfaz;

    public CuadroDialogoNuevoValor(Context contexto, finalizoCuadroDialgo actividad){

        interfaz = actividad;

        final Dialog dialogoNuevoValor = new Dialog(contexto);
        dialogoNuevoValor.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogoNuevoValor.setCancelable(false);
        dialogoNuevoValor.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogoNuevoValor.setContentView(R.layout.dialog_config_paso2);

        final EditText nombre = (EditText) dialogoNuevoValor.findViewById(R.id.nombreNuevoValor);
        final EditText valor = (EditText) dialogoNuevoValor.findViewById(R.id.nuevoValor);
        Button btnIngresarNuevoValor = (Button) dialogoNuevoValor.findViewById(R.id.btnNuevoValor);

        valor.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        btnIngresarNuevoValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                interfaz.resultadoCuadroDialogo(nombre.getText().toString(), valor.getText().toString());
                dialogoNuevoValor.dismiss();
            }
        });

        dialogoNuevoValor.show();

    }
}
