package android.weathertest.com.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gyn on 18-4-18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public  Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
