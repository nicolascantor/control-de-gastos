package app1.apps.nicolas.controldegastos;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterIngreso extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Ingreso> items;


    public AdapterIngreso (Activity activity, ArrayList<Ingreso> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(Ingreso ingreso) {

            items.add(ingreso);

    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.spinner_config2_mas, null);
        }

        Ingreso dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.textNombreIngrero);
        title.setText(dir.getNombre());

        TextView description = (TextView) v.findViewById(R.id.textValorIngreso);
        description.setText(dir.getValor());

        return v;
    }

}
