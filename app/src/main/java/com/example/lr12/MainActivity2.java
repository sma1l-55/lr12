package com.example.lr12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Button btn = findViewById(R.id.btnStart);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Код при нажатии
            }
        });
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Код при нажатии
            }
        };
        btn.setOnClickListener(listener);
        btn.setOnClickListener(listener);
        View.OnClickListener listener1 = v -> {

        };
        btn.setOnClickListener(v -> {

        });
        btn.setOnClickListener(listener1);
    }
    public void onClickStart(View v)
    {
        // Код при нажатии
    }

}
