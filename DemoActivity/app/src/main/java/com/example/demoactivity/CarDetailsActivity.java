package com.example.demoactivity;

public class CarDetailsActivity {
    String company;
    String modelName;
    String transmission;
    int launchYear;
    double average;

    void setCompany(String company)
    {
        this.company=company;
    }

    void setModelName(String modelName)
    {
        this.modelName=modelName;
    }

    void setTransmission(String transmission)
    {
        this.transmission=transmission;
    }

    void setLaunchYear(int launchYear)
    {
        this.launchYear=launchYear;
    }

    void setAverage(double average)
    {
        this.average=average;
    }

//  DISPLAY

    String getCompany()
    {
        return company;
    }

    String getModelName()
    {
        return modelName;
    }

    String getTransmission()
    {
        return transmission;
    }

    int getLaunchYear()
    {
        return launchYear;
    }

    double getAverage()
    {
        return average;
    }
}
