package com.jintin.autofactory;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Animal dog = AnimalFactory.createAnimal(AnimalTags.CAT);
        dog.bark();
    }
}
