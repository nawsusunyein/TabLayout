package com.example.taplayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tl_tablayout);
        TabItem tabChat = findViewById(R.id.tab_Chat);
        TabItem tabCall = findViewById(R.id.tab_Call);
        TabItem tabStatus = findViewById(R.id.tab_Status);
        ViewPager viewPager = findViewById(R.id.viewPager);

    }
}
