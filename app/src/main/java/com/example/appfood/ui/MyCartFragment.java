package com.example.appfood.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appfood.R;
import com.example.appfood.adapters.CartAdapter;
import com.example.appfood.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.carr_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.breakfast,"B1","15.000","4.3"));
        list.add(new CartModel(R.drawable.coffee_bacxiu,"Bạc Xĩu","17.000","4.6"));
        list.add(new CartModel(R.drawable.fav1,"Crepe","19.000","4.8"));
        list.add(new CartModel(R.drawable.friesphomai,"Fries","25.000","4.3"));
        list.add(new CartModel(R.drawable.icecream_dau,"Ice Cream","37.000","4.6"));
        list.add(new CartModel(R.drawable.pizzahaisan,"Pizza Hải Sản","20.000","4.8"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}