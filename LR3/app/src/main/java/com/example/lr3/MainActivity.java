package com.example.lr3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.lr3.logic.Logic;

public class MainActivity extends AppCompatActivity {


    private TextView text1;
    private TextView text2;
    private EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView4);
        text2 = (TextView) findViewById(R.id.textView2);
        edit1 = (EditText) findViewById(R.id.editTextText);
    }

    public void onButtonClick(View view) {
        Logic calc=new Logic();
        calc.setX(Integer.parseInt(edit1.getText().toString()));
        text1.setText(calc.getString());
        text2.setText(""+calc.getResult());
    }
}