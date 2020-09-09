package com.alibaba.excel.analysis.v07.handlers.sax;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.Ehcache;

import org.junit.jupiter.api.Test;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.sax.SharedStringsTableHandler
 *
 * @author Diffblue Cover
 */

class SharedStringsTableHandlerTest {

    @Test
    void startElementNameIsAcmeAndUriIsBar() {
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(new Ehcache(1)).startElement("bar", "Acme", "Acme", attributes);
    }

    @Test
    void startElementNameIsRPh() {
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(new Ehcache(1)).startElement("/some/path.html", "Acme", "rPh", attributes);
    }

    @Test
    void startElementNameIsSi() {
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(new Ehcache(1)).startElement("/some/path.html", "Acme", "si", attributes);
    }

    @Test
    void startElementNameIsT() {
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(new Ehcache(1)).startElement("/some/path.html", "Acme", "t", attributes);
    }

    @Test
    void endElementNameIsAcme() {
        new SharedStringsTableHandler(new Ehcache(1)).endElement("bar", "Acme", "Acme");
    }

    @Test
    void endElementNameIsRPh() {
        new SharedStringsTableHandler(new Ehcache(1)).endElement("/some/path.html", "Acme", "rPh");
    }

    @Test
    void endElementNameIsSi() {
        new SharedStringsTableHandler(new Ehcache(1)).endElement("bar", "Acme", "si");
    }

    @Test
    void endElementNameIsT() {
        new SharedStringsTableHandler(new Ehcache(1)).endElement("bar", "Acme", "t");
    }

    @Test
    void charactersChIsaAndLengthIsZeroAndStartIsMinusOne() {
        char[] ch = new char[] { 'a' };
        new SharedStringsTableHandler(new Ehcache(1)).characters(ch, -1, 0);
    }

    @Test
    void resolveEntityReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        assertThat(new SharedStringsTableHandler(new Ehcache(1)).resolveEntity("1234", "1234"), is(nullValue()));
    }
}
