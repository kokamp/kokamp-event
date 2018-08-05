package com.kokamp.event.domain.repository;

import com.kokamp.event.domain.entity.EventEntity;

import java.util.List;

public interface EventRepository {
    List<EventEntity> findAll();

    void save(EventEntity eventEntity);
}
