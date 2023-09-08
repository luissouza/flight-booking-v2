package org.pt.flightbooking.core.configuration.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


public class CacheCustomKeys {
    public static final String FILTER_FLIGHTS_KEY = "#params.currency+#params.dateFrom+#params.dateTo+#params.flyTo+#params.airLines";
}