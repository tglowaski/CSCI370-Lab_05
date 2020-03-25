package com.tglowaski.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView newname;
    SharedPreferences sharedpreferences;
    TextView stringDef;
    public static final String mypreference = "mypref";
    public static final String name = "nameKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newname = (TextView) findViewById(R.id.edittext);
        stringDef = (TextView) findViewById(R.id.string_default);
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        if(sharedpreferences.contains(name)){
            stringDef.setText(sharedpreferences.getString(name, ""));
        }
    }

    public void Submit(View view){
        String n = newname.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(name, n);
        editor.commit();
    }
}


