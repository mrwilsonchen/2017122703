package com.wilson.a2017122703;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView4);
        ed1 = (EditText) findViewById(R.id.editText4);
        ed2 = (EditText) findViewById(R.id.editText5);

        tv.setText("Hello World 2");
    }
    public void click1(View v)
    {
        String str = ed1.getText().toString()+"+"+ed2.getText().toString()+"=";

        //tv.setText(ed1.getText().toString()+ed2.getText().toString());

        //String sum = parseInt(ed1.getText().toString())+parseInt(ed2.getText().toString());
        int sum = Integer.parseInt(ed1.getText().toString())+Integer.valueOf(ed2.getText().toString());
        tv.setText(String.valueOf(sum));
        //tv.setText(sum);
    }
}
