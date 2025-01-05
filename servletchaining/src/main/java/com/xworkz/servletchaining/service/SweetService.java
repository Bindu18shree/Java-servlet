package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.SweetDto;

import java.util.Collections;
import java.util.List;

public interface SweetService {

    public boolean save(SweetDto sweetDto);

    default List<SweetDto> getAll() {
        return Collections.emptyList();
    }


}
