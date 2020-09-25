package com.prasad.new_explorer.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.prasad.new_explorer.R;

import java.util.ArrayList;

public class Adapterr extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<Member> arrayList;

    Context context;
    ViewHolder viewHolder;

    public Adapterr(ArrayList<Member> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      //  View root = inflater.inflate(R.layout.item);
        View view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
Member current=arrayList.get(i);
holder.setExoplayer(context,current.getName(),current.getImageurl(),getItemCount(),arrayList);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
