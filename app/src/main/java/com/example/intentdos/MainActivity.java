package com.example.intentdos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_system;
    private Button button_third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_system=(Button)findViewById(R.id.system);
        button_third=(Button)findViewById(R.id.third);
        button_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AppActivity.class);
                intent.putExtra("type",0);
                startActivity(intent);
            }
        });
        button_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AppActivity.class);
                intent.putExtra("type",1);
                startActivity(intent);
            }
        });
    }
}
