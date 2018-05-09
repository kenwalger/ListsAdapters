package com.teamtreehouse.stormy.weather;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Hour extends BaseObservable {

  @Bindable
  private long time;
  @Bindable
  private String summary;
  @Bindable
  private double temperature;
  @Bindable
  private String icon;
  @Bindable
  private String timeZone;

  public Hour() {
  }

  public Hour(long time, String summary, double temperature, String icon, String timeZone) {

    this.time = time;
    this.summary = summary;
    this.temperature = temperature;
    this.icon = icon;
    this.timeZone = timeZone;
  }

  public String getTime() {
    SimpleDateFormat formatter = new SimpleDateFormat("h a");
    formatter.setTimeZone(TimeZone.getTimeZone(timeZone));
    Date dateTime = new Date(time * 1000);
    return formatter.format(dateTime);
  }

  public void setTime(long time) {
    this.time = time;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public int getTemperature() {
    return (int)Math.round(temperature);
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public int getIcon() {
    return Forecast.getIconId(icon);
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }
}
