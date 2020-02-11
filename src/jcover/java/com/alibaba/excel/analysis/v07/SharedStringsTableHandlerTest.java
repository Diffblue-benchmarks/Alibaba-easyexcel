package com.alibaba.excel.analysis.v07;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;

import org.junit.Test;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.SharedStringsTableHandler
 *
 * @author Diffblue JCover
 */

public class SharedStringsTableHandlerTest {

    @Test(timeout=10000)
    public void charactersChIsaAndLengthIsOneAndStartIsZero() {
        ReadCache readCache = mock(ReadCache.class);
        char[] ch = new char[] { 'a' };
        new SharedStringsTableHandler(readCache).characters(ch, 0, 1);
    }

    @Test(timeout=10000)
    public void endElementLocalNameIsBarAndNameIsSi() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("foo", "bar", "si");
    }

    @Test(timeout=10000)
    public void endElementLocalNameIsBarAndNameIsT() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("foo", "bar", "t");
    }

    @Test(timeout=10000)
    public void endElementLocalNameIsSiAndNameIsBar() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("foo", "si", "bar");
    }

    @Test(timeout=10000)
    public void endElementNameIsRPh() {
        ReadCache readCache = mock(ReadCache.class);
        new SharedStringsTableHandler(readCache).endElement("foo", "/bin/bash", "rPh");
    }

    @Test(timeout=10000)
    public void resolveEntityPublicIdIsFooAndSystemIdIsFooReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        ReadCache readCache = mock(ReadCache.class);
        assertThat(new SharedStringsTableHandler(readCache).resolveEntity("foo", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void startElementLocalNameIsBar() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("foo", "bar", "/bin/bash", attributes);
    }

    @Test(timeout=10000)
    public void startElementNameIsRPh() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("foo", "/bin/bash", "rPh", attributes);
    }

    @Test(timeout=10000)
    public void startElementNameIsSi() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("foo", "/bin/bash", "si", attributes);
    }

    @Test(timeout=10000)
    public void startElementNameIsT() {
        ReadCache readCache = mock(ReadCache.class);
        Attributes attributes = mock(Attributes.class);
        new SharedStringsTableHandler(readCache).startElement("foo", "/bin/bash", "t", attributes);
    }
}
