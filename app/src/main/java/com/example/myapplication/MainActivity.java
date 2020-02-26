package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn_num;
    TextView text_show;
    int x=(int)(Math.random()*1000);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edit_num);
        btn_num=findViewById(R.id.button);
        text_show=findViewById(R.id.show_rf);


        try {
            int get_num = Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        btn_num.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //  Toast.makeText(MainActivity.this, "hello world"+
                //         editText.getText().toString(), Toast.LENGTH_SHORT).show();
                String b="Bigger";
                String s="Smaller";
                String r="Right";
                String f="Fault";

                String temp=b;

                try {
                    int get_num = Integer.parseInt(editText.getText().toString());
                    if(get_num<x)
                        temp=s;
                    else  if (get_num>x)
                        temp=b;
                    else if (get_num==x)
                        temp=r;
                    else
                        temp=f;

                    text_show.setText(editText.getText().toString()+" is "+temp);

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }
        });
    }

}
