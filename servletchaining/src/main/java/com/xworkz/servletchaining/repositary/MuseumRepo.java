package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.MuseumTicketDto;

import java.util.Collections;
import java.util.List;

public interface MuseumRepo {

    void save(MuseumTicketDto museumTicketDto);

    default List<MuseumTicketDto> getAll() {
        return Collections.emptyList();
    }
}
