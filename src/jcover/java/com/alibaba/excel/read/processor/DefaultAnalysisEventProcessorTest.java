package com.alibaba.excel.read.processor;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.processor.DefaultAnalysisEventProcessor
 *
 * @author Diffblue Cover
 */

class DefaultAnalysisEventProcessorTest {

    @Test
    void extra1() {
        new DefaultAnalysisEventProcessor().extra(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void extra2() {
        new DefaultAnalysisEventProcessor().extra(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void endSheet1() {
        new DefaultAnalysisEventProcessor().endSheet(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void endSheet2() {
        new DefaultAnalysisEventProcessor().endSheet(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }
}
