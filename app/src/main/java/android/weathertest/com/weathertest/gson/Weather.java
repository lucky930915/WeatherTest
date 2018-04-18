package android.weathertest.com.weathertest.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gyn on 18-4-18.
 */

public class Weather {
    public String status;
    public  Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    public List<Forecast> forecastList;
}
