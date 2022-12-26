package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали первую обезьянку",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали вторую обезьянку",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали третью обезьянку",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Всплывающие окна работают!",
                Toast.LENGTH_LONG);
        myToast.show();
    }
}