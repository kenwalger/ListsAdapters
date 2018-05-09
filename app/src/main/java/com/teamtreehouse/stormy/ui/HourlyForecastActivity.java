package com.teamtreehouse.stormy.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.teamtreehouse.stormy.R;
import com.teamtreehouse.stormy.adapters.HourlyAdapter;
import com.teamtreehouse.stormy.databinding.ActivityHourlyForecastBinding;
import com.teamtreehouse.stormy.weather.Hour;

import java.util.ArrayList;
import java.util.List;


public class HourlyForecastActivity extends AppCompatActivity {

  private HourlyAdapter adapter;
  private ActivityHourlyForecastBinding binding;

  public static final String TAG = HourlyForecastActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Data Binding
    binding = DataBindingUtil.setContentView(this, R.layout.activity_hourly_forecast);

    adapter = new HourlyAdapter(getHourData(), this);
    binding.hourlyListItems.setAdapter(adapter);
    binding.hourlyListItems.setLayoutManager(new LinearLayoutManager(this));

    // Adapter

  }

  private List<Hour> getHourData() {

    List<Hour> hours = new ArrayList<>();

    Hour hour = new Hour(1525881600, "Mostly Cloudy", 57.29, "partly-cloudy-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525885200, "Clear", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525888800, "Partly Cloudy", 59.41, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525892400, "Clear Day", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525896000, "Clear Day", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525899600, "Clear Day", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525903200, "Clear Day", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525906800, "Mostly Cloudy", 57.29, "partly-cloudy-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525910400, "Clear", 59.41, "clear-day", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525914000, "Partly Cloudy", 59.41, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525917600, "Clear Night", 59.41, "clear-night", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525921200, "Raining", 59.41, "rain", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525924800, "Snowy", 59.41, "snow", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525928400, "Sleet", 59.41, "sleet", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525932000, "Windy", 59.41, "wind", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525935600, "Foggy", 59.41, "fog", "America/Los_Angeles");
    hours.add(hour);
    hour = new Hour(1525939200, "Cloudy Night", 59.41, "partly-cloudy-night", "America/Los_Angeles");
    hours.add(hour);

    return hours;
  }

}
