package com.example.wxq.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends FragmentActivity {


    @BindView(R.id.id_tablayout)
    TabLayout idTablayout;
    @BindView(R.id.id_viewpage)
    ViewPager idViewpage;
    AppCompatTextView tv;
    @BindView(R.id.tv_text)
    AppCompatTextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
      //  getSupportActionBar().hide();
        initview();
    }

    private void initview() {

        tv = (AppCompatTextView) findViewById(R.id.tv_text);
        tv.setText("hasChanged");

        idViewpage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return super.getPageTitle(position);
            }




        });

        idTablayout.setupWithViewPager(idViewpage);

        for (int i = 0; i < idTablayout.getTabCount(); i++) {
            TabLayout.Tab tab = idTablayout.getTabAt(i);
            if (tab != null) {
          //      tab.setCustomView(pagerAdapter.getTabView(i));
            }
        }




    }


    @OnClick(R.id.tv_text)
    public void onClick() {
        Toast.makeText(this,"wxq",Toast.LENGTH_LONG).show();

    }
}
