package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button quitter_btn,reinitialiser_btn,left_btn,right_btn,mid_btn;
    EditText nbr_field;
    TextView multiplication_table;
    ConstraintLayout layout;

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
        multiplication_table=findViewById(R.id.multiplication_table);
        reinitialiser_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nbr_field.setText("");
                String etat0="? * 0 = ?\n? * 1 = ?\n? * 2 = ?\n? * 3 = ?\n? * 4 = ?\n? * 4 = ?\n? * 5 = ?\n? * 6 = ?\n? * 7 = ?\n? * 8 = ?\n? * 9 = ?\n? * 10 = ?";
                multiplication_table.setText(etat0);
            }
        });

        layout=findViewById(R.id.layout2);

        mid_btn= (Button) findViewById(R.id.mid_btn);
        mid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.pink);
            }
        });


        left_btn= findViewById(R.id.left_btn);
        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.white);
            }
        });

        right_btn=findViewById(R.id.right_btn);
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.purple_200);
            }
        });





    }
}