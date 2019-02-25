package com.lt.gold.designmodle.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lt.gold.designmodle.R;

/**
 * Creat by 11 on 2018/01/01
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view=null;
        if (viewType==1){
            //加载布局
            view= LayoutInflater.from(context).inflate(R.layout.image_item, viewGroup);
        }else if (viewType==2){
            //加载布局
            view= LayoutInflater.from(context).inflate(R.layout.image_item, viewGroup);
        }else{
            //加载布局
            view= LayoutInflater.from(context).inflate(R.layout.image_item, viewGroup);
        }

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        //根据position取数据，通过ViewHolder设置控件
        viewHolder.textView.setText("a");
        viewHolder.image.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //控件绑定
            image=itemView.findViewById(R.id.main_viewpager_iv);
            textView=itemView.findViewById(R.id.main_viewpager_tv);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

}
