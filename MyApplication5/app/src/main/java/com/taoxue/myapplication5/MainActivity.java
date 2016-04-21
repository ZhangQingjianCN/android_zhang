package com.taoxue.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton maleButton;
    private RadioButton femaleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroupID);
        maleButton = (RadioButton)findViewById(R.id.maleID);
        femaleButton = (RadioButton)findViewById(R.id.femaleID);
        OnCheckedChangeRadioGroup onCheckedChangeRadioGroup= new OnCheckedChangeRadioGroup();

        radioGroup.setOnCheckedChangeListener(onCheckedChangeRadioGroup);

    }

    class OnCheckedChangeRadioGroup implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId == R.id.femaleID)
                System.out.println ("female");
            else
                System.out.println ("male");

        }
    }
}
