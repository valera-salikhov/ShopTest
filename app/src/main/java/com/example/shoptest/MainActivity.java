package com.example.shoptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VKSdk.initialize(this);
        Intent i = new Intent(MainActivity.this, Login.class);
        //startActivityForResult(i, 1);
        VKSdk.login(this, VKScope.WALL, VKScope.PHOTOS);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Callback callback = new Callback()
        
    }
}