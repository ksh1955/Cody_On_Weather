package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SampleData> codyDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeCodyData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(this,codyDataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Intent intent = new Intent(getApplicationContext(),listviewclick.class);
                startActivity(intent);
                
            }
        });
    }

    public void InitializeCodyData()
    {
        codyDataList = new ArrayList<SampleData>();

        codyDataList.add(new SampleData(R.drawable.cody1,"~-2ºC"));
        codyDataList.add(new SampleData(R.drawable.cody2,"-1~2ºC"));
        codyDataList.add(new SampleData(R.drawable.cody3,"3~6ºC"));
        codyDataList.add(new SampleData(R.drawable.cody4,"7~9ºC"));
        codyDataList.add(new SampleData(R.drawable.cody5,"10~13ºC"));
        codyDataList.add(new SampleData(R.drawable.cody6,"14~18ºC"));
        codyDataList.add(new SampleData(R.drawable.cody7,"19~22ºC"));
        codyDataList.add(new SampleData(R.drawable.cody8,"23~27ºC"));
        codyDataList.add(new SampleData(R.drawable.cody9,"28~31ºC"));
        codyDataList.add(new SampleData(R.drawable.cody10,"32~35ºC"));
    }
}