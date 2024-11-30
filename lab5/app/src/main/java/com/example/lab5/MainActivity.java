package com.example.lab5;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab5.Logic.Animal;
import com.example.lab5.Logic.AnimalTest;
import com.example.lab5.Logic.Cat;
import com.example.lab5.Logic.Fish;
import com.example.lab5.Logic.Parrot;
import com.example.lab5.Logic.Spider;

import java.util.List;

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
        AnimalTest anTest=new AnimalTest();
        anTest.createAnimalList();
        List<Animal> animalList =  anTest.getAnimalList();
        String s ="";
        for (Animal animal : animalList) {
            s += animal.toString()+"\n";
        }
        text1.setText(s);
    }
    public void onButtonSpiderClick(View view) {
        AnimalTest anTest=new AnimalTest();
        anTest.createAnimalList();
        List<Spider> animalList =  anTest.getSpiderList();
        String s ="";
        for (Animal animal : animalList) {
            s += animal.toString()+"\n";
        }
        text1.setText(s);
    }
    public void onButtonCatClick(View view) {
        AnimalTest anTest=new AnimalTest();
        anTest.createAnimalList();
        List<Cat> animalList =  anTest.getCatList();
        String s ="";
        for (Animal animal : animalList) {
            s += animal.toString()+"\n";
        }
        text1.setText(s);
    }
    public void onButtonFishClick(View view) {
        AnimalTest anTest=new AnimalTest();
        anTest.createAnimalList();
        List<Fish> animalList =  anTest.getFishList();
        String s ="";
        for (Animal animal : animalList) {
            s += animal.toString()+"\n";
        }
        text1.setText(s);
    }
    public void onButtonParrotClick(View view) {
        AnimalTest anTest=new AnimalTest();
        anTest.createAnimalList();
        List<Parrot> animalList =  anTest.getParrotList();
        String s ="";
        for (Animal animal : animalList) {
            s += animal.toString()+"\n";
        }
        text1.setText(s);
    }
}