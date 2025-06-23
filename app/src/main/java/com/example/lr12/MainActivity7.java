package com.example.lr12;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        TextView textView = findViewById(R.id.textik);
        Button btn = findViewById(R.id.btn);
        MaterialButton mtrbtn = findViewById(R.id.mtrbtn);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                button.setBackgroundColor(Color.RED);
                String textButton = button.getText().toString();
                textView.setText(""+ textButton + "была нажата");
            }
        };
        btn.setOnClickListener(listener);
        mtrbtn.setOnClickListener(listener);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("Долго как-то");
                textView.setTextColor(Color.RED);
                return true;
            }
        });
        mtrbtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("CnoBa долго");
                textView.setTextColor(Color.BLACK);
                return false;
            }
        });
        // OnTouchListener
// Образовательная касания экрана с детальной информацией о движении

        View.OnTouchListener onTouchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    // Начало касания
                    case MotionEvent.ACTION_DOWN:
                        // Уменьшает кнопку при нажатии
                        v.animate().scaleX(0.65f).scaleY(0.65f).setDuration(100).start();
                        break;
                    // Движение пальца
                    case MotionEvent.ACTION_MOVE:
                        float x = event.getX();
                        Log.e("AXISX", ""+x);
                        if (x>0)
                            v.animate().scaleX(0.30f).scaleY(0.30f).setDuration(50).start();
                else
                        v.animate().scaleX(0.80f).scaleY(0.80f).setDuration(100).start();
                        break;
                    // Окончание касания
                    case MotionEvent.ACTION_UP:
                        // Возвращает кнопку в исходное состояние
                        v.animate().scaleX(1f).scaleY(1f).setDuration(100).start();
                        break;
                }
                return false; // Возвращаем false, чтобы другие слушатели тоже получили событие
            }
        };

        mtrbtn.setOnTouchListener(onTouchListener);
        btn.setOnTouchListener(onTouchListener);
    }
}