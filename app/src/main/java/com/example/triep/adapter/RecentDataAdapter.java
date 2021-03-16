package com.example.triep.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.triep.DetailsActivity;
import com.example.triep.R;
import com.example.triep.model.RecentData;

import java.util.List;

public class RecentDataAdapter extends RecyclerView.Adapter<RecentDataAdapter.ViewHolder> {

    private Context context;
    private List<RecentData> recentDataList;

    public RecentDataAdapter(Context context, List<RecentData> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    @NonNull
    @Override
    public RecentDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recent_data_item, parent, false);
        return new RecentDataAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentDataAdapter.ViewHolder holder, int position) {

        holder.placeName.setText(recentDataList.get(position).getPlaceName());
        holder.countryName.setText(recentDataList.get(position).getCountryName());
        holder.price.setText(recentDataList.get(position).getPrice());
        holder.placeImage.setImageResource(recentDataList.get(position).getImageFile());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return recentDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView placeImage;
        private TextView placeName, countryName, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
