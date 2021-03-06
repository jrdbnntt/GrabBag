package com.jrdbnntt.cop4656.grabbag.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

import com.jrdbnntt.cop4656.grabbag.R;

public class MainScreen extends AppCompatActivity {
    private static final String TAG = "MainScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);

        //Token generation for the device's unique token. Could be deprecated and removed later.
        String newToken = FirebaseInstanceId.getInstance().getToken();
        String msg = getString(R.string.msg_token_fmt, newToken);
        Log.d(TAG, msg);
    }

    public void clickCreate(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void clickLogIn(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
