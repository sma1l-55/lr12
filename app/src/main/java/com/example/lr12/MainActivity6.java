package com.example.lr12;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        MaterialButton materialButton = findViewById(R.id.materialButton);
        // Рекомендуется сначала сбросить базовые цвета
        materialButton.setBackgroundColor(Color.TRANSPARENT);
        materialButton.setBackgroundTintList(ColorStateList.valueOf(Color.RED));

// Любой R.drawable. который вам доступен
        materialButton.setIcon(
                ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground)
);

        materialButton.setIconTint(ColorStateList.valueOf(Color.WHITE));

        materialButton.setCornerRadius(16);
        materialButton.setRippleColor(ColorStateList.valueOf(
                ContextCompat.getColor(this, R.color.white)
        ));
        }

    }