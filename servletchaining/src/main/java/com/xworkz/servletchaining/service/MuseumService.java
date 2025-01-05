package com.xworkz.servletchaining.service;

import com.xworkz.servletchaining.dto.MuseumTicketDto;

import java.util.Collections;
import java.util.List;

public interface MuseumService {

    public boolean save(MuseumTicketDto museumTicketDto);

    default List<MuseumTicketDto> getAll(){
        return Collections.emptyList();
    }
}
