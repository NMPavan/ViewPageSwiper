package com.example.viewpageswiper;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewPager);
        PhotosAdapter pagerAdapter = new PhotosAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(pagerAdapter);

        List<Integer> shopList = new ArrayList<>();
        shopList.add(R.drawable.card_image_1);
        shopList.add(R.drawable.card_image_2);
        shopList.add(R.drawable.card_image_3);
        shopList.add(R.drawable.card_image_4);


        pagerAdapter.swapUrl(shopList);

    }
}
