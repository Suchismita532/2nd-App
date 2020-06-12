package com.example.fadingapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView doraemon=(ImageView) findViewById(R.id.doraemon);
                doraemon.animate().translationXBy(1000f).translationY(1000f).rotationBy(2700f).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView doraemon=(ImageView) findViewById(R.id.doraemon);
        doraemon.setTranslationX(-1000f);
        doraemon.setTranslationY(-1000f);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
