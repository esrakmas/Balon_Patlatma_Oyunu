package com.example.balonpatlatmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button btn;
    TextView final_score_textview;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn=findViewById(R.id.btn_tekrar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sayfa3 ile 2 arası geçis yaptık
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);

            }
        });


    }
}