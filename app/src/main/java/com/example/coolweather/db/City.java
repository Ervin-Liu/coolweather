package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Describe: City class
 *       [
 *         {
 *           "id":267,
 *           "name":"成都"
 *         },
 *         {
 *           "id":268,
 *           "name":"攀枝花"
 *         }
 *       ]
 * Created by Ervin Liu on 2021/02/27---10:05
 **/
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
