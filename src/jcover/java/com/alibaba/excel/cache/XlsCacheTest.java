package com.alibaba.excel.cache;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.cache.XlsCache
 *
 * @author Diffblue Cover
 */

class XlsCacheTest {

    @Test
    void putValueIsValue() {
        new XlsCache(new org.apache.poi.hssf.record.SSTRecord()).put("value");
    }

    @Test
    void putFinished() {
        new XlsCache(new org.apache.poi.hssf.record.SSTRecord()).putFinished();
    }

    @Test
    void destroy() {
        new XlsCache(new org.apache.poi.hssf.record.SSTRecord()).destroy();
    }
}
