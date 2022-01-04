package com.example.recyclerdemo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    String names[]={"C","CPP","HTML","JAVA","JS","KOTLIN","PYTHON"};
    int images[]={R.drawable.c,R.drawable.cpp,R.drawable.html,R.drawable.java,R.drawable.js,R.drawable.kotlin,R.drawable.python};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setAdapter(new MyAdapter(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private class MyAdapter extends RecyclerView.Adapter<MYHolder> {
        Context context;
        public MyAdapter(MainActivity mainActivity) {
            context=mainActivity;

        }

        @NonNull
        @Override
        public MYHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
            MYHolder h1=new MYHolder(view);
            return h1;
        }

        @Override
        public void onBindViewHolder(@NonNull MYHolder holder, int position) {
           holder.t1.setText(names[position]);
           holder.img.setImageResource(images[position]);
        }

        @Override
        public int getItemCount() {
            return names.length;
        }
    }

    private class MYHolder extends RecyclerView.ViewHolder {
        TextView t1;
        ImageView img;
        public MYHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.textView);
            img=itemView.findViewById(R.id.imageView);
        }
    }
}