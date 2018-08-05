package com.kokamp.event.application.manager;

import com.kokamp.event.domain.repository.EventRepository;
import com.kokamp.event.domain.entity.EventEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EventManagerImpl implements EventManager {

    private final EventRepository eventRepository;

    public EventManagerImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventEntity> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public void create(EventEntity eventEntity) {
        eventRepository.save(eventEntity);

    }


}
