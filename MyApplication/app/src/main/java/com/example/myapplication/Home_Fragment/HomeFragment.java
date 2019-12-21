package com.example.myapplication.Home_Fragment;


import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.myapplication.R;
import com.example.myapplication.SlidingImage_Adapter;
import com.example.myapplication.lib.CirclePageIndicator;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private Toolbar toolbar;
    private TabWidget tabWidget;
    TabHost tHost;


    View view;

    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.ic_build_black_24dp,R.drawable.ic_search_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.logo};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

//        toolbar = (Toolbar) view.findViewById(R.id.toolbar_home);
//        toolbar.setTitleTextColor(0xFFFFFFFF);
//        loadTabs();

        return view;
    }

//    public void loadTabs() {
//        final TabHost host = (TabHost) view.findViewById
//                (R.id.tabhost_home);
//        //gọi lệnh setup
//        host.setup();
//        TabHost.TabSpec spec;
//        //Tạo tab1
//        spec = host.newTabSpec("t1");
//        spec.setContent(R.id.tab1);
//        spec.setIndicator("Thông tin cá nhân");
//
//        host.addTab(spec);
//
//        //Tạo tab2
//        spec = host.newTabSpec("t2");
//        spec.setContent(R.id.tab2);
//        spec.setIndicator("Tin tức");
//        host.addTab(spec);
//        host.setCurrentTab(0);
//        //Ví dụ tab1 chưa nhập thông tin xong mà lại qua tab 2 thì báo...
////        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
////              public void onTabChanged(String tabId) {
////                  int tab = host.getCurrentTab();
////                  for (int i = 0; i < host.getTabWidget().getChildCount(); i++) {
////                      // When tab is not selected
////                      host.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FFFFFF")); //màu trắng
////                      host.getTabWidget().setI;
////                  }
////                  // When tab is selected
////                  host.getTabWidget().getChildAt(host.getCurrentTab()).setBackgroundColor(Color.parseColor("#80FFFFFF")); //màu xám
////              }
////        });
//    }
//
//    private void init() {
//        for(int i=0;i<IMAGES.length;i++)
//            ImagesArray.add(IMAGES[i]);
//
//        mPager = (ViewPager) view.findViewById(R.id.pager);
//
//
//        mPager.setAdapter(new SlidingImage_Adapter(getContext(),ImagesArray));
//
//
//        CirclePageIndicator indicator = (CirclePageIndicator)view.findViewById(R.id.indicator);
//
//        indicator.setViewPager(mPager);
//
//        final float density = getResources().getDisplayMetrics().density;
//
////Set circle indicator radius
//        indicator.setRadius(5 * density);
//
//        NUM_PAGES =IMAGES.length;
//
//        // Auto start of viewpager
//        final Handler handler = new Handler();
//        final Runnable Update = new Runnable() {
//            public void run() {
//                if (currentPage == NUM_PAGES) {
//                    currentPage = 0;
//                }
//                mPager.setCurrentItem(currentPage++, true);
//            }
//        };
//        Timer swipeTimer = new Timer();
//        swipeTimer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                handler.post(Update);
//            }
//        }, 3000, 3000);
//
//        // Pager listener over indicator
//        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//                currentPage = position;
//
//            }
//
//            @Override
//            public void onPageScrolled(int pos, float arg1, int arg2) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int pos) {
//
//            }
//        });

    }




