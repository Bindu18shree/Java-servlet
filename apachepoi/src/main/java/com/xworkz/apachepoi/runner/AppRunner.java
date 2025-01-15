package com.xworkz.apachepoi.runner;

import com.xworkz.apachepoi.entity.AppEntity;
import com.xworkz.apachepoi.service.AppService;
import com.xworkz.apachepoi.service.AppServiceImpl;

public class AppRunner {

    public static void main(String[] args) {

        AppEntity appEntity = new AppEntity();

        AppService appService = new AppServiceImpl();
        appService.save(appEntity);

        System.out.println("Data successfully saved from Excel to Database!");
    }
}
