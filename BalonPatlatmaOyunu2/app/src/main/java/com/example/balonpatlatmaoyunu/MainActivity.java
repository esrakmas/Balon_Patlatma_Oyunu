package com.example.balonpatlatmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_basla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sayfa 1 ile 2 arası geçis yaptık
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                

            }
        });
    }
}