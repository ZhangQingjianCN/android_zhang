package com.taoxue.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    * 实现一个监听器功能
    */

    private TextView textView;
    private Button button;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);    //第一步，获取代表控件的对象；

        ButtonListener buttonListener = new ButtonListener();     //第三步，获取监听器对象

        button.setOnClickListener(buttonListener);       //第四步，绑定控件对象与监听器对象；


    }

    class ButtonListener implements View.OnClickListener {     //第二步，定义一个内部类，实现监听器接口

        @Override
        public void onClick(View v) {                      //复写接口中的onClick方法；
            count++;
            textView.setText(count + "");
        }
    }

}
