package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.apache.poi.hssf.record.Record;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler
 *
 * @author Diffblue Cover
 */

class MissingCellDummyRecordHandlerTest {

    @Test
    void supportReturnsFalse() throws CloneNotSupportedException {
        Record record = mock(Record.class);
        assertThat(new MissingCellDummyRecordHandler().support(record), is(false));
    }

    @Test
    void init() {
        new MissingCellDummyRecordHandler().init();
    }

    @Test
    void compareToReturnsOne() {
        assertThat(new MissingCellDummyRecordHandler().compareTo(new BlankOrErrorRecordHandler()), is(1));
    }
}
