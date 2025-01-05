package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.CricketDto;
import com.xworkz.servletchaining.repositary.CrcicketRepoImpl;
import com.xworkz.servletchaining.repositary.CricketRepo;

import java.util.List;

public class CricketServiceImpl implements CricketService{

    private CricketRepo cricketRepo=new CrcicketRepoImpl();
    @Override
    public boolean save(CricketDto cricketDto) {

    cricketRepo.save(cricketDto);

    return true;
    }

    @Override
    public List<CricketDto> getAll() {
        System.out.println("Running getAll in cricket service impl..");
        return cricketRepo.getAll();
    }
}
