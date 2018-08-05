package com.kokamp.event.infrastructure.document.repository;

import com.kokamp.event.infrastructure.document.EventDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventDocumentRepository extends MongoRepository<EventDocument,String> {
}
