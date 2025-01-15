package com.xworkz.apachepoi.repository;

import com.xworkz.apachepoi.entity.AppEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class AppRepoImpl implements AppRepo{

    @Override
    public void save(AppEntity appEntity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("apps");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(appEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
