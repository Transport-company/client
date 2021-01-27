package com.training.client.util;

import com.training.client.ApplicationProperties;
import com.training.client.controller.TrackingControllerFeign;
import feign.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



@Configuration
@Import(FeignClientsConfiguration.class)
public class FeignConfiguration {
    private static final String DEFAULT_CONTEXT_PATH = "/api/v1/";

    @Bean
    @ConditionalOnMissingBean
    TrackingControllerFeign trackingControllerFeign(ApplicationProperties properties){
        return Feign.builder()
                .options(new Request.Options(
                        properties.getConnectionTimeout(),
                        properties.getReadTimeout()))
                .target(TrackingControllerFeign.class, properties.getUrl() + DEFAULT_CONTEXT_PATH);
    }

}