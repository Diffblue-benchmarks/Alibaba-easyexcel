package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.analysis.v03.XlsRecordHandler;

import org.apache.poi.hssf.record.Record;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler
 *
 * @author Diffblue JCover
 */

public class MissingCellDummyRecordHandlerTest {

    @Test(timeout=10000)
    public void compareToReturnsZero() {
        XlsRecordHandler o = mock(XlsRecordHandler.class);
        when(o.getOrder())
            .thenReturn(1);
        assertThat(new MissingCellDummyRecordHandler().compareTo(o), is(0));
    }

    @Test(timeout=10000)
    public void getOrderReturnsOne() {
        assertThat(new MissingCellDummyRecordHandler().getOrder(), is(1));
    }

    @Test(timeout=10000)
    public void init() {
        new MissingCellDummyRecordHandler().init();
    }

    @Test(timeout=10000)
    public void supportReturnsFalse() {
        Record record = mock(Record.class);
        assertThat(new MissingCellDummyRecordHandler().support(record), is(false));
    }
}
