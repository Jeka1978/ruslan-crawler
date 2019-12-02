package com.naya.ruslancrawler.services;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class JobIlsParser implements SiteParser {
    @Override
    public String siteName() {
        return "job_ils";
    }

    @Override
    public Object parse(String url) {
        System.out.println("Logic 1 parsing site "+url);
        return null;
    }
}
