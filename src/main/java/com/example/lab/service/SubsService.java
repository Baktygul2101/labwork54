package com.example.lab.service;


import com.example.lab.model.Event;
import com.example.lab.model.Subscription;
import com.example.lab.repository.EventRepo;
import com.example.lab.repository.SubsRepo;
import lombok.var;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsService {

    private final EventRepo eventRepo;
    private final SubsRepo subsRepo;

    public SubsService(EventRepo eventRepo, SubsRepo subsRepo) {
        this.eventRepo = eventRepo;
        this.subsRepo = subsRepo;
    }
    public List<Subscription> findAllByEmail() {
        Sort sort = Sort.by(Sort.Order.asc("event"));
        return subsRepo.findAllByEmail(sort);
    }


}
