package com.appsticit.sqldatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);
        TextView tv = (TextView) findViewById(R.id.textView);
DatabaseFunction df = new DatabaseFunction(DataView.this);


        String s="";
        String[] dataList = df.viewData();

        for( int i = 0; i<dataList.length; i++) {
            s=s+dataList[i]+"\n";

        }
        tv.setText(s);
    }
}
