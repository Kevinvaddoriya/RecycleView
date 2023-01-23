package com.example.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContectAdapter extends RecyclerView.Adapter<RecycleContectAdapter.ViewHolder> {

    ArrayList<ContactList> arrayList;
    Context context;

    RecycleContectAdapter(Context context,ArrayList<ContactList> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecycleContectAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleContectAdapter.ViewHolder holder, int position) {
        holder.img.setImageResource(arrayList.get(position).img);
        holder.name.setText(arrayList.get(position).name);
        holder.number.setText(arrayList.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name,number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);


        }
    }
}
