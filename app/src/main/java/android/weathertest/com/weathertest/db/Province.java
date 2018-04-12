package android.weathertest.com.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by gyn on 18-4-12.
 */

public class Province extends DataSupport{

    private int Id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
