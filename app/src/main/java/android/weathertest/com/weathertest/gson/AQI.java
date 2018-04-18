package android.weathertest.com.weathertest.gson;

/**
 * Created by gyn on 18-4-18.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
