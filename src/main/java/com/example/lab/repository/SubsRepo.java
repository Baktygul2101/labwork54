package com.example.lab.repository;


import com.example.lab.model.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubsRepo extends CrudRepository<Subscription, String> {

}
