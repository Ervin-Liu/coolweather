package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Describe: province class
 *       [
 *          {
 *           "id":1,
 *           "name":"北京"
 *          },
 *          {
 *           "id":2,
 *           "name":"上海"
 *          }
 *        ]
 * Created by Ervin Liu on 2021/02/27---10:03
 **/
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
