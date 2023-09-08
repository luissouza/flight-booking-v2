package org.pt.flightbooking.core.configuration.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cache.interceptor.KeyGenerator;

import java.util.Arrays;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean("cacheManager")
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        Cache filterFlights = new ConcurrentMapCache("filterFlights");
        cacheManager.setCaches(Arrays.asList(filterFlights));
        return cacheManager;
    }

    @Bean("customKeyGenerator")
    public KeyGenerator customKeyGenerator() {
        return (o, method, objects) -> {
            final StringBuilder sb = new StringBuilder();
            sb.append(o.getClass().getName());
            sb.append(method.getName());
            for (final Object obj : objects) {
                sb.append(obj.toString());
            }
            return sb.toString();
        };
    }
}