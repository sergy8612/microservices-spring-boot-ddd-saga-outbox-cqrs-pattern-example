package com.food.orderyng.system.domain.event.publisher;

import com.food.orderyng.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
