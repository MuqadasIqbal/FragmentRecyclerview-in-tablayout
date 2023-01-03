package com.example.tablayoutwithfregment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
private VPAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);

        adapter=new VPAdapter(getSupportFragmentManager());
        adapter.AddFragment(new ChatFragment(),"Chats");
        adapter.AddFragment(new StatusFragment(),"Status");
        adapter.AddFragment(new CallsFragment(),"Calls");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_feedback_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_person_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_call_24);

  /*  getSupportFragmentManager().beginTransaction().replace(R.id.main,new ChatFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.main,new StatusFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.main,new CallsFragment()).commit();*/
    }
}