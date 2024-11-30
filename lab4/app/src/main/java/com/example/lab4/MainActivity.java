package com.example.lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab4.logic.Dog;
import com.example.lab4.logic.DogTest;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView);

    }

    public void onButtonClick(View view) {
        DogTest dogTest = new DogTest();
        dogTest.createArrEmp();
        Dog[] dogArr= dogTest.getArrEmp();
        String sDogArr="";
        for (int i=0; i<dogArr.length; i++ ){
            sDogArr += dogArr[i].toString()+"\n";
        }
        text1.setText(sDogArr);
    }
}