package com.gzzz.pojo;

/**
 * className: User
 * Package : com.gzzz.pojo
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/25 11:53
 * @Version 1.0
 */
public class User {
    private String name;
    private Integer age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
