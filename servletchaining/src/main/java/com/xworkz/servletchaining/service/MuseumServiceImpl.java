package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.MuseumTicketDto;
import com.xworkz.servletchaining.repositary.MuseumRepo;
import com.xworkz.servletchaining.repositary.MuseumRepoImpl;

import java.util.List;

public class MuseumServiceImpl implements MuseumService{

    private MuseumRepo museumRepo = new MuseumRepoImpl();
    @Override
    public boolean save(MuseumTicketDto museumTicketDto) {
        museumRepo.save(museumTicketDto);
        return true;
    }

    @Override
    public List<MuseumTicketDto> getAll() {
        System.out.println("Running getAll in museum service impl");
        return museumRepo.getAll();
    }
}
