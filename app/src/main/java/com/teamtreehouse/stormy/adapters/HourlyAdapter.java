package com.teamtreehouse.stormy.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.teamtreehouse.stormy.R;
import com.teamtreehouse.stormy.databinding.HourlyListItemBinding;
import com.teamtreehouse.stormy.weather.Hour;

import java.util.List;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder> {

  private List<Hour> hours;
  private Context context;

  public HourlyAdapter(List<Hour> hours, Context context) {
    this.hours = hours;
    this.context = context;
  }

  @NonNull
  @Override
  public HourlyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    // Binding
    HourlyListItemBinding binding = DataBindingUtil
        .inflate(LayoutInflater.from(parent.getContext()),
        R.layout.hourly_list_item,
        parent,
        false);

    // ViewHolder
    return new ViewHolder(binding);

  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Hour hour = hours.get(position);
    holder.hourlyListItemBinding.setHour(hour);

  }

  @Override
  public int getItemCount() {
    return hours.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    // Binding variables
    public HourlyListItemBinding hourlyListItemBinding;

    public ViewHolder(HourlyListItemBinding hourlyLayoutBinding) {
      super(hourlyLayoutBinding.getRoot());
      hourlyListItemBinding = hourlyLayoutBinding;

    }

  }

}
