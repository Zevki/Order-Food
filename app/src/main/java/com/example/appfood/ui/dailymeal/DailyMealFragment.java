package com.example.appfood.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfood.R;
import com.example.appfood.adapters.DailyMealApdater;
import com.example.appfood.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealApdater dailyMealApdater;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% OFF", "breakfast", "Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","20% OFF", "lunch", "Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","15% OFF", "dinner", "Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweet,"Sweet","25% OFF", "sweet", "Description Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","10% OFF", "coffee", "Description Description"));

        dailyMealApdater = new DailyMealApdater(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealApdater);
        dailyMealApdater.notifyDataSetChanged();


        return root;
    }

}