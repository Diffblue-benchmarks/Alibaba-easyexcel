package com.alibaba.excel.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.Ehcache
 *
 * @author Diffblue Cover
 */

class EhcacheTest {

    @Test
    void init() {
        new Ehcache(1).init(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void putValueIsValue() {
        new Ehcache(1).put("value");
    }

    @Test
    void get() {
        assertThat(new Ehcache(1).get(-1), is(nullValue()));
        assertThat(new Ehcache(1).get(null), is(nullValue()));
    }

    @Test
    void putFinished() {
        new Ehcache(1).putFinished();
    }
}
