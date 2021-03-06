package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Describe: County class
 *     [
 *       {
 *         "id":1967,
 *         "name":"成都",
 *         "weather_id":"CN101270101"
 *       },
 *       {
 *         "id":1968,
 *         "name":"龙泉驿",
 *         "weather_id":"CN101270102"
 *       }
 *     ]
 * Created by Ervin Liu on 2021/02/27---10:08
 **/
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
