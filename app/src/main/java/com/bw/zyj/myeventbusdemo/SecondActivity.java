package com.bw.zyj.myeventbusdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bw.zyj.myeventbusdemo.bean.Bean;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.second_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //调用EcentBus里面的post（bean类的有参构造）方法，把需要的值存进bean包类中，然而当我们点击这个按钮调用这个方法，就会直接响应第一个Activity里面的，当我们按返回键的时候就会看到文本已经设置上去了。
                EventBus.getDefault().post(new Bean("猪妖精"));
            }
        });
    }
}
