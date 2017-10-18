package com.joseaguilar.firebase_notificacionesporfirebaseconsole.Clases;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

//Paso 1 : Extendemos al servicio FirebaseInstanceIdService
public class MiFirebaseInstanceIdService extends FirebaseInstanceIdService {
    public static final String TAG = "NOTICIAS";

    //Paso 2 : agregamos el metodo que hara que traigamos el token del celular asi este se actualice
    //este metodo se ejecutada cada vez que nos otorgan un token
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        //Obtenemos el token que nos han generado
        String token = FirebaseInstanceId.getInstance().getToken();
        //Se recomienda siempre crear notificaciones "LOG" internas del proyecto
        Log.d(TAG,"Token: "+token);
        

    }
}
