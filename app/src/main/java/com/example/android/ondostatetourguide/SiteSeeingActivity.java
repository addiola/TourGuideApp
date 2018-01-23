package com.example.android.ondostatetourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Addi_ola on 29/11/2017.
 */

public class SiteSeeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //hooks the Event fragment to the EventActivity and starts it
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SiteSeeingFragment()).commit();

    }
}