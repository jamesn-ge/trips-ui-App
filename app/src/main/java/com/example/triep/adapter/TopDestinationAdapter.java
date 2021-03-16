package com.example.triep.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.triep.R;
import com.example.triep.model.TopDestinationData;

import java.util.List;

public class TopDestinationAdapter extends RecyclerView.Adapter<TopDestinationAdapter.ViewHolder> {

    private Context context;
    private List<TopDestinationData> topDestinationDataList;

    public TopDestinationAdapter(Context context, List<TopDestinationData> topDestinationDataList) {
        this.context = context;
        this.topDestinationDataList = topDestinationDataList;
    }


    @NonNull
    @Override
    public TopDestinationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_dest_data_item, parent, false);
        return new TopDestinationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopDestinationAdapter.ViewHolder holder, int position) {

        holder.placeImage.setImageResource(topDestinationDataList.get(position).getImageFile());
        holder.placeName.setText(topDestinationDataList.get(position).getPlaceName());
        holder.countryName.setText(topDestinationDataList.get(position).getCountryName());
        holder.price.setText(topDestinationDataList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return topDestinationDataList.size();
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
