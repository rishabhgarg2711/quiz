package com.rishabhgarg.quiz;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    RadioGroup rg;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    RadioButton rdbt;
    RadioButton rdbt2;
    RadioButton rdbt3;
    RadioButton rdbt4;
    RadioButton rdbt5;
    TextView timer;
    String ch;
    CountDownTimer cdt;
    int score=0;
    String ans[]={"&","Friend constructor","Dynamic binding","Member function","0"};



    public void onclick(View v) {
        ch="";
        int rdbtid=rg.getCheckedRadioButtonId();
        int rdbtid2 = rg2.getCheckedRadioButtonId();
        int rdbtid3 = rg3.getCheckedRadioButtonId();
        int rdbtid4 = rg4.getCheckedRadioButtonId();
        int rdbtid5 = rg5.getCheckedRadioButtonId();
        if(rdbtid==-1){
            Toast.makeText(Main2Activity.this,"Please choose any",Toast.LENGTH_SHORT).show();
            cdt.cancel();
            finish();
            return;
        }else {
            rdbt = (RadioButton) findViewById(rdbtid);
            ch = ch + rdbt.getText().toString() + "-";
        }
        if(rdbtid2==-1){
            Toast.makeText(Main2Activity.this,"Please choose any",Toast.LENGTH_SHORT).show();
            cdt.cancel();
            finish();
            return;
        }else {
            rdbt2 = (RadioButton) findViewById(rdbtid2);
            ch = ch + rdbt2.getText().toString() + "-";
        }
        if(rdbtid3==-1){
            Toast.makeText(Main2Activity.this,"Please choose any",Toast.LENGTH_SHORT).show();
            cdt.cancel();
            finish();
            return;
        }else {
            rdbt3 = (RadioButton) findViewById(rdbtid3);
            ch = ch + rdbt3.getText().toString() + "-";
        }
        if(rdbtid4==-1){
            Toast.makeText(Main2Activity.this,"Please choose any",Toast.LENGTH_SHORT).show();
            cdt.cancel();
            finish();
            return;
        }else {
            rdbt4 = (RadioButton) findViewById(rdbtid4);
            ch = ch + rdbt4.getText().toString() + "-";
        }
        if(rdbtid5==-1){
            Toast.makeText(Main2Activity.this,"Please choose any",Toast.LENGTH_SHORT).show();
            cdt.cancel();
            finish();
            return;
        }else {
            rdbt5 = (RadioButton) findViewById(rdbtid5);
            ch = ch + rdbt5.getText().toString() + "-";
        }
        result();
    }



    public void result(){
        score=0;
    String fich[]=ch.split("-");
    for(int i=0;i<ans.length;i++)
    {
        if(ans[i].equals(fich[i]))
            score++;
    }

    Toast.makeText(Main2Activity.this,"Your Result is "+Integer.toString(score)+"/5",Toast.LENGTH_SHORT).show();
    cdt.cancel();
    finish();
    }



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button but=(Button)findViewById(R.id.button);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        rg2=(RadioGroup)findViewById(R.id.radioGroup2);
        rg3=(RadioGroup)findViewById(R.id.radioGroup3);
        rg4=(RadioGroup)findViewById(R.id.radioGroup4);
        rg5=(RadioGroup)findViewById(R.id.radioGroup5);
        timer=(TextView)findViewById(R.id.timer);
        cdt= new CountDownTimer(120100,1000) {

            @Override
            public void onTick(long l) {
                int min=(int)l/60000;
                int sec=(int)((l/1000)-(min*60));
                timer.setText(Integer.toString(min)+":"+Integer.toString(sec));
            }

            @Override
            public void onFinish() {
                but.performClick();
            }
        }.start();
    }
}
