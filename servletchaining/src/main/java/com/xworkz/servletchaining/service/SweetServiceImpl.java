package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.MilkDto;
import com.xworkz.servletchaining.dto.SweetDto;
import com.xworkz.servletchaining.repositary.SweetRepImpl;
import com.xworkz.servletchaining.repositary.SweetRepo;

import java.util.Collections;
import java.util.List;

public class SweetServiceImpl implements SweetService {

    private SweetRepo sweetRepo = new SweetRepImpl();
    @Override
    public boolean save(SweetDto sweetDto) {

        System.out.println("running save in SweetServiceImpl");
        sweetRepo.save(sweetDto);
        return true;

    }

    @Override
    public List<SweetDto> getAll() {
        System.out.println("Running getAll in sweet service impl..");
        return sweetRepo.getAll();
    }
}
