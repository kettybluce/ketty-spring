package com.ketty.spring5;

public class Orders {
    //属性
    private String oname;
    private String address;

    public Orders() {
    }

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
