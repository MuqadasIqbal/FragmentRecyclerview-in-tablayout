package com.example.tablayoutwithfregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChatFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<MyData> myData = new ArrayList<>();
    MyAdapter myAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       /* getFragmentManager().beginTransaction().replace(R.id.viewpager,new StatusFragment()).commit();*/
        myData.add(new MyData("Oggy", R.drawable.oggy, "#E0C1EC"));
        myData.add(new MyData("Dorimon", R.drawable.dorimon, "#C3E096"));
        myData.add(new MyData("Bugs Bunny", R.drawable.bugsbunny, "#696d7d"));
        myData.add(new MyData("Barbies", R.drawable.barbie, "#769da6"));
        myData.add(new MyData("MickeyMouse", R.drawable.mickeymouse, "#eee5d1"));
        myData.add(new MyData("Tom And Jry", R.drawable.tom, "#a58fbe"));
        myData.add(new MyData("Multi Rajo", R.drawable.cartoon, "#e4b849"));

        myAdapter = new MyAdapter(myData,ChatFragment.this);
        recyclerView.setAdapter(myAdapter);
        return view;

    }

}
