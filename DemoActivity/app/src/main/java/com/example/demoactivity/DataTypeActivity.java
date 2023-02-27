package com.example.demoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DataTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_type);

//        NUMBER 1
     Log.e("TAG", "");
     Log.e("TAG", "******ENTRY 1*****");
     Log.e("TAG", "");
        CarDetailsActivity entry1=new CarDetailsActivity();

        entry1.setCompany("Mercedes");
        entry1.setModelName("G wagon");
        entry1.setTransmission("Automatic");
        entry1.setLaunchYear(2015);
        entry1.setAverage(8.5);

       String company= entry1.getCompany();
        Log.e("TAG", "Company: "+company);

        String modelName=entry1.getModelName();
        Log.e("TAG", "MODEL NAME: "+modelName);

         String transmission=entry1.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission);

        int launchYear=entry1.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear);

       double average= entry1.getAverage();
        Log.e("TAG", "AVERAGE: "+average);


        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");

        ResaleValueActivity resale1=new ResaleValueActivity();

        resale1.setCompany("Mercedes");
        resale1.setModelName("G wagon");
        resale1.setPrice(3500000.00);
        resale1.setYearPurchased(2018);

        String resale1Company=resale1.getCompany();
        Log.e("TAG", "COMPANY: "+resale1Company );

        String resale1ModelName=resale1.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale1ModelName);

        double resale1Price =resale1.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale1Price);

        int resale1YearPurchased=resale1.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale1YearPurchased);








//        NUMBER 2
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 2*****");
     Log.e("TAG", "");

        CarDetailsActivity entry2= new CarDetailsActivity();

        entry2.setCompany("BMW");
        entry2.setModelName("X7");
        entry2.setTransmission("Automatic");
        entry2.setLaunchYear(2021);
        entry2.setAverage(12.00);

        String company1=entry2.getCompany();
        Log.e("TAG", "COMPANY: "+company1);

       String modelName1=entry2.getModelName();
        Log.e("TAG", "MODEL NAME: "+modelName1);

        String transmission1=entry2.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission1);

        int launchYear1=entry2.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear1);

        double average1 = entry2.getAverage();
        Log.e("TAG", "AVERAGE: "+average1);


        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");

        ResaleValueActivity resale2=new ResaleValueActivity();

        resale2.setCompany("BMW");
        resale2.setModelName("X7");
        resale2.setPrice(6500000.00);
        resale2.setYearPurchased(2019);

        String resale2Company=resale2.getCompany();
        Log.e("TAG", "COMPANY: "+resale2Company );

        String resale2ModelName=resale2.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale2ModelName);

        double resale2Price =resale2.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale2Price);

        int resale2YearPurchased=resale2.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale2YearPurchased);

//       NUMBER 3
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 3*****");
     Log.e("TAG", "");
        CarDetailsActivity entry3= new CarDetailsActivity();

        entry3.setCompany("AUDI");
        entry3.setModelName("Q7");
        entry3.setTransmission("Automatic");
        entry3.setLaunchYear(2022);
        entry3.setAverage(10.00);

        String company2=entry3.getCompany();
        Log.e("TAG", "COMPANY: "+company2);

        String modelName2=entry3.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName2);

        String transmission2=entry3.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission2);

        int launchYear2=entry3.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear2);

        double average2 = entry3.getAverage();
        Log.e("TAG", "AVERAGE: "+average2);

        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");

        ResaleValueActivity resale3=new ResaleValueActivity();

        resale3.setCompany("AUDI");
        resale3.setModelName("Q7");
        resale3.setPrice(5000000.00);
        resale3.setYearPurchased(2022);

        String resale3Company=resale3.getCompany();
        Log.e("TAG", "COMPANY: "+resale3Company );

        String resale3ModelName=resale3.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale2ModelName);

        double resale3Price =resale3.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale3Price);

        int resale3YearPurchased=resale3.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale3YearPurchased);


