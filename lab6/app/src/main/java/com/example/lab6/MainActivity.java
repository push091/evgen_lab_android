package com.example.lab6;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView block1;
    ImageView block2;
    ImageView block3;
    ImageView block4;
    ImageView block5;
    ImageView block6;
    ImageView block7;
    ImageView block8;
    ImageView block9;
    ImageView block10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        block1 = findViewById(R.id.block1_image);
        block2 = findViewById(R.id.block2_image);
        block3 = findViewById(R.id.block3_image);
        block4 = findViewById(R.id.block4_image);
        block5 = findViewById(R.id.block5_image);
        block6 = findViewById(R.id.block6_image);
        block7 = findViewById(R.id.block7_image);
        block8 = findViewById(R.id.block8_image);
        block9 = findViewById(R.id.block9_image);
        block10 = findViewById(R.id.block10_image);
    }

    public void onClickButton1(View view) {

        block10.setBackgroundColor(Color.parseColor("#0044AA"));
        block9.setBackgroundColor(Color.parseColor("#00CCFF"));
        block8.setBackgroundColor(Color.parseColor("#0066CC"));
        block7.setBackgroundColor(Color.parseColor("#0099CC"));
        block6.setBackgroundColor(Color.parseColor("#66CC33"));
        block5.setBackgroundColor(Color.parseColor("#99CC00"));
        block4.setBackgroundColor(Color.parseColor("#669900"));
        block3.setBackgroundColor(Color.parseColor("#FF6600"));
        block2.setBackgroundColor(Color.parseColor("#FF0066"));
        block1.setBackgroundColor(Color.parseColor("#FFCC00"));
    }
    public void onClickButton(View view) {

        block1.setBackgroundColor(Color.parseColor("#0044AA"));
        block2.setBackgroundColor(Color.parseColor("#00CCFF"));
        block3.setBackgroundColor(Color.parseColor("#0066CC"));
        block4.setBackgroundColor(Color.parseColor("#0099CC"));
        block5.setBackgroundColor(Color.parseColor("#66CC33"));
        block6.setBackgroundColor(Color.parseColor("#99CC00"));
        block7.setBackgroundColor(Color.parseColor("#669900"));
        block8.setBackgroundColor(Color.parseColor("#FF6600"));
        block9.setBackgroundColor(Color.parseColor("#FF0066"));
        block10.setBackgroundColor(Color.parseColor("#FFCC00"));
    }

}