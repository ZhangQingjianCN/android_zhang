package com.taoxue.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox eatingBox, sleepingBox, dotaBox, allBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatingBox = (CheckBox) findViewById(R.id.eatingBox);
        sleepingBox = (CheckBox) findViewById(R.id.sleepingBox);
        dotaBox= (CheckBox) findViewById(R.id.dotaBox);
        allBox = (CheckBox)findViewById (R.id.allBox);         //获取控件对象;

        AllCheckedListener allCheckedListener = new AllCheckedListener();   //获取监听器对象;

        allBox.setOnCheckedChangeListener(allCheckedListener);             //绑定控件和监听器;
    }

    class AllCheckedListener implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            eatingBox.setChecked(isChecked);
            sleepingBox.setChecked(isChecked);
            dotaBox.setChecked(isChecked);

        }
    }
}
