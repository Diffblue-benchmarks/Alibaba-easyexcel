package com.alibaba.excel.analysis.v03.handlers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.xls.XlsReadContext;
import com.alibaba.excel.read.metadata.holder.xls.XlsReadSheetHolder;

import org.apache.poi.hssf.record.Record;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.DummyRecordHandler
 *
 * @author Diffblue Cover
 */

class DummyRecordHandlerTest {

    @Test
    void processRecord() {
        XlsReadSheetHolder xlsReadSheetHolder = mock(XlsReadSheetHolder.class);
        XlsReadContext xlsReadContext = mock(XlsReadContext.class);
        when(xlsReadContext.xlsReadSheetHolder())
            .thenReturn(xlsReadSheetHolder);
        Record record = mock(Record.class);
        new DummyRecordHandler().processRecord(xlsReadContext, record);
    }
}
