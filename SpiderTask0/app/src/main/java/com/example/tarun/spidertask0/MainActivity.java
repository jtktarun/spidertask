package com.example.tarun.spidertask0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View v)
    {
        if (v.getId()==R.id.button)
        {
            value++;
            display(value);
        }
    }

    private void display(int number)
    {
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(""+number);
    }

}
