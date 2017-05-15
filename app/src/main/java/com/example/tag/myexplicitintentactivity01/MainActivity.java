package com.example.tag.myexplicitintentactivity01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setOnClickListenerのコンストラクタ内でthisを指定すると
                //setOnClickListenerのインスタンスをさしてしまうので、
                //MainActivity.thisとする。
                Intent intent = new Intent(MainActivity.this,SubActivity.class);

                startActivity(intent);

            }
        });


    }
}
