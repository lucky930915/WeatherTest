package android.weathertest.com.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gyn on 18-4-18.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;

    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
