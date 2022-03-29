package com.example.shopshoperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TEXTVIEW_STATE_KEY = "TEXTVIEW_STATE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();

    }

    public void onbtnClick (View v){
        EditText nameText = findViewById(R.id.name_edit);
        EditText companyText = findViewById(R.id.company_edit);

        String name = nameText.getText().toString();
        String company = companyText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("company", company);
        startActivity(intent);
    }


    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        EditText nameText = findViewById(R.id.name_edit);
        EditText companyText = findViewById(R.id.company_edit);

        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        outState.putString(TEXTVIEW_STATE_KEY, name);
        outState.putString(TEXTVIEW_STATE_KEY, company);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
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