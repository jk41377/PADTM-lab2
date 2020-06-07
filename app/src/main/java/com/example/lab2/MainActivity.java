package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lab2", "metoda onCreate");
        Toast.makeText(this, "metoda onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lab2", "metoda onResume");
        Toast.makeText(this, "metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lab2", "metoda onStart");
        Toast.makeText(this, "metoda onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lab2", "metoda onPause");
        Toast.makeText(this, "metoda onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lab2", "metoda onStop");
        Toast.makeText(this, "metoda onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lab2", "metoda onRestart");
        Toast.makeText(this, "metoda onRestart", Toast.LENGTH_SHORT).show();
    }
}