package com.example.ex0602;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

     Button btn;
     int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
    }

    public void gogo(View view) {
        num++;
        if (num < 6)
        {
            btn.setText("This is a click number: "+ num);
        }
        else
        {
            btn.setText("Enough to click. Go to new start!");
            num = 0;
        }

    }
}