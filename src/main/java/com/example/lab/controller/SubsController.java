package com.example.lab.controller;


import com.example.lab.model.Subscription;
import com.example.lab.service.SubsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/subscriptions")
public class SubsController {
    @Autowired
    private SubsService subsService;

    @GetMapping("/byemail")
    public List<Subscription> eventsByEmail() {
        return subsService.findAllByEmail();
    }
}