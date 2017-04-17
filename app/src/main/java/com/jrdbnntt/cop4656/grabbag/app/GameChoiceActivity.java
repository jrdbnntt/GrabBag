package com.jrdbnntt.cop4656.grabbag.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jrdbnntt.cop4656.grabbag.R;

public class GameChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_choice);
    }

    public void clickJoinGroup(View view)
    {
        Intent intent = new Intent(this, JoinGameActivity.class);
        startActivity(intent);
    }

    public void clickCreateGroup(View view)
    {
        Intent intent = new Intent(this, CreateGameActivity.class);
        startActivity(intent);
    }
}

