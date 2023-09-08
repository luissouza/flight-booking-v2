package org.pt.flightbooking.domain.service;

import org.springframework.cache.annotation.Cacheable;

import java.util.Optional;

public interface FlightsRecordsService {

    Optional<?> filterFlightsRecords();

    void deleteAll();
}
