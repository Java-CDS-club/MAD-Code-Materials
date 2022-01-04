package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
Button b1,b2;
final String filename="ANUPAMA_SP";
SharedPreferences mshare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editTextTextPersonName);
        t2 = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        mshare=getSharedPreferences(filename,MODE_PRIVATE);
        SharedPreferences.Editor myeditor=mshare.edit();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myeditor.putString("fname",t1.getText().toString());
                myeditor.putString("sname",t2.getText().toString());
                myeditor.apply();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first=mshare.getString("fname","aaa");
                String second=mshare.getString("sname","bbb");
                t1.setText(first);
                t2.setText(second);

            }
        });

    }
}