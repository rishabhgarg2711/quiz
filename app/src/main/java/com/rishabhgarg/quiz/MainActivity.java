package com.rishabhgarg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          ListView mylist=(ListView)findViewById(R.id.mylist);
           final ArrayList<String> arrlist= new ArrayList<String> (Arrays.asList("C/C++","Java","General Knowledge"));
            ArrayAdapter<String> arad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrlist);
             mylist.setAdapter(arad);
             mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
                 public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    ch= arrlist.get(i);
                    switch(ch){
                        case "C/C++": {
                            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                            startActivity(intent);
                            break;
                        }
                        case "Java": {
                            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                            startActivity(intent);
                            break;
                        }
                        case "General Knowledge": {
                            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                            startActivity(intent);
                            break;
                        }
                 }
             }
    });
        }
}
