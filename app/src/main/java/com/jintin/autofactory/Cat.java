package com.jintin.autofactory;

import android.util.Log;

@AutoElement(AnimalTags.CAT)
public class Cat implements Animal {
    @Override
    public void bark() {
        Log.e("jintin", "meow");
    }
}
