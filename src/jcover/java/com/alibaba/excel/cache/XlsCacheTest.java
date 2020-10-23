package com.alibaba.excel.cache;

import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

import org.apache.poi.hssf.record.SSTRecord;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.cache.XlsCache
 *
 * @author Diffblue Cover
 */

class XlsCacheTest {

    @Test
    void init() {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        new XlsCache(new SSTRecord()).init(analysisContext);
    }

    @Test
    void putValueIsValue() {
        new XlsCache(new SSTRecord()).put("value");
    }

    @Test
    void putFinished() {
        new XlsCache(new SSTRecord()).putFinished();
    }

    @Test
    void destroy() {
        new XlsCache(new SSTRecord()).destroy();
    }
}
