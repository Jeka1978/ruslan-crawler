package com.naya.ruslancrawler.services;

import com.naya.ruslancrawler.SitesProperties;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class CrawlerService {
    private Map<String, SiteParser> url2Parser;

    public CrawlerService(SitesProperties sitesProperties, List<SiteParser> parsers) {
        url2Parser = parsers.stream()
                .collect(toMap(siteParser -> sitesProperties.getSites().get(siteParser.siteName()),
                        Function.identity()));
    }


    @Scheduled(fixedDelay = 500)
    public void parseAllSites(){
        url2Parser.forEach((url, siteParser) -> siteParser.parse(url));
    }
}
