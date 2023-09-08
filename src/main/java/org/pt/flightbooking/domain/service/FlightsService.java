package org.pt.flightbooking.domain.service;

import org.pt.flightbooking.core.configuration.cache.CacheCustomKeys;
import org.pt.flightbooking.data.dto.request.FlightSearchParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import java.util.Optional;

public interface FlightsService {

    Logger log = LoggerFactory.getLogger(FlightsService.class);

    @Cacheable(value = "filterFlights", key=CacheCustomKeys.FILTER_FLIGHTS_KEY, cacheManager = "cacheManager")
    Optional<?> filterFlights(FlightSearchParams params);
}
