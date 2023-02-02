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

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    private List<Integer> mBack;
    private List<Integer> mIc;
    private List<String> mName;
    private LayoutInflater layout;

    ProfileAdapter(Context context, List<Integer> mBack, List<Integer> mIc, List<String> mName ){
        this.layout = LayoutInflater.from(context);
        this.mBack = mBack;
        this.mIc = mIc;
        this.mName = mName;
    }
    @NonNull
    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.profile_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {

        String name = mName.get(position);
        Integer back = mBack.get(position);
        Integer ic = mIc.get(position);
        holder.back.setImageResource(back);
        holder.ic.setImageResource(ic);
        holder.name.setText(name);

    }

    @Override
    public int getItemCount() {
        return mName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView back;
        ImageView ic;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            back=itemView.findViewById(R.id.backImg);
            ic=itemView.findViewById(R.id.icPro);
            name=itemView.findViewById(R.id.proName);

        }
    }
}
