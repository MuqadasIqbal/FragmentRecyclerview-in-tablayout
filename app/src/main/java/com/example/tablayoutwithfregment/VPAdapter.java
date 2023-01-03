package com.example.tablayoutwithfregment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment>ChatsFragment=new ArrayList<>();
    private final ArrayList<String>ChatsTitles=new ArrayList<>();

    public VPAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    public Fragment getItem(int position) {
        return ChatsFragment.get(position);
    }

    @Override
    public int getCount() {
        return ChatsTitles.size();
    }
    public void AddFragment(Fragment fragment,String title){
        ChatsFragment.add(fragment);
        ChatsTitles.add(title);
    }
}
