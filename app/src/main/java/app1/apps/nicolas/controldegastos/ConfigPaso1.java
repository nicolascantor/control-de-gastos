package app1.apps.nicolas.controldegastos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigPaso1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_paso1);

        Button continuar = findViewById(R.id.continuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConfigPaso1.this, ConfigPaso2.class);
                startActivity(intent);
            }
        });
    }
}
