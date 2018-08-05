package com.kokamp.event.infrastructure.repository;

import com.kokamp.event.domain.entity.EventEntity;
import com.kokamp.event.domain.repository.EventRepository;
import com.kokamp.event.infrastructure.document.EventDocument;
import com.kokamp.event.infrastructure.document.repository.EventDocumentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EventRepositoryImpl implements EventRepository {

    private final EventDocumentRepository eventDocumentRepository;

    public EventRepositoryImpl(EventDocumentRepository eventDocumentRepository) {
        this.eventDocumentRepository = eventDocumentRepository;
    }

    @Override
    public List<EventEntity> findAll() {

        ModelMapper modelMapper = new ModelMapper();
        List<EventEntity> eventEntities = eventDocumentRepository.findAll().stream().map(eventDocument -> modelMapper.map(eventDocument,EventEntity.class)).collect(Collectors.toList());
        return eventEntities;
    }

    @Override
    public void save(EventEntity eventEntity) {
        ModelMapper modelMapper = new ModelMapper();
        eventDocumentRepository.save(modelMapper.map(eventEntity, EventDocument.class));
    }
}
