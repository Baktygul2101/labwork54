package com.example.lab.repository;


import com.example.lab.model.Event;
import com.example.lab.model.Subscription;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubsRepo extends CrudRepository<Subscription, String> {
    public List<Subscription> findAllByEmail(Sort sort);
}
