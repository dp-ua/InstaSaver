package com.dp_ua.InstaSaver.service;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

@Component
public class UrlChecker {
    private static final String URL_PATTERN = "(http|https)://(\\w+\\.)?(\\w+\\.\\w+)(/\\S*)?";

    public boolean isTextContainsUrl(String text) {
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public List<String> extractUrls(String text) {
        List<String> urls = new ArrayList<>();
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            urls.add(matcher.group());
        }

        return urls;
    }
}