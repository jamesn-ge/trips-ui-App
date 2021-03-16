package com.example.triep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.triep.adapter.RecentDataAdapter;
import com.example.triep.adapter.TopDestinationAdapter;
import com.example.triep.model.RecentData;
import com.example.triep.model.TopDestinationData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv, top_rv;
    private RecentDataAdapter recentDataAdapter;
    private List<RecentData> recentDataList;

    private TopDestinationAdapter topDestinationAdapter;
    private List<TopDestinationData> topDestinationDataList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

       setRecentRv();
       setTopDestinations();
    }

    private void setTopDestinations() {

        topDestinationDataList = new ArrayList<>();

        topDestinationDataList = new ArrayList<>();
        topDestinationDataList.add(new TopDestinationData("Mt.Kenya", "Kenya", "Ksh.4000", R.drawable.topplaces));
        topDestinationDataList.add(new TopDestinationData("Lake.Nakuru", "Uganda", "Ksh.6700", R.drawable.topplaces));
        topDestinationDataList.add(new TopDestinationData("Mt.Kilimanjaro", "South Africa", "Ksh.9000", R.drawable.topplaces));
        topDestinationDataList.add(new TopDestinationData("Lake. Msinga", "Algeria", "Ksh.125,000", R.drawable.topplaces));

        topDestinationAdapter = new TopDestinationAdapter(this, topDestinationDataList);

        top_rv  = findViewById(R.id.top_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        top_rv.setLayoutManager(layoutManager);
        top_rv.setAdapter(topDestinationAdapter);

    }

    private void setRecentRv() {

        recentDataList = new ArrayList<>();
        recentDataList.add(new RecentData("Mt.Kenya", "Kenya", "Ksh.4000", R.drawable.recentimage1));
        recentDataList.add(new RecentData("Lake.Nakuru", "Uganda", "Ksh.6700", R.drawable.recentimage2));
        recentDataList.add(new RecentData("Mt.Kilimanjaro", "South Africa", "Ksh.9000", R.drawable.recentimage1));
        recentDataList.add(new RecentData("Lake. Msinga", "Algeria", "Ksh.125,000", R.drawable.recentimage2));



        recentDataAdapter = new RecentDataAdapter(this, recentDataList);


        rv = findViewById(R.id.recent_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(recentDataAdapter);
    }
}