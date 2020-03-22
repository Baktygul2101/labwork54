package com.example.lab.controller;

import com.example.lab.dto.EventDTO;
import com.example.lab.model.Event;
import com.example.lab.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class EventController {
    @Autowired
    private EventService eventService;


    @GetMapping("/events")
    public List<Event> allEvents() {
        return eventService.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public EventDTO addEvent(@RequestBody EventDTO eventData) {
        return eventService.addEvent(eventData);
    }
}