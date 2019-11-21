package com.example.splashtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class splashActivity extends AppCompatActivity {
private ConstraintLayout act_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation fadeIn = AnimationUtils.loadAnimation(splashActivity.this, R.anim.fade_in);
                 //變數名稱
        act_in = findViewById(R.id.carT);//ConstrainLayout
        act_in.setAnimation(fadeIn);//把淡入效果套進去

//4
        Thread timer = new Thread(){
//5右鍵產生overrideMethods, 選javalangThread裡的run():void
            @Override
            public void run(){
                super.run();
//6左邊res新增Animation resource file(動畫意思)出anim資料夾
//alpha值是透明度
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent();
                    i.setClass(splashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
