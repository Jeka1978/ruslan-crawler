package com.naya.ruslancrawler;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties(prefix="crawler")
@Data
public class SitesProperties {
    private Map<String,String> sites;
}
