package com.example.lab.repository;

import com.example.lab.model.Event;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepo extends CrudRepository<Event, String> {
    public List<Event> findAll(Sort sort);
}
