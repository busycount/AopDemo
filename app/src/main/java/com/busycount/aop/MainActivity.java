package com.busycount.aop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        Button btn1 = findViewById(R.id.button1);
//        Button btn2 = findViewById(R.id.button2);
//        Button btn3 = findViewById(R.id.button3);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                L.d("btn1-" + i++);
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                L.d("btn2-" + i++);
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @DoubleClick
//            @Override
//            public void onClick(View v) {
//                L.d("btn3-" + i++);
//            }
//        });
        initView();
    }

    @CheckStatus
    public void initView() {
    }

    int i;

    @OnClick(R.id.button1)
    public void onButton1Clicked() {
        L.d("btn1-" + i++);
    }

    @OnClick(R.id.button2)
    public void onButton2Clicked() {
        L.d("btn2-" + i++);
    }

    @OnClick(R.id.button3)
    public void onButton3Clicked() {
        L.d("btn3-" + i++);
    }
}
