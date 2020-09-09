package com.alibaba.excel.cache.selector;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.StringBufferInputStream;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.selector.SimpleReadCacheSelector
 *
 * @author Diffblue Cover
 */

class SimpleReadCacheSelectorTest {

    @Test
    void readCache1() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        // inaccessible mock: PackagePart.getInputStreamImpl
        // inaccessible mock: PackagePart.getOutputStreamImpl
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1L);
        // pojo com.alibaba.excel.cache.ReadCache
    }

    @Test
    void readCache2() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        // inaccessible mock: PackagePart.getInputStreamImpl
        // inaccessible mock: PackagePart.getOutputStreamImpl
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1L);
        // pojo com.alibaba.excel.cache.ReadCache
    }

    @Test
    void readCache3() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        // inaccessible mock: PackagePart.getInputStreamImpl
        // inaccessible mock: PackagePart.getOutputStreamImpl
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1000000L);
        // pojo com.alibaba.excel.cache.ReadCache
    }

    @Test
    void readCache4() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        when(sharedStringsTablePackagePart.getInputStream())
            .thenReturn(new StringBufferInputStream("foo"));
        // inaccessible mock: PackagePart.getInputStreamImpl
        // inaccessible mock: PackagePart.getOutputStreamImpl
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(-1L);
        // pojo com.alibaba.excel.cache.ReadCache
    }

    @Test
    void readCache5() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        // inaccessible mock: PackagePart.getInputStreamImpl
        // inaccessible mock: PackagePart.getOutputStreamImpl
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1L);
        // pojo com.alibaba.excel.cache.ReadCache
    }
}
