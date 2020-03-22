package com.example.lab.service;


import com.example.lab.dto.EventDTO;
import com.example.lab.model.Event;
import com.example.lab.repository.EventRepo;
import com.example.lab.repository.SubsRepo;
import lombok.var;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepo eventRepo;
    private final SubsRepo subsRepo;
    private Event event;

    public EventService(EventRepo eventRepo, SubsRepo subsRepo) {
        this.eventRepo = eventRepo;
        this.subsRepo = subsRepo;
    }



    public List<Event> findAll() {
        Sort sort = Sort.by(Sort.Order.asc("event"));
        return eventRepo.findAll(sort);
    }


    public EventDTO addEvent(EventDTO eventData) {

        var movie = Event.builder()
                .event(eventData.getEvent())
                .time(eventData.getTime())
                .description(eventData.getDescription())
                .build();

        eventRepo.save(movie);
        return EventDTO.toDTO(event);
    }
}
