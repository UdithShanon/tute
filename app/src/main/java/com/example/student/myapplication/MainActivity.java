package com.example.student.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text2 = findViewById(R.id.textView2);
        text2.setText(R.string.msg2);
        Log.i("lifeCycle", "onCreate() invoked");

        Button btn1 = findViewById(R.id.btn1);
        btn1.setText(R.string.msg2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void onStart(){
    super.onStart();
    Log.i("lifeCycle", "onStart() invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i("lifeCycle", "onRestart() invoked");
    }


    public void onResume(){
        super.onResume();
        Log.i("lifeCycle", "onResume() invoked");
    }
    public void onStop(){
        super.onStop();
        Log.i("lifeCycle", "onStop() invoked");
    }


    public void onPause(){
        super.onPause();
        Log.i("lifeCycle", "onPause() invoked");
    }


    public void onDestroy(){
        super.onDestroy();
        Log.i("lifeCycle", "onDestroy invoked");
    }



}
