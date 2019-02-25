package com.lt.gold.designmodle.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lt.gold.designmodle.R;

import java.util.List;

/**
* Creat by ${user} on ${date}
*/
class MyPagerAdapter extends PagerAdapter {
    private Context context;
    private List<Integer> datas;
    public MyPagerAdapter(Context context, List<Integer> datas) {
        this.context=context;
        this.datas=datas;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(context).inflate(R.layout.image_item, null);
        ImageView imageView=view.findViewById(R.id.main_viewpager_iv);
        imageView.setImageResource(datas.get(position));
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

    }




}
