package com.example.appfood.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appfood.R;
import com.example.appfood.adapters.FeaturedAdapter;
import com.example.appfood.adapters.FeaturedVerAdapter;
import com.example.appfood.models.FeaturedModel;
import com.example.appfood.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    //Feature Hor RecyclerView
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    //Feature Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        //Feature Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.fav1, "Featured 1", "Description 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2, "Featured 2", "Description 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3, "Featured 3", "Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        //Feature Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1, "Featured 1", "Description 1", "4.1", "10:00 - 5:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2, "Featured 2", "Description 2", "4.5", "10:00 - 5:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3, "Featured 3", "Description 3", "4.3", "10:00 - 5:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver4, "Featured 4", "Description 4", "3.9", "5:00 - 8:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver5, "Featured 5", "Description 5", "4.9", "5:00 - 8:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver6, "Featured 6", "Description 6", "5.0", "4:00 - 9:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}