package com.latlng.foodradar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>{

    private List<Integer> mImg;
    private List<String> mName;
    private LayoutInflater layout;

    MessageAdapter(Context context, List<String> mName ,List<Integer> mImg){
        this.layout=LayoutInflater.from(context);
        this.mName=mName;
        this.mImg=mImg;

    }


    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.feedmessage_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String name = mName.get(position);
        Integer img = mImg.get(position);
        holder.image.setImageResource(img);
        holder.txt.setText(name);

    }

    @Override
    public int getItemCount() {
        return mName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            
            image = itemView.findViewById(R.id.userImg);
            txt = itemView.findViewById(R.id.userName);
            
        }
    }
}
