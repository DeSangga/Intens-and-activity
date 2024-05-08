package com.example.insandact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnbuka1, btnbuka2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnbuka1 = (Button) findViewById(R.id.btnbuka1);
        btnbuka2 = (Button) findViewById(R.id.btnbuka2);

        btnbuka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActiv1 = new Intent(getApplicationContext(), ins1.class);
                startActivity(BukaActiv1);
            }
        });

        btnbuka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaActiv2();
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void BukaActiv2(){
        Intent BukaActiv2 = new Intent(getApplicationContext(), ins2.class);
        startActivity(BukaActiv2);

     }



}