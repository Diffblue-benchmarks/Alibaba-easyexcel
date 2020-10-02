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
    void factory1() {
        // pojo SimpleReadCacheSelector new SimpleReadCacheSelector()
    }

    @Test
    void factory2() {
        // pojo SimpleReadCacheSelector new SimpleReadCacheSelector(0L, 1)
    }

    @Test
    void factory3() {
        // pojo SimpleReadCacheSelector new SimpleReadCacheSelector(1L, 0)
    }

    @Test
    void readCache1() {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1L);
        // pojo com.alibaba.excel.cache.ReadCache new SimpleReadCacheSelector().readCache(sharedStringsTablePackagePart)
    }

    @Test
    void readCache2() {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(1000000L);
        // pojo com.alibaba.excel.cache.ReadCache new SimpleReadCacheSelector(1L, 1).readCache(sharedStringsTablePackagePart)
    }

    @Test
    void readCache3() throws java.io.IOException {
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        when(sharedStringsTablePackagePart.getInputStream())
            .thenReturn(new StringBufferInputStream("foo"));
        when(sharedStringsTablePackagePart.getSize())
            .thenReturn(-1L);
        // pojo com.alibaba.excel.cache.ReadCache new SimpleReadCacheSelector().readCache(sharedStringsTablePackagePart)
    }
}
