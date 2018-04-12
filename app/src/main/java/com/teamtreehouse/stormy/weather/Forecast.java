package com.teamtreehouse.stormy.weather;

public class Forecast {

  private Current currentForecast;
  private Hour[] hourlyForecast;
  private Day[] dailyForecast;

  public Current getCurrentForecast() {
    return currentForecast;
  }

  public void setCurrentForecast(Current currentForecast) {
    this.currentForecast = currentForecast;
  }

  public Hour[] getHourlyForecast() {
    return hourlyForecast;
  }

  public void setHourlyForecast(Hour[] hourlyForecast) {
    this.hourlyForecast = hourlyForecast;
  }

  public Day[] getDailyForecast() {
    return dailyForecast;
  }

  public void setDailyForecast(Day[] dailyForecast) {
    this.dailyForecast = dailyForecast;
  }


}
