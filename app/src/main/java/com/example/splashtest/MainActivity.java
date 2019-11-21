package com.example.splashtest;
//1mipmap放張圖
//intent進階版(系統自動切換activity)
//2新增empty activity
//3拉imageView放該圖,定位
//希望先執行新增的activity再到main activity
//manifest會兩個activity
//intent filter是一開始執行的意思
//所以剪下貼到新增的activity的intent filter裡
//換intent filter是方法1, 方法2是到程式碼畫面換activity
//這邊老師少錄約30分鐘,到新增activity
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
