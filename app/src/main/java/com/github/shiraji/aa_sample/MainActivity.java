package com.github.shiraji.aa_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toAAButton = (Button) findViewById(R.id.to_aa_button);
        toAAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AAActivity_.intent(MainActivity.this).start();
            }
        });
    }
}