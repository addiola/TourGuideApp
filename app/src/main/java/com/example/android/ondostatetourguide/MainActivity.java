package com.example.android.ondostatetourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView infoTextView = (TextView) findViewById(R.id.info);

        infoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(infoIntent);
            }
        });


        TextView viewAll = (TextView) findViewById(R.id.view_all);

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(MainActivity.this, com.example.android.ondostatetourguide.ViewAllActivity.class);
                startActivity(viewIntent);
            }
        });


        TextView topAttractionTextView = (TextView) findViewById(R.id.top_attractions);

        topAttractionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topIntent = new Intent(MainActivity.this, TopAttractionActivity.class);
                startActivity(topIntent);
            }
        });

        TextView newAttractionTextView = (TextView) findViewById(R.id.new_attractions);

        newAttractionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this, NewAttractionActivity.class);
                startActivity(newIntent);
            }
        });

    }
}
