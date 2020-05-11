package com.example.myapplication;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText urlEditText;
    Button goButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlEditText = findViewById(R.id.editText);
        goButton = findViewById(R.id.btn_browse);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取网址
                String url = urlEditText.getText().toString();
                Intent intent = new Intent();
                //将url字符串解析为uri对象

                //设置data
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                //设置动作为ACTION_VIEW，为了启动隐式Intent

                startActivity(intent);
            }
        });
    }

}

