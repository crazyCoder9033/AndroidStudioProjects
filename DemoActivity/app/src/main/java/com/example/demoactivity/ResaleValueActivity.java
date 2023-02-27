package com.example.demoactivity;

public class ResaleValueActivity {

    String company;
    String modelName;
    double price;
    int yearPurchased;

    void setCompany(String company)
    {
        this.company=company;
    }

    void setModelName(String modelName)
    {
        this.modelName=modelName;
    }

    void setPrice(double price)
    {
        this.price=price;
    }

    void setYearPurchased(int yearPurchased)
    {
        this.yearPurchased=yearPurchased;
    }

//    DISPLAY

    String getCompany()
    {
        return company;
    }

    String getModelName()
    {
        return modelName;
    }

    double getPrice()
    {
        return price;
    }

    int getYearPurchased()
    {
        return yearPurchased;
    }

}
