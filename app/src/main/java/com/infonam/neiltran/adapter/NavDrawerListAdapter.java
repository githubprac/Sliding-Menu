package com.infonam.neiltran.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.infonam.neiltran.model.NavDrawerItem;
import com.infonam.neiltran.sliding_menu.R;

import java.util.ArrayList;

/**
 * Created by Neil.Tran on 11/14/2015.
 */
public class NavDrawerListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<NavDrawerItem> mNavDrawerItems;

    @Override
    public int getCount() {
        return mNavDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mNavDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.drawer_list_item, null);
        }
        ImageView imageViewIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView textViewTitle = (TextView) convertView.findViewById(R.id.title);
        TextView textViewCount = (TextView) convertView.findViewById(R.id.counter);

        imageViewIcon.setImageResource(mNavDrawerItems.get(position).getIcon());
        textViewTitle.setText(mNavDrawerItems.get(position).getTitle());

        /*displaying count*/
        /*check whether it set visible or not*/
        if (mNavDrawerItems.get(position).getCounterVisibility()) {
            textViewCount.setText(mNavDrawerItems.get(position).getCount());
        } else {
            textViewCount.setVisibility(View.GONE);
        }
        return convertView;
    }
}
