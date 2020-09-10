package com.alibaba.excel.read.processor;

import com.alibaba.excel.context.AnalysisContextImpl;
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
    void extra() {
        new DefaultAnalysisEventProcessor().extra(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }

    @Test
    void endSheet() {
        new DefaultAnalysisEventProcessor().endSheet(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS));
    }
}
