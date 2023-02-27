package com.example.arraylistmodelclass.modelclass;

public class StudentDetailsModelClass {

    String name,fname,city;
    int id,fees;

    public void setName(String name) {
        this.name = name;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setCity(String city) {
        this.city = city;
    }

//get

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public int getId() {
        return id;
    }

    public int getFees() {
        return fees;
    }

    public String getCity() {
        return city;
    }
}
