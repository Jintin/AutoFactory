package com.jintin.autofactory;

import android.util.Log;

@AutoElement(tag = AnimalTags.DOG)
public class Dog implements Animal {
    @Override
    public void bark() {
        Log.e("jintin", "woo");
    }
}
