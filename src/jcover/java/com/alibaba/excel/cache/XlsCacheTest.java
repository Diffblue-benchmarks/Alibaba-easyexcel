package com.alibaba.excel.cache;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.XlsCache
 *
 * @author Diffblue Cover
 */

class XlsCacheTest {

    @Test
    void init() {
        new XlsCache(new org.apache.poi.hssf.record.SSTRecord()).init(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

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
