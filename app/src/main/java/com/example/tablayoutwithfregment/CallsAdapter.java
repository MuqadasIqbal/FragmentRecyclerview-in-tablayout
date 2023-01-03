package com.example.tablayoutwithfregment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.ViewHolder> {
    ArrayList<MyData> myData;
    CallsFragment context;

    public CallsAdapter(ArrayList<MyData> myData, CallsFragment fragment) {
        this.myData=myData;
        this.context=fragment;
    }

    @NonNull
    @Override
    public CallsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_list,parent,false);
        CallsAdapter.ViewHolder viewHolder=new CallsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MyData myDataList= myData.get(position);
        holder.textViewName.setText(myDataList.getName());
        holder.imageView.setImageResource(myDataList.getImage());
        holder.cardView.setBackgroundColor(Color.parseColor(myDataList.getColor()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* makeText(myDataList.getImage(), context, LENGTH_SHORT).show();*/
            }
        });
    }

    @Override
    public int getItemCount() {

        return myData.size();
    }

   /* public void filterList(ArrayList<MyData> filterList) {
        myData=filterList;
        notifyDataSetChanged();
    }*/

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView textViewName;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image);
            cardView=itemView.findViewById(R.id.linear);
            textViewName=itemView.findViewById(R.id.tv);
        }

    }
}

