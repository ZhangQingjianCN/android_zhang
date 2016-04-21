package com.taoxue.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckBox eatingBox, sleepingBox, dotaBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatingBox = (CheckBox) findViewById(R.id.eatingBox);
        sleepingBox = (CheckBox) findViewById(R.id.sleepingBox);
        dotaBox = (CheckBox) findViewById(R.id.dotaBox);               //第一步；获取控件对象；

        CheckOnClickListener checkBoxListener = new CheckOnClickListener();   //第三步，获取监听器对象;

        eatingBox.setOnCheckedChangeListener(checkBoxListener);
        sleepingBox.setOnCheckedChangeListener(checkBoxListener);
        dotaBox.setOnCheckedChangeListener(checkBoxListener);                //第四步，控件与监听器绑定;






        /*
        CheckBoxListener checkBoxListener = new CheckBoxListener();   //第三步，获取监听器对象；

        eatingBox.setOnClickListener(checkBoxListener);
        sleepingBox.setOnClickListener(checkBoxListener);
        dotaBox.setOnClickListener(checkBoxListener);                //第四步，控件与监听器绑定;*/

    }




    /*
    class CheckBoxListener implements View.OnClickListener {           //第二步，创建内部类，实现监听类接口

        @Override
        public void onClick(View view) {                                 //复写接口方法;

            CheckBox checkBox = (CheckBox) view;

            if(checkBox.getId() == R.id.eatingBox){
                System.out.println("eatingBox is clicked");
            }
            else if (checkBox.getId() == R.id.sleepingBox){
                System.out.println ("sleepingBox is clicked");
            }
            else if (checkBox.getId() == R.id.dotaBox){
                System.out.println("dotaBox is clicked");
            }

            if (checkBox.isChecked()){
                System.out.println ("checked");
            }
            else{
                System.out.println ("unchecked");
            }

            System.out.println ("checkbox is clicked");
            System.out.println ();
        }
    }
    */


    class CheckOnClickListener implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.getId() == R.id.eatingBox){
                System.out.println ("eatingBox is clicked");
            }
            else if (buttonView.getId() == R.id.sleepingBox){
                System.out.println ("sleepingBox is clicked");
            }
            else if (buttonView.getId() == R.id.dotaBox){
                System.out.println ("dotaBox is clicked");
            }

            if (isChecked){
                System.out.println ("CheckBox is checkerd");
            }
            else{
                System.out.println ("CheckBox is unchecked");
            }

        }
    }



}
