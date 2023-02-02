package com.latlng.foodradar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FeedsAdapter extends RecyclerView.Adapter<FeedsAdapter.ViewHolder>{

    private List<Integer> mImg;
    private LayoutInflater layout;

    public FeedsAdapter(Context context, List<Integer> img) {
        this.layout = LayoutInflater.from(context);
        this.mImg = img;
    }
    @NonNull
    @Override
    public FeedsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.allfeeds_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedsAdapter.ViewHolder holder, int position) {

        Integer img = mImg.get(position);
        holder.img.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.iv1);
        }
    }
}