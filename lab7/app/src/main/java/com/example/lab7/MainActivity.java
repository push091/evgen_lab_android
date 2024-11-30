package com.example.lab7;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab7.Logic.DogTest;

public class MainActivity extends AppCompatActivity {
    private TextView dogTextView;
    private Spinner breedSpinner;
    private DogTest dogTest = new DogTest();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        dogTextView = findViewById(R.id.dogTextView);
        breedSpinner = findViewById(R.id.breedSpinner);
        dogTest.makeDogList();
    }
    public void onShowDogsButtonClick(View view) {
        String selectedBreed = breedSpinner.getSelectedItem().toString();
        dogTextView.setText(dogTest.getDogsByBreed(selectedBreed));
    }
}