//        NUMBER 4
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 4*****");
     Log.e("TAG", "");
        CarDetailsActivity entry4= new CarDetailsActivity();

        entry4.setCompany("MARUTI SUZUKI");
        entry4.setModelName("GRAND VITARA");
        entry4.setTransmission("Manual");
        entry4.setLaunchYear(2022);
        entry4.setAverage(20.00);

        String company3=entry4.getCompany();
        Log.e("TAG", "COMPANY: "+company3);

        String modelName3=entry4.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName3);

        String transmission3=entry4.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission3);

        int launchYear3=entry4.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear3);

        double average3 = entry4.getAverage();
        Log.e("TAG", "AVERAGE: "+average3);

        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");

        ResaleValueActivity resale4=new ResaleValueActivity();

        resale4.setCompany("MARUTI SUZUKI");
        resale4.setModelName("GRAND VITARA");
        resale4.setPrice(1800000.00);
        resale4.setYearPurchased(2022);

        String resale4Company=resale4.getCompany();
        Log.e("TAG", "COMPANY: "+resale4Company );

        String resale4ModelName=resale4.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale4ModelName);

        double resale4Price =resale4.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale4Price);

        int resale4YearPurchased=resale4.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale4YearPurchased);

//    NUMBER 5
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 5*****");
     Log.e("TAG", "");
        CarDetailsActivity entry5= new CarDetailsActivity();

        entry5.setCompany("HYUNDAI");
        entry5.setModelName("CRETA");
        entry5.setTransmission("Manual");
        entry5.setLaunchYear(2018);
        entry5.setAverage(15.00);

        String company4=entry5.getCompany();
        Log.e("TAG", "COMPANY: "+company4);

        String modelName4=entry5.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName4);

        String transmission4=entry5.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission4);

        int launchYear4=entry5.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear4);

        double average4 = entry5.getAverage();
        Log.e("TAG", "AVERAGE: "+average4);


        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale5=new ResaleValueActivity();

        resale5.setCompany("HYUNDAI");
        resale5.setModelName("CRETA");
        resale5.setPrice(1200000.00);
        resale5.setYearPurchased(2020);

        String resale5Company=resale5.getCompany();
        Log.e("TAG", "COMPANY: "+resale5Company );

        String resale5ModelName=resale5.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale5ModelName);

        double resale5Price =resale5.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale5Price);

        int resale5YearPurchased=resale5.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale5YearPurchased);


//        NUMBER 6
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 6*****");
     Log.e("TAG", "");
        CarDetailsActivity entry6= new CarDetailsActivity();

        entry6.setCompany("HONDA");
        entry6.setModelName("CITY");
        entry6.setTransmission("Manual");
        entry6.setLaunchYear(2011);
        entry6.setAverage(18.00);

        String company5=entry6.getCompany();
        Log.e("TAG", "COMPANY: "+company5);

        String modelName5=entry6.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName5);

        String transmission5=entry6.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission5);

        int launchYear5=entry6.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear5);

        double average5 = entry6.getAverage();
        Log.e("TAG", "AVERAGE: "+average5);

        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale6=new ResaleValueActivity();

        resale6.setCompany("HONDA");
        resale6.setModelName("CITY");
        resale6.setPrice(800000.00);
        resale6.setYearPurchased(2020);

        String resale6Company=resale6.getCompany();
        Log.e("TAG", "COMPANY: "+resale6Company );

        String resale6ModelName=resale6.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale6ModelName);

        double resale6Price =resale6.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale5Price);

        int resale6YearPurchased=resale6.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale6YearPurchased);

//NUMBER 7
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 7*****");
     Log.e("TAG", "");
        CarDetailsActivity entry7= new CarDetailsActivity();

        entry7.setCompany("SKODA");
        entry7.setModelName("SUPERB");
        entry7.setTransmission("AUTOMATIC");
        entry7.setLaunchYear(2016);
        entry7.setAverage(12.00);

        String company6=entry7.getCompany();
        Log.e("TAG", "COMPANY: "+company6);

        String modelName6=entry7.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName6);

        String transmission6=entry7.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission6);

        int launchYear6=entry7.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear6);

        double average6 = entry7.getAverage();
        Log.e("TAG", "AVERAGE: "+average6);


        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale7=new ResaleValueActivity();

        resale7.setCompany("SKODA");
        resale7.setModelName("SUBERB");
        resale7.setPrice(755000.00);
        resale7.setYearPurchased(2021);

        String resale7Company=resale7.getCompany();
        Log.e("TAG", "COMPANY: "+resale7Company );

        String resale7ModelName=resale7.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale7ModelName);

        double resale7Price =resale7.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale7Price);

        int resale7YearPurchased=resale7.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale7YearPurchased);


