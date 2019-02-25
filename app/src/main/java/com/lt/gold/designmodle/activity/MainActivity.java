package com.lt.gold.designmodle.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lt.gold.designmodle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式
 */
public class MainActivity extends AppCompatActivity {
    private ViewPager main_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> sources=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sources.add(R.drawable.ningmeng2);
        }
        main_viewpager=findViewById(R.id.main_viewpager);
        main_viewpager.setAdapter(new MyPagerAdapter(this,sources));
        main_viewpager.setPageTransformer(false, new ReverseTransformer());

    }

    /**
     * 右侧覆盖滑动
     */
    class  D3Transformer implements ViewPager.PageTransformer{
        @Override
        public void transformPage(@NonNull View view, float v) {
            int pageWidth = view.getWidth();

            if (v < -1) { // [-Infinity,-1)
                view.setAlpha(0);

            } else if (v <= 0) { // [-1,0]
                view.setAlpha(1);
                view.setTranslationX(pageWidth * -v);
                view.setScaleX(1);
                view.setScaleY(1);

            } else if (v <= 1) { // (0,1]
                view.setAlpha(1);
                view.setTranslationX(0);
                view.setScaleX(1);
                view.setScaleY(1);
            } else { // (1,+Infinity]
                view.setAlpha(0);
            }
        }

        }

        public void setId(){

        }
    }

