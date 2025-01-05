package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.MilkDto;

import java.util.Collections;
import java.util.List;

public interface MilkService {


    boolean save(MilkDto milkDto);

    default List<MilkDto> getAll() {
        return Collections.emptyList();
    }

}
