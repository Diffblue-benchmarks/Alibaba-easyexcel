package com.alibaba.excel.analysis.v07.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler
 *
 * @author Diffblue Cover
 */

class CountRowCellHandlerTest {

    @Test
    void supportNameIsCurrentReturnsFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        assertThat(new CountRowCellHandler(new AnalysisContextImpl(readWorkbook)).support("current"), is(false));
    }

    @Test
    void endHandleNameIsCurrent() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        new CountRowCellHandler(new AnalysisContextImpl(readWorkbook)).endHandle("current");
    }
}
