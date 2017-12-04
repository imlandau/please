package com.delaroystudios.sqlitelogin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.delaroystudios.sqlitelogin.R;

public class UsersActivity extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent);
    }
    Button btn = (Button) findViewById(R.id.btn);
    btn.setOnClickListener(new View.OnClickListener() {
        startActivity(new Intent(UsersActivity.this, Main.class));
        } // end onClick
    });

}
