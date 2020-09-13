package com.example.tropicalfruitlist.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tropicalfruitlist.R;
import com.example.tropicalfruitlist.model.Fruit;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder>{
    private List<Fruit> mDataset;

    public FruitAdapter(List<Fruit> mDataset) {
        this.mDataset = mDataset;
    }

    public static class FruitViewHolder extends RecyclerView.ViewHolder {
        public TextView name, botanicalName, otherNames;
        public FruitViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.tv_name);
            botanicalName = v.findViewById(R.id.tv_botanical_name);
            otherNames = v.findViewById(R.id.tv_other_names);
        }
    }

    public void setDataSet(List<Fruit> dataSet) {
        this.mDataset = dataSet;
    }

    @NonNull
    @Override
    public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_item_fruit, parent, false);
        FruitViewHolder holder = new FruitViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder holder, int position) {
        Fruit item = mDataset.get(position);
        holder.name.setText(item.getName());
        holder.botanicalName.setText(item.getBotanicalName());
        holder.otherNames.setText(item.getOtherNames());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
