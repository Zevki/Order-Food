package com.example.appfood.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.appfood.R;
import com.example.appfood.adapters.DetailedDailyAdapter;
import com.example.appfood.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailDaily extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter detailedDailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_daily);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView =findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        detailedDailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(detailedDailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf1,"Breakfast","Description","4,6","45.000","10am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf2,"Breakfast","Description","4,6","45.000","10am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf3,"Breakfast","Description","4,6","45.000","10am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("sweet")){

            imageView.setImageResource(R.drawable.sweet);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf1,"Sweet","Description","4,5","45.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf2,"Sweet","Description","4,6","45.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf3,"Sweet","Description","4,8","45.000","0am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

    }
}