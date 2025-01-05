package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.CricketDto;

import java.util.Collections;
import java.util.List;

public interface CricketRepo {

    void save(CricketDto cricketDto);

    default List<CricketDto> getAll(){
        return Collections.emptyList();
    }
}
