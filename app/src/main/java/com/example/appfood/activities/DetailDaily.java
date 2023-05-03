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
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf_banhgio,"Bánh Giò","Description","4,0","25.000","10am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf_banhmi,"Bánh Mì","Description","4,6","25.000","10am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf_bunbo,"Bún Bò","Description","4.8","40.000","10am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("sweet")){

            imageView.setImageResource(R.drawable.sweet);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream_3vi,"Kem 3 vị","Description","4,5","25.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sweet_chetroinuoc,"Chè Trôi Nước","Description","4,6","10.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sweet_xoingot,"Xôi Ngọt","Description","4,8","15.000","0am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("lunch")){

            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch_bunthitnuong,"Bún thịt nướng","Description","4,0","25.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch_comtam,"Cơm Tấm","Description","4,5","35.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch_comtron,"Cơm Trộn","Description","4,0","30.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bf_bunbo,"Bún Bò","Description","4,8","40.000","0am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("dinner")){

            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner_canhchuacakho,"Cơm Canh Chua Cá Kho","Description","4,9","40.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner_thitkhotau,"Cơm Thịt Kho Tàu","Description","4,3","30.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner_tomrangthit,"Cơm Tôm Rang Thịt","Description","4,","35.000","0am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("coffee")){

            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee_bacxiu,"Coffee Bạc Xỉu","Description","4.6","25.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffesua,"Coffee Sữa","Description","4,5","20.000","0am to 24pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee_den,"Coffee Đen","Description","4,7","15.000","0am to 24pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

    }
}