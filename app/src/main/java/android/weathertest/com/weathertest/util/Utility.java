package android.weathertest.com.weathertest.util;

import android.text.TextUtils;
import android.util.Log;
import android.weathertest.com.weathertest.db.City;
import android.weathertest.com.weathertest.db.County;
import android.weathertest.com.weathertest.db.Province;
import android.weathertest.com.weathertest.gson.Weather;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gyn on 18-4-12.
 */

public class Utility {
    public static final String TAG = "WeatherActivity";

    public static boolean handleProvinceResponse(String response) {
        Log.d(TAG, "response==: " + response);
        if (!TextUtils.isEmpty(response)) {
            try {
                Log.d(TAG, "handleProvinceResponse: ");
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++) {
                    JSONObject cityObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    //DateSupport中的方法
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounty = new JSONArray(response);
                for (int i = 0; i < allCounty.length(); i++) {
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent= jsonArray.getJSONObject(0).toString();
            Log.d(TAG, "weatherContent==="+weatherContent);
            Gson gson = new Gson();
            Weather weather =gson.fromJson(weatherContent,Weather.class);
            Log.d(TAG, "weather==="+weatherContent);
            return weather;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}


