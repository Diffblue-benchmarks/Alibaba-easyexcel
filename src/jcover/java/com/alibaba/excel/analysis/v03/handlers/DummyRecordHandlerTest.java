package com.alibaba.excel.analysis.v03.handlers;

import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.apache.poi.hssf.record.Record;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.DummyRecordHandler
 *
 * @author Diffblue Cover
 */

class DummyRecordHandlerTest {

    @Test
    void processRecord() throws CloneNotSupportedException {
        Record record = mock(Record.class);
        new DummyRecordHandler().processRecord(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS), record);
    }
}
