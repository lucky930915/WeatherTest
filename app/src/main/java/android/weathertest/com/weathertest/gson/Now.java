package android.weathertest.com.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gyn on 18-4-18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;

    }
}
