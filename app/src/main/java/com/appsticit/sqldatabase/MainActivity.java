package com.appsticit.sqldatabase;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,viewData,delete;
    EditText etName,etPhone,deleteET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        etPhone = (EditText) findViewById(R.id.editText2);
        delete = (Button) findViewById(R.id.button3);
        deleteET = (EditText) findViewById(R.id.edittext3);
        viewData = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DataTemp dt = new DataTemp(etName.getText().toString(),etPhone.getText().toString());

             DatabaseFunction df = new DatabaseFunction(MainActivity.this);
                df.AddDataToTable(dt);
                Toast.makeText(getApplicationContext(),"Data added successfuly!", Toast.LENGTH_LONG).show();

            }
        });

        viewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i = new Intent(MainActivity.this,DataView.class);
                startActivity(i);


            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    DatabaseFunction df = new DatabaseFunction(MainActivity.this);
                df.Delete_Raw(deleteET.getText().toString());
                deleteET.setText("");
                Toast.makeText(getApplicationContext(),"Data Deleted", Toast.LENGTH_LONG).show();

            }
        });
    }
}
