package com.demo.micrometerspringboot.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicrometerConfiguration {

 /*   @Bean
    MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry meterRegistry){
        return meterRegistry1 -> {
            meterRegistry.config()
                    .commonTags("application","Ejemplo micrometer");
        };
    }/*/
}
