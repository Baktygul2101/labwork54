package com.example.lab.dto;

import com.example.lab.model.Event;
import lombok.*;
import com.example.lab.model.Subscription;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SubsDTO{
    private String id;
    private String eventId;
    private String email;
    private LocalDate regTime;

    public static SubsDTO toDTO(Subscription subscription) {
        return SubsDTO.builder()
                .id(subscription.getId())
                .eventId(subscription.getEvent().getId())
                .email(subscription.getEmail())
                .regTime(subscription.getRegTime())
                .build();
    }
}