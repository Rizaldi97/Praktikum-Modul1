package com.example.asus.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Eatbus,Abnormal;
    EditText Text1,Text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Eatbus = (Button)findViewById(R.id.Eatbus);
        Abnormal = (Button)findViewById(R.id.Abnormal);
        Text1 = (EditText)findViewById(R.id.Text1);
        Text2 = (EditText)findViewById(R.id.Text2);


        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("makanan",Text1.getText().toString());
                intent.putExtra("jumlah",Text2.getText().toString());
                intent.putExtra("tempat",Eatbus.getText().toString());
                intent.putExtra("tempat",Abnormal.getText().toString());

                int total = 50000 *
                        Integer.parseInt(Text2.getText().toString());
                //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
                startActivity(intent);

            }
        });


        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                //intent.putExtra("harga",vHasil);
                int total = 50000 * Integer.parseInt(Text2.getText().toString());
                //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("makanan",Text1.getText().toString());
                intent.putExtra("jumlah",Text2.getText().toString());
                intent.putExtra("tempat",Eatbus.getText().toString());
                intent.putExtra("tempat",Abnormal.getText().toString());
                intent.putExtra("price",total);
                startActivity(intent);
            }
        });
    }


}
