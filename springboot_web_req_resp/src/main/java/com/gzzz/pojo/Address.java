package com.gzzz.pojo;

/**
 * className: Address
 * Package : com.gzzz.pojo
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/25 13:01
 * @Version 1.0
 */
public class Address {
    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
