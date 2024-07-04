package com.dp_ua.InstaSaver.service;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UrlCheckerTest {

    @Test
    public void testIsTextContainsUrl_True() {
        UrlChecker checker = new UrlChecker();
        String text = "Here is a link to a website: https://example.com";
        assertTrue(checker.isTextContainsUrl(text));
    }

    @Test
    public void testIsTextContainsUrl_False() {
        UrlChecker checker = new UrlChecker();
        String text = "Here is a text without any link.";
        assertFalse(checker.isTextContainsUrl(text));
    }

    @Test
    public void testExtractUrls_SingleUrl() {
        UrlChecker checker = new UrlChecker();
        String text = "Check this out: http://example.com";
        List<String> urls = checker.extractUrls(text);
        assertEquals(1, urls.size());
        assertEquals("http://example.com", urls.get(0));
    }

    @Test
    public void testExtractUrls_MultipleUrls() {
        UrlChecker checker = new UrlChecker();
        String text = "Here are two links: https://example.com and http://example.org";
        List<String> urls = checker.extractUrls(text);
        assertEquals(2, urls.size());
        assertEquals("https://example.com", urls.get(0));
        assertEquals("http://example.org", urls.get(1));
    }

    @Test
    public void testExtractUrls_NoUrls() {
        UrlChecker checker = new UrlChecker();
        String text = "This text has no links.";
        List<String> urls = checker.extractUrls(text);
        assertTrue(urls.isEmpty());
    }

    @Test
    public void testExtractUrls_ComplexUrls() {
        UrlChecker checker = new UrlChecker();
        String text = "Complex URL: https://sub.example.com/path?query=123#fragment";
        List<String> urls = checker.extractUrls(text);
        assertEquals(1, urls.size());
        assertEquals("https://sub.example.com/path?query=123#fragment", urls.get(0));
    }
}