package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button quitter_btn,reinitialiser_btn;
    EditText nbr_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quitter_btn = findViewById(R.id.quitter_btn);
        quitter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


        reinitialiser_btn =findViewById(R.id.reinitialiser_btn);
        nbr_field=findViewById(R.id.nbr_field);
        reinitialiser_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nbr_field.setText("");
            }
        });
    }
}