package com.example.shopshoperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart() {
        TextView textView = findViewById(R.id.importText1);
        textView.setTextSize(22);

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            String name = arguments.get("name").toString();
            String company = arguments.getString("company");
            textView.setText("Name: " + name + "\nCompany: " + company);
        }
        super.onStart();
    }

    public void onMainScenClick(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onIfoClick(View v){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
