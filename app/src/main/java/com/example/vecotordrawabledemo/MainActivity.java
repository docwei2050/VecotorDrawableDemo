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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView1 = (ImageView) findViewById(R.id.imageView1);
        mImageView2 = findViewById(R.id.imageView2);
  /*      mImageView2 = (ImageView) findViewById(R.id.imageView2);
        mImageView3 = (ImageView) findViewById(R.id.imageView3);
        mImageView4 = (ImageView) findViewById(R.id.imageView4);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat1 = AnimatedVectorDrawableCompat.create(
                this, R.drawable.adhesive_animted_vector);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = AnimatedVectorDrawableCompat.create(
                this, R.drawable.path2_anim);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat3 = AnimatedVectorDrawableCompat.create(
                this, R.drawable.path3_anim);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat4 = AnimatedVectorDrawableCompat.create(
                this, R.drawable.path4_anim);
        mImageView1.setImageDrawable(animatedVectorDrawableCompat1);
        mImageView2.setImageDrawable(animatedVectorDrawableCompat2);
        mImageView3.setImageDrawable(animatedVectorDrawableCompat3);
        mImageView4.setImageDrawable(animatedVectorDrawableCompat4);*/

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
                mImageView2.setSelected(true);
                StateListDrawable drawable2 = (StateListDrawable) mImageView2.getDrawable();
                Drawable current2 =drawable2.getCurrent();
                if (current2 instanceof Animatable) {
                    Animatable animatable = (Animatable) current2;
                    animatable.start();
                }
            }
        });

       /* mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView2.getDrawable()).start();
            }
        });

        mImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView3.getDrawable()).start();
            }
        });

        mImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView4.getDrawable()).start();
            }
        });*/


    }

}
