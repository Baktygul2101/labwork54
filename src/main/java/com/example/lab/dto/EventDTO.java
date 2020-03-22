package com.example.lab.dto;
import com.example.lab.model.Event;
import lombok.*;
import java.time.LocalDate;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class EventDTO{

    private String id;
    private LocalDate time;
    private String event;
    private String description;

    public static EventDTO toDTO(Event event) {
        return EventDTO.builder()
                .id(event.getId())
                .event(event.getEvent())
                .time(event.getTime())
                .description(event.getDescription())
                .build();
    }
}