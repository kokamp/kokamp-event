package com.kokamp.event.application.manager;

import com.kokamp.event.domain.entity.EventEntity;

import java.util.List;

public interface EventManager {
    List<EventEntity> findAll();
    void create(EventEntity eventEntity);
}
