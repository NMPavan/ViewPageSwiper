package com.example.viewpageswiper;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class CourosleContent extends Fragment {
    Context context;
    Integer imageUrl;
    ImageView imageView;
    TextView t1,t2;


    public CourosleContent() {
    }

    public void setImageUrl(Context context, Integer imageUrl, TextView t1, TextView t2){
        this.context = context;
        this.imageUrl = imageUrl;
        this.t1=t1;
        this.t2=t2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.courosle_item, container, false);
        imageView = v.findViewById(R.id.pop_item_image);
        t1=v.findViewById(R.id.pop_item_header);
        t2=v.findViewById(R.id.pop_item_sub_header);

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.image_not_found);
        requestOptions.error(R.drawable.image_not_found);

        Glide.with(context).applyDefaultRequestOptions(requestOptions).load(imageUrl).into(imageView);


        return v;

    }
}

