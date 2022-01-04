package com.example.optionmenu1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menumain,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                Toast.makeText(getApplicationContext(), "About clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Share:
                Toast.makeText(getApplicationContext(), "Share clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Contacts:
                Toast.makeText(getApplicationContext(), "Contacts clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.status:
                Toast.makeText(getApplicationContext(), "Status clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(getApplicationContext(), "no option club", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}