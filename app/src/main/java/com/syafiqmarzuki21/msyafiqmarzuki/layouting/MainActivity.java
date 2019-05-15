package com.syafiqmarzuki21.msyafiqmarzuki.layouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //kenalan variabel
    Button btnLinear,btnRelative,btnFrame,btnConstraint,btnScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sambungkan inisialisasi
        btnLinear = (Button) findViewById(R.id.btnlinear);
        btnRelative = (Button) findViewById(R.id.btnrelative);
        btnFrame = (Button) findViewById(R.id.btnframe);
        btnConstraint = (Button) findViewById(R.id.btnconstraint);
        btnScroll = (Button) findViewById(R.id.btnscroll);

        //mau lakukan apa
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Ini Linear Layout",Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(pindah);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Komponen Variabel = new Komponen()this
                //Content -> Nama activity
                AlertDialog.Builder pesan = new AlertDialog.Builder(MainActivity.this);
                pesan.setTitle("AlertDialog!!");
                pesan.setMessage("Ini Alert Dialog");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Anda Memilih OK",Toast.LENGTH_SHORT).show();
                        Intent pindah = new Intent(MainActivity.this, RelativeLayout.class);
                        startActivity(pindah);
                    }
                });
                pesan.setNegativeButton("NO", null);
                pesan.show();

            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, FrameLayout.class);
                startActivity(pindah);

            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, ConstraintLayout.class);
                startActivity(pindah);

            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, ScrollView.class);
                startActivity(pindah);

            }
        });
    }
}
