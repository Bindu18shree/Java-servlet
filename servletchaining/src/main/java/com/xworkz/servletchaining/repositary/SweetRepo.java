package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.SweetDto;

import java.util.Collections;
import java.util.List;

public interface SweetRepo {

    void save(SweetDto sweetDto);

    default List<SweetDto> getAll(){
        return Collections.emptyList();
    }
}
