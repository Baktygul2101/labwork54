package com.example.lab.repository;

import com.example.lab.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event, String> {

}
