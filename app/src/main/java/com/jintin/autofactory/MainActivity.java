package com.jintin.autofactory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal dog = AnimalFactory.createAnimal(AnimalTags.CAT);

        TextView label = findViewById(R.id.label);
        label.setText(dog.bark());
    }
}
