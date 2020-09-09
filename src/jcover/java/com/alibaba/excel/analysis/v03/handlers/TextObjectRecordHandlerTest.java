package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.xls.DefaultXlsReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.apache.poi.hssf.record.Record;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.TextObjectRecordHandler
 *
 * @author Diffblue Cover
 */

class TextObjectRecordHandlerTest {

    @Test
    void supportReturnsFalse() throws CloneNotSupportedException {
        Record record = mock(Record.class);
        assertThat(new TextObjectRecordHandler().support(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS), record), is(false));
    }
}
