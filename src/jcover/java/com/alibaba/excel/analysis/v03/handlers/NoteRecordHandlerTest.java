package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.analysis.v03.XlsRecordHandler;

import org.apache.poi.hssf.record.Record;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler
 *
 * @author Diffblue JCover
 */

public class NoteRecordHandlerTest {

    @Test(timeout=10000)
    public void compareToReturnsMinusOne() {
        XlsRecordHandler o = mock(XlsRecordHandler.class);
        when(o.getOrder())
            .thenReturn(1);
        assertThat(new NoteRecordHandler().compareTo(o), is(-1));
    }

    @Test(timeout=10000)
    public void getOrderReturnsZero() {
        assertThat(new NoteRecordHandler().getOrder(), is(0));
    }

    @Test(timeout=10000)
    public void init() {
        new NoteRecordHandler().init();
    }

//    @Test(timeout=10000)
//    public void supportReturnsFalse() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(1);  <-- no suitable method found for thenReturn(int)
//        assertThat(new NoteRecordHandler().support(record), is(false));
//    }
//
//    @Test(timeout=10000)
//    public void supportReturnsTrue() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(28);  <-- no suitable method found for thenReturn(int)
//        assertThat(new NoteRecordHandler().support(record), is(true));
//    }
}
