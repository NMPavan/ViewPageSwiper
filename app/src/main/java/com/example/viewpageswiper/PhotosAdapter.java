package com.example.viewpageswiper;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TextView;

import java.util.List;

class PhotosAdapter extends FragmentStatePagerAdapter {


    private Context context;
    List<Integer> urls;
  private  TextView t1,t2;

    PhotosAdapter(FragmentManager fm, Context context) {

        super(fm);
        this.context=context;
        this.t1=t1;
        this.t2=t2;
    }

    @Override
    public Fragment getItem(int i) {
        CourosleContent content = new CourosleContent();
        content.setImageUrl(context, urls.get(i),t1,t2);
        return content;

    }

    @Override
    public int getCount() {
        return urls == null ? 0 : urls.size();
    }

    public void swapUrl(List<Integer> urls){
        this.urls = urls;
        notifyDataSetChanged();
    }
}
