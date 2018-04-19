package android.weathertest.com.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gyn on 18-4-18.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;

    }

    public class More {
        @SerializedName("txt_d")
        public String info;

    }
}

