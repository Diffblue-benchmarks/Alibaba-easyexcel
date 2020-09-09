package com.alibaba.excel.analysis.v07.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.context.xlsx.DefaultXlsxReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.HyperlinkTagHandler
 *
 * @author Diffblue Cover
 */

class HyperlinkTagHandlerTest {

    @Test
    void supportReturnsFalse() {
        assertThat(new HyperlinkTagHandler().support(new DefaultXlsxReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS)), is(false));
    }
}
