package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Build;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.viewpager.adapters.SectionAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 vp = findViewById(R.id.view_pager);
        vp.setAdapter(new SectionAdapter(this));
        vp.setPageTransformer(new DepthPageTransformer());

        TabLayout tabs = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabs, vp, new TabLayoutMediator.TabConfigurationStrategy() {

            String [] tabTitles = {"Home", "Events", "Accounts"};
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tabTitles[position]);
            }
        }).attach();
    }
}