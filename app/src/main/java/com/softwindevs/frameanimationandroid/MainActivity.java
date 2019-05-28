package com.softwindevs.frameanimationandroid;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable progressAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.animation_imageview);
        progressAnimation =    (AnimationDrawable)imageView.getDrawable();
        progressAnimation.setCallback(imageView);
        progressAnimation.setVisible(true, true);
        imageView.post(new Starter());
    }

    class Starter implements Runnable {
        public void run() {
            progressAnimation.start();
        }
    }
}
