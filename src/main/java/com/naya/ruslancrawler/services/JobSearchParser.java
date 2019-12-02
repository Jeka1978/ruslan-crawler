package com.naya.ruslancrawler.services;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class JobSearchParser implements SiteParser {
    @Override
    public String siteName() {
        return "job_search";
    }

    @Override
    public Object parse(String url) {
        System.out.println("Logic 2 parsing site "+url);
        return null;
    }
}
