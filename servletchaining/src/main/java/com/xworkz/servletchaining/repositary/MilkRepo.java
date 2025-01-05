package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.MilkDto;

import java.util.Collections;
import java.util.List;

public interface MilkRepo {

     void save(MilkDto milkDto);
     //forcing of impl by classes

     default List<MilkDto> getAll(){
          return  Collections.emptyList();
     }
}
