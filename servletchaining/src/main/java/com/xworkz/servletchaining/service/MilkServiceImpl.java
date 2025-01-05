package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.MilkDto;
import com.xworkz.servletchaining.repositary.MilkRepImpl;
import com.xworkz.servletchaining.repositary.MilkRepo;

import java.util.List;

public class MilkServiceImpl implements MilkService{

   private  MilkRepo milkRepo = new MilkRepImpl();

    @Override
    public boolean save(MilkDto milkDto) {
        System.out.println("running save in MilkServiceImpl");
        milkRepo.save(milkDto);
        return true;

    }

    @Override
    public List<MilkDto> getAll() {
        System.out.println("running getAll in MilkServiceImpl");
        return milkRepo.getAll();
    }
}
