package com.example.multiwindowgio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btn_move);
        Button btnShare = findViewById(R.id.btn_share);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Berita.class));
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT, "Hallo Saya Gio");
                intent.setType("text/plain");

                startActivity(Intent.createChooser(intent, "share to :"));
            }
        });
    }
}