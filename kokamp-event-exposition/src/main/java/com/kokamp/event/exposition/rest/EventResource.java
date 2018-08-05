package com.kokamp.event.exposition.rest;

import com.kokamp.event.application.manager.EventManager;
import com.kokamp.event.domain.entity.EventEntity;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventResource {

    private final EventManager eventManager;

    public EventResource(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @GetMapping( value = "/events", produces =MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<com.kokamp.event.exposition.rest.EventDto>> getAll(){
       final List<EventEntity> eventEntityList =  eventManager.findAll();
        ModelMapper modelMapper = new ModelMapper();
       List<com.kokamp.event.exposition.rest.EventDto> eventDtos = eventEntityList.stream().map(eventEntity -> modelMapper.map(eventEntity, com.kokamp.event.exposition.rest.EventDto.class) ).collect(Collectors.toList());
        return new ResponseEntity<>(eventDtos, HttpStatus.OK);
    }


    @PostMapping( value = "/events", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody com.kokamp.event.exposition.rest.EventDto eventDto){
        ModelMapper modelMapper = new ModelMapper();
        eventManager.create(modelMapper.map(eventDto,EventEntity.class));
        return new ResponseEntity<>(null, HttpStatus.CREATED);


    }

}