//NUMBER 8
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 8*****");
     Log.e("TAG", "");
        CarDetailsActivity entry8= new CarDetailsActivity();

        entry8.setCompany("TATA MOTORS");
        entry8.setModelName("SAFARI");
        entry8.setTransmission("AUTOMATIC, MANUAL");
        entry8.setLaunchYear(2020);
        entry8.setAverage(18.00);

        String company7=entry8.getCompany();
        Log.e("TAG", "COMPANY: "+company7);

        String modelName7=entry8.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName7);

        String transmission7=entry8.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission7);

        int launchYear7=entry8.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear7);

        double average7 = entry8.getAverage();
        Log.e("TAG", "AVERAGE: "+average7);

        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale8=new ResaleValueActivity();

        resale8.setCompany("TATA MOTORS");
        resale8.setModelName("SAFARI");
        resale8.setPrice(115500.00);
        resale8.setYearPurchased(2022);

        String resale8Company=resale8.getCompany();
        Log.e("TAG", "COMPANY: "+resale8Company );

        String resale8ModelName=resale8.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale8ModelName);

        double resale8Price =resale8.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale8Price);

        int resale8YearPurchased=resale8.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale8YearPurchased);


//NUMBER 9
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 9*****");
     Log.e("TAG", "");
        CarDetailsActivity entry9= new CarDetailsActivity();

        entry9.setCompany("TOYOTA");
        entry9.setModelName("FORTUNER");
        entry9.setTransmission("AUTOMATIC, MANUAL");
        entry9.setLaunchYear(2010);
        entry9.setAverage(14.00);

        String company8=entry9.getCompany();
        Log.e("TAG", "COMPANY: "+company8);

        String modelName8=entry9.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName8);

        String transmission8=entry9.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission8);

        int launchYear8=entry9.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear8);

        double average8 = entry9.getAverage();
        Log.e("TAG", "AVERAGE: "+average8);

        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale9=new ResaleValueActivity();

        resale9.setCompany("TOYOTA");
        resale9.setModelName("FORTUNER");
        resale9.setPrice(2810000.00);
        resale9.setYearPurchased(2022);

        String resale9Company=resale9.getCompany();
        Log.e("TAG", "COMPANY: "+resale9Company );

        String resale9ModelName=resale9.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale9ModelName);

        double resale9Price =resale9.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale9Price);

        int resale9YearPurchased=resale9.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale9YearPurchased);

//NUMBER 10
     Log.e("TAG", "");
        Log.e("TAG", "******ENTRY 10*****");
     Log.e("TAG", "");
        CarDetailsActivity entry10= new CarDetailsActivity();

        entry10.setCompany("KIA MOTORS");
        entry10.setModelName("SELTOS");
        entry10.setTransmission("AUTOMATIC, MANUAL");
        entry10.setLaunchYear(2019);
        entry10.setAverage(18.00);

        String company9=entry10.getCompany();
        Log.e("TAG", "COMPANY: "+company9);

        String modelName9=entry10.getModelName();
        Log.e("TAG", "MODEL NUMBER: "+modelName9);

        String transmission9=entry10.getTransmission();
        Log.e("TAG", "TRANSMISSION: "+transmission9);

        int launchYear9=entry10.getLaunchYear();
        Log.e("TAG", "LAUNCH YEAR: "+launchYear9);

        double average9 = entry10.getAverage();
        Log.e("TAG", "AVERAGE: "+average9);


        Log.e("TAG", "");
        Log.e("TAG", "******RESALE VALUE*****");
        Log.e("TAG", "");
        ResaleValueActivity resale10=new ResaleValueActivity();

        resale10.setCompany("KIA MOTORS");
        resale10.setModelName("SELTOS");
        resale10.setPrice(1000000.00);
        resale10.setYearPurchased(2022);

        String resale10Company=resale10.getCompany();
        Log.e("TAG", "COMPANY: "+resale10Company );

        String resale10ModelName=resale10.getModelName();
        Log.e("TAG", "MODEL NAME: "+resale10ModelName);

        double resale10Price =resale10.getPrice();
        Log.e("TAG", "RESALE PRICE: "+resale10Price);

        int resale10YearPurchased=resale10.getYearPurchased();
        Log.e("TAG", "DATE OF PURCHASE: "+resale10YearPurchased);




    }
}