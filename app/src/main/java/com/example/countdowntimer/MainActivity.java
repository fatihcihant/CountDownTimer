package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        new CountDownTimer(10000,1000) {//first parameter count down
            //these two methods have to be "implemented"(onTick,onFinish)
            @Override
            public void onTick(long l) {
                //this method asking "every passing moment what will do"
                //this parameter shows remaining time((millisecond type)
                //we want to print remaining time (l)
                textView.setText("Left: " + l/1000);//converted milliseconds to seconds


            }
            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"DONE",Toast.LENGTH_LONG).show();//toast will start when CountDownTimer is over
                textView.setText("FİNİSHED");
            }
        }.start();//this part is necessary for CountDownTimer




    }
}