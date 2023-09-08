package org.pt.flightbooking.domain.service;

import org.pt.flightbooking.core.configuration.cache.CacheCustomKeys;
import org.pt.flightbooking.data.dto.request.FlightSearchParams;
import org.springframework.cache.annotation.Cacheable;
import java.util.Optional;

public interface FlightsService {

    @Cacheable(value = "filterFlights", key=CacheCustomKeys.FILTER_FLIGHTS_KEY)
    Optional<?> filterFlights(FlightSearchParams params);
}
