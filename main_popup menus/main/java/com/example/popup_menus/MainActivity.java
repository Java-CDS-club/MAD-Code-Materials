package com.example.popup_menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
TextView t1;
LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        l1=findViewById(R.id.linearLayout);
        //registerForContextMenu(t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,v);
                popupMenu.setOnMenuItemClickListener(MainActivity.this);
                popupMenu.inflate(R.menu.coloritem);
                popupMenu.show();
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId()==R.id.pink)
            l1.setBackgroundColor(Color.MAGENTA);
        if(item.getItemId()==R.id.Red)
            l1.setBackgroundColor(Color.RED);
        if(item.getItemId()==R.id.black)
            l1.setBackgroundColor(Color.BLACK);
        if(item.getItemId()==R.id.yellow)
            l1.setBackgroundColor(Color.YELLOW);
        if(item.getItemId()==R.id.Blue)
            l1.setBackgroundColor(Color.BLUE);
        return true;
    }



/*
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
    //   MenuInflater menuInflater=new MenuInflater(MainActivity.this);
     //  menuInflater.inflate(R.menu.coloritem,menu);
        menu.setHeaderTitle("Choose the color");
        menu.add(0,v.getId(),1,"red");
        menu.add(0,v.getId(),2,"yellow");
        menu.add(0,v.getId(),3,"blue");
        SubMenu sub=menu.addSubMenu("black");
        sub.add("pink");
        sub.add("green");
        sub.add("gray");
       super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("red"))
        {
            l1.setBackgroundColor(Color.RED);
        }
        if(item.getTitle().equals("yellow"))
        {
            l1.setBackgroundColor(Color.YELLOW);
        }
        if(item.getTitle().equals("blue"))
        {
            l1.setBackgroundColor(Color.BLUE);
        }
        if(item.getTitle().equals("black"))
        {
            l1.setBackgroundColor(Color.BLACK);
        }
        if(item.getTitle().equals("green"))
        {
            l1.setBackgroundColor(Color.GREEN);
        }
        return true;
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=new MenuInflater(MainActivity.this);
        menuInflater.inflate(R.menu.menuitems,menu);
                return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.contact)
        {
            Toast.makeText(getApplicationContext(),"Contacts selected",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.search)
        {
            Toast.makeText(getApplicationContext(),"search selected",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.mycontacts)
        {
            Toast.makeText(getApplicationContext(),"MyContact selected",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.mymessages)
        {
            Toast.makeText(getApplicationContext(),"mymessage selected",Toast.LENGTH_SHORT).show();
        }
        return true;
    }*/
}