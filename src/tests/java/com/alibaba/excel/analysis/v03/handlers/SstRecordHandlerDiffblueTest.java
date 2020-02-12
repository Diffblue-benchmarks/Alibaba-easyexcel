package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.analysis.v03.XlsRecordHandler;

import org.apache.poi.hssf.record.Record;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.SstRecordHandler
 *
 * @author Diffblue JCover
 */

public class SstRecordHandlerDiffblueTest {

    @Test(timeout=10000)
    public void compareToReturnsMinusOne() {
        XlsRecordHandler o = mock(XlsRecordHandler.class);
        when(o.getOrder())
            .thenReturn(1);
        assertThat(new SstRecordHandler().compareTo(o), is(-1));
    }

    @Test(timeout=10000)
    public void getOrderReturnsZero() {
        assertThat(new SstRecordHandler().getOrder(), is(0));
    }

    @Test(timeout=10000)
    public void init() {
        new SstRecordHandler().init();
    }

//    @Test(timeout=10000)
//    public void processRecord() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        new SstRecordHandler().processRecord(record);
//    }
//
//    @Test(timeout=10000)
//    public void support1() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(252);  <-- no suitable method found for thenReturn(int)
//        assertThat(new SstRecordHandler().support(record), is(true));
//    }
//
//    @Test(timeout=10000)
//    public void support2() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(1)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(253);
//        assertThat(new SstRecordHandler().support(record), is(true));
//    }
//
//    @Test(timeout=10000)
//    public void supportReturnsFalse() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        assertThat(new SstRecordHandler().support(record), is(false));
//    }
}
