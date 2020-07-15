package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextViewActivity extends AppCompatActivity {


    private Button mEditTextView;

    private Button mBtnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mBtnTextView = (Button) findViewById(R.id.ensureLogin);
        mBtnTextView.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(TextViewActivity.this,HOMEPAGEActivity.class);
                startActivity(intent);
            }
        });


    }

}
