package com.alibaba.excel.cache.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.selector.EternalReadCacheSelector
 *
 * @author Diffblue Cover
 */

class EternalReadCacheSelectorTest {

    @Test
    void readCache() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException, IllegalArgumentException {
        ReadCache readCache = mock(ReadCache.class);
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        assertThat(new EternalReadCacheSelector(readCache).readCache(sharedStringsTablePackagePart), sameInstance(readCache));
    }
}
