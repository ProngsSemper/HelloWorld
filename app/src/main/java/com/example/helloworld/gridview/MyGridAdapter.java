package com.example.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

/**
 * @author Prongs
 */
public class MyGridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    public MyGridAdapter(Context context) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView==null){
            convertView = layoutInflater.inflate(R.layout.layout_grid_item,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.iv_grid);
            viewHolder.textView = convertView.findViewById(R.id.tv_g_title);
            convertView.setTag(viewHolder);
        }else {
            viewHolder =(ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText("花");
        Glide.with(context).load("https://dss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3495450057,3472067227&fm=5").into(viewHolder.imageView);
        return convertView;
    }
}
