package android.weathertest.com.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by gyn on 18-4-12.
 */

public class City extends DataSupport {

    private  int id;
    private String CityName;
    private int cityCde;
    private int provinceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCde() {
        return cityCde;
    }

    public void setCityCde(int cityCde) {
        this.cityCde = cityCde;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}
