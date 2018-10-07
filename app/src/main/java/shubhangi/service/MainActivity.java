package shubhangi.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import shubhangi.service.service.MyService;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartService(View view) {

        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("message" ,"Test message" + count++);
        startService(intent);
    }



    public void StopService(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}