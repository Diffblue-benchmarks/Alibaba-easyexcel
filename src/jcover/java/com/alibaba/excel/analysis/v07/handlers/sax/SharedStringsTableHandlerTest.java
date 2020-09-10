package com.alibaba.excel.analysis.v07.handlers.sax;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.sax.SharedStringsTableHandler
 *
 * @author Diffblue Cover
 */

class SharedStringsTableHandlerTest {

    @Test
    void startElementNameIsAcmeAndUriIsBar() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("bar", "Acme", "Acme", attributes);
    }

    @Test
    void startElementNameIsRPh() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("/some/path.html", "Acme", "rPh", attributes);
    }

    @Test
    void startElementNameIsSi() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("/some/path.html", "Acme", "si", attributes);
    }

    @Test
    void startElementNameIsT() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("/some/path.html", "Acme", "t", attributes);
    }

    @Test
    void endElement() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("bar", "Acme", "si");
        Mockito.verify(readCache).put(ArgumentMatchers.eq((String) null));
    }

    @Test
    void endElementNameIsAcmeAndUriIsBar() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("bar", "Acme", "Acme");
    }

    @Test
    void endElementNameIsRPh() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("/some/path.html", "Acme", "rPh");
    }

    @Test
    void endElementNameIsTAndUriIsBar() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("bar", "Acme", "t");
    }

    @Test
    void charactersChIsaAndLengthIsOneAndStartIsZero() {
        ReadCache readCache = mock(ReadCache.class);
        char[] ch = new char[] { 'a' };
        new SharedStringsTableHandler(readCache).characters(ch, 0, 1);
    }

    @Test
    void resolveEntityReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        ReadCache readCache = mock(ReadCache.class);
        assertThat(new SharedStringsTableHandler(readCache).resolveEntity("1234", "1234"), is(nullValue()));
    }
}
