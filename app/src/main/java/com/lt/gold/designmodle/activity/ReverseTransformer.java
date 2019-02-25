package com.lt.gold.designmodle.activity;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
     * 翻转
     */
    class  ReverseTransformer implements ViewPager.PageTransformer{
            private static final float MAX_ROTATE_Y = 180;
            @Override
            public void transformPage(@NonNull View view, float position) {
                float rotation = 180f * position;

                view.setTranslationX(view.getWidth() * -position);
                view.setAlpha(rotation > 90f || rotation < -90f ? 0 : 1);
                view.setPivotX(view.getWidth() * 0.5f);
                view.setPivotY(view.getHeight() * 0.5f);
                view.setRotationY(rotation);

                if (position > -0.5f && position < 0.5f) {
                    view.setVisibility(View.VISIBLE);
                } else {
                    view.setVisibility(View.INVISIBLE);
                }

            }

    /**
     * 3D立体旋转
     */
    static class newMyTransformer implements ViewPager.PageTransformer{
            private static final float MAX_ROTATE_Y = 70;
            @Override
            public void transformPage(@NonNull View view, float v) {
                int pageWidth=view.getWidth();
                view.setPivotY(view.getHeight() / 2);
                if (v < -1) { // [-Infinity,-1)
                    // This page is way off-screen to the left.
                    view.setPivotX(0);
                    view.setRotationY(MAX_ROTATE_Y);
                } else if (v <= 0) { // [-1,0]
                    view.setPivotX(pageWidth);
                    view.setRotationY(v * MAX_ROTATE_Y);
                } else if (v <= 1) { // (0,1]
                    view.setPivotX(0);
                    view.setRotationY(v * MAX_ROTATE_Y);
                } else { // (1,+Infinity]
                    // This page is way off-screen to the right.
                    view.setPivotX(0);
                    view.setRotationY(MAX_ROTATE_Y);
                }

            }
        }
}
