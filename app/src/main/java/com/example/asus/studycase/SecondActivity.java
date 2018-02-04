package com.example.asus.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView makan,menu,harga,porsi;
    int io;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        makan = (TextView)findViewById(R.id.Makan);
        menu = (TextView)findViewById(R.id.Menu);
        harga = (TextView)findViewById(R.id.Harga);
        porsi = (TextView)findViewById(R.id.Porsi);

        makan.setText(getIntent().getExtras().getString("tempat"));
        menu.setText(getIntent().getExtras().getString("makanan"));

        porsi.setText(getIntent().getExtras().getString("jumlah"));
        Intent intent = getIntent();
        io = intent.getIntExtra("price", (byte) 0);

        harga.setText("Rp" +io);
        Toast toast = null; //inisiasi
        if (io < 65000){
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja atuh", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan makan disini aja atuh
        }else{
            toast = Toast.makeText(getApplicationContext(), "Jangan disini, terlalu mahal", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan jangan disini, terlalu mahal
        }
        toast.show();//untuk menampilkan tulisan
    }

}

