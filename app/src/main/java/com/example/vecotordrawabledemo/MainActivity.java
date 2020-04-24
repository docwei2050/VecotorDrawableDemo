package com.example.vecotordrawabledemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private ImageView mImageView2;
    private ImageView mImageView3;
    private ImageView mImageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView1 = (ImageView) findViewById(R.id.imageView);
        mImageView2 = (ImageView) findViewById(R.id.imageView2);
        mImageView3 = (ImageView) findViewById(R.id.imageView3);
        mImageView4 = (ImageView) findViewById(R.id.imageView4);


        mImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView1.setSelected(true);
                StateListDrawable drawable = (StateListDrawable) mImageView1.getDrawable();
                Drawable current =drawable.getCurrent();
                if (current instanceof Animatable) {
                    Animatable animatable = (Animatable) current;
                   animatable.start();
                }

            }
        });

        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView2.setSelected(true);
                StateListDrawable drawable = (StateListDrawable) mImageView2.getDrawable();
                Drawable current =drawable.getCurrent();
                if (current instanceof Animatable) {
                    Animatable animatable = (Animatable) current;
                    animatable.start();
                }
            }
        });

        mImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView3.setSelected(true);
                StateListDrawable drawable = (StateListDrawable) mImageView3.getDrawable();
                Drawable current =drawable.getCurrent();
                if (current instanceof Animatable) {
                    Animatable animatable = (Animatable) current;
                    animatable.start();
                }
            }
        });

        mImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView4.setSelected(true);
                StateListDrawable drawable = (StateListDrawable) mImageView4.getDrawable();
                Drawable current =drawable.getCurrent();
                if (current instanceof Animatable) {
                    Animatable animatable = (Animatable) current;
                    animatable.start();
                }
            }
        });


    }

}
