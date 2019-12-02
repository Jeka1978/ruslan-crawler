package com.naya.ruslancrawler.services;

/**
 * @author Evgeny Borisov
 */
public interface SiteParser {
    String siteName();
    Object parse(String url);
}
