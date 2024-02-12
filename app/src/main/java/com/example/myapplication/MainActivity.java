package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    public final String f = "Malorodov";
    public static final String key = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);
        EditText createText = findViewById(R.id.RegPassword);
        btn.setOnClickListener(e->
        {
            if(createText.getText().toString().equals(f))
            {
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtra(key, "Welcome " + f);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "Try again", Toast.LENGTH_LONG).show();
                createText.getText().clear();
            }
        });
    }//RegPassword
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
}