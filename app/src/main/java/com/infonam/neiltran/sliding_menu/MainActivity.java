package com.infonam.neiltran.sliding_menu;

import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.infonam.neiltran.adapter.NavDrawerListAdapter;
import com.infonam.neiltran.model.NavDrawerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mBarDrawerToggle;

    /*nav drawer title*/
    private CharSequence mDrawerTitle;

    /*used to store app title*/
    private CharSequence mTitle;

    /*slide menu items*/
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;

    private ArrayList<NavDrawerItem> mNavDrawerItems;
    private NavDrawerListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidgets();
        setListeners();
    }

    private void getWidgets() {
    }

    private void setListeners() {
    }
}
