package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.CricketDto;

import java.util.Collections;
import java.util.List;

public interface CricketService {

    public boolean save(CricketDto cricketDto);

    default List<CricketDto> getAll(){
        return Collections.emptyList();
    }
}
