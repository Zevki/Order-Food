package com.example.appfood.adapters;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfood.R;
import com.example.appfood.models.HomeHorModel;
import com.example.appfood.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizzahaisan, "Pizza Hải Sản", "10:00 - 23:00", "4.5", "Min - 35.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizzabophomai, "Pizza Bò Phô Mai", "10:00 - 23:00", "4.8", "Min - 38.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizzathapcam, "Pizza Thập Cẩm", "10:00 - 23:00", "5.0", "Min - 40.000"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizzahaisan,"Pizza Hải Sản", "10:00 - 23:00", "4.5", "Min - 55.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizzabophomai,"Pizza Bò Phô Mai", "10:00 - 23:00", "4.8", "Min - 58.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizzathapcam,"Pizza Thập Cẩm", "10:00 - 23:00", "5.0", "Min - 60.000"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burgertom,"Hamburger Tôm", "6:00 - 23:00", "4.5", "Min - 35.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgerbophomai,"Hamburger Bò Phô Mai", "6:00 - 23:00", "4.6", "Min - 35.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgertomga,"Hamburger Tôm Gà", "6:00 - 23:00", "4.8", "Min - 35.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burgerbo2tang,"Hamburger Bò 2 Tầng", "6:00 - 23:00", "4.4", "Min - 50.000"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.frieschamsot,"Fries Chấm Sốt", "6:00 - 23:00", "4.5", "Min - 20.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.friesbotoi,"Fries Bơ Tỏi", "6:00 - 23:00", "4.5", "Min - 15.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.frieslocxoay,"Fries Lốc Xoáy", "6:00 - 23:00", "4.4", "Min - 15.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.friesphomai,"Fries Phô Mai", "6:00 - 23:00", "4.0", "Min - 20.000"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream_chocola,"Ice Cream Shocola", "6:00 - 23:00", "4.5", "Min - 30.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream_dau,"Ice Cream Dâu", "6:00 - 23:00", "4.6", "Min - 30.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream_dua,"Ice Cream Dừa", "6:00 - 23:00", "4.8", "Min - 30.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream_3vi,"Ice Cream 3 Vị", "6:00 - 23:00", "5.0", "Min - 50.000"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich_ga,"Samdwich Gà", "6:00 - 23:00", "4.0", "Min - 35.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich_phomai,"Samdwich Phô Mai", "6:00 - 23:00", "4.2", "Min - 20.000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich_thitnguoi,"Samdwich Thịt Nguội", "6:00 - 23:00", "4.5", "Min - 25.000"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else {
                    holder.cardView.setBackgroundResource(R.drawable.default_pg);
                }
                }
            }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

}



