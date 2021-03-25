package com.example.fruitsandvegetableclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    Animation top;
    TextView title2,word;
    LottieAnimationView animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        title2=(TextView)findViewById(R.id.title);
        word=(TextView)findViewById(R.id.word);
        animation=(LottieAnimationView) findViewById(R.id.animation);
        top= AnimationUtils.loadAnimation(this,R.anim.top);
        title2.setAnimation(top);
        word.setAnimation(top);
        animation.setAnimation(top);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animation.playAnimation();
            }
        },1500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),Classifier.class);
                startActivity(i);
                finish();
            }
        },6200);
    }
}