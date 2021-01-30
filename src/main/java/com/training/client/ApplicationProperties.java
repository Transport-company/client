package com.training.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

//@Data
//@Validated
//@Component
//@Primary
//@ConfigurationProperties(prefix = "properties")
public class ApplicationProperties {
//    @NotBlank
//    private String url;
//    @Positive
//    @NotNull
//    private Integer connectionTimeout;
//    @Positive
//    @NotNull
//    private Integer readTimeout;
}