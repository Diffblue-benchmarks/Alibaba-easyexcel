package com.alibaba.excel.cache.selector;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.Ehcache;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.selector.EternalReadCacheSelector
 *
 * @author Diffblue Cover
 */

class EternalReadCacheSelectorTest {

    @Test
    void readCache() throws java.io.IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, org.apache.poi.openxml4j.exceptions.OpenXML4JException {
        Ehcache readCache = new Ehcache(1);
        PackagePart sharedStringsTablePackagePart = mock(PackagePart.class);
        assertThat(new EternalReadCacheSelector(readCache).readCache(sharedStringsTablePackagePart), instanceOf(Ehcache.class));
        assertThat((Ehcache) new EternalReadCacheSelector(readCache).readCache(sharedStringsTablePackagePart), sameInstance(readCache));
    }
}
