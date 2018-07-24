package app1.apps.nicolas.controldegastos;

import java.util.Currency;
import java.util.Locale;

public class Ingreso {

    public String nombre;
    public String valor;

    public Ingreso(){
        super();
    }

    public Ingreso(String nombre, String valor){
        super();
        this.nombre = nombre;
        this.valor = valor;

    }

    public String getNombre(){
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
