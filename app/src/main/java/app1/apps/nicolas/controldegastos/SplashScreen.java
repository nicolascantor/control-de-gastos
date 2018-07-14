package app1.apps.nicolas.controldegastos;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                
                SharedPreferences primerIngreso = getSharedPreferences("primerIngreso", Context.MODE_PRIVATE);
                String verificacion = primerIngreso.getString("primerIngreso", "primera vez");

                if(verificacion=="primera vez"){

                    SharedPreferences.Editor editor = primerIngreso.edit();
                    editor.putString("primera vez", "versio 1.0.0 accedido xjhfhdsls354fg4srg");
                    editor.commit();

                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);

                }else {

                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);

                }



            }
        }, 6000);



    }



}
