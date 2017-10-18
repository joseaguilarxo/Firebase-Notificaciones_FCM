package com.joseaguilar.firebase_notificacionesporfirebaseconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView)findViewById(R.id.txtMensaje);

        //creamos condicional para saber si el mensaje esta nulo o no
        if (getIntent().getExtras() !=null){ //traemos los extras de la data de la notificacion
            for (String key : getIntent().getExtras().keySet()){
                String value = getIntent().getExtras().getString(key);
                txt.append("\n" + key + ": " +value);
            }

        }
    }
}
