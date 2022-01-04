package com.example.contextualmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    TextView t1;
    LinearLayout linearLayout;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        linearLayout=findViewById(R.id.linear);
      //  registerForContextMenu(t1);
      t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) MainActivity.this);
                popup.inflate(R.menu.item);
                popup.show();
            }
        });



    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.About:
                Toast.makeText(this, "Selected Item: " +item.getItemId(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contacts:
                linearLayout.setBackgroundColor(Color.CYAN);
                return true;
            case R.id.search:
                linearLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.share:
                // do your code
                return true;
            case R.id.status:
                // do your code
                return true;
            case R.id.mystatus:
                // do your code
                return true;
            default:
                return false;
        }
    }


/*
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Choose the color");
      MenuInflater menuInflater=getMenuInflater();
      menuInflater.inflate(R.menu.item,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.About){
            Toast.makeText(getApplicationContext(),item.getItemId(),Toast.LENGTH_SHORT).show();
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        else if(item.getItemId()==R.id.search){
            linearLayout.setBackgroundColor(Color.RED);
        }
        else
        {
            linearLayout.setBackgroundColor(Color.CYAN);
        }
        return  true;

    }*/

}