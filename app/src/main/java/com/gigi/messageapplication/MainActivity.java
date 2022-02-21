package com.gigi.messageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnS;
    EditText etM;

    public static final String EXTRA_MSG="com.gigi.messageapplication.msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnS=findViewById(R.id.btnSend);
        etM=findViewById(R.id.etMessage);

    }

    public void sendMessage(View v)
    {

        String message=etM.getText().toString();

        Intent i=new Intent(this,DisplayActivity.class);

        i.putExtra(EXTRA_MSG,message);

        startActivity(i);

    }



}