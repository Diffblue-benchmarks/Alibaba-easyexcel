package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.analysis.v03.XlsRecordHandler;

import org.apache.poi.hssf.record.Record;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.BlankOrErrorRecordHandler
 *
 * @author Diffblue JCover
 */

public class BlankOrErrorRecordHandlerDiffblueTest {

    @Test(timeout=10000)
    public void compareToReturnsMinusOne() {
        XlsRecordHandler o = mock(XlsRecordHandler.class);
        when(o.getOrder())
            .thenReturn(1);
        assertThat(new BlankOrErrorRecordHandler().compareTo(o), is(-1));
    }

    @Test(timeout=10000)
    public void getOrderReturnsZero() {
        assertThat(new BlankOrErrorRecordHandler().getOrder(), is(0));
    }

    @Test(timeout=10000)
    public void init() {
        new BlankOrErrorRecordHandler().init();
    }

//    @Test(timeout=10000)
//    public void processRecord() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        new BlankOrErrorRecordHandler().processRecord(record);
//    }
//
//    @Test(timeout=10000)
//    public void support1() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(513);  <-- no suitable method found for thenReturn(int)
//        assertThat(new BlankOrErrorRecordHandler().support(record), is(true));
//    }
//
//    @Test(timeout=10000)
//    public void support2() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(1)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(517);
//        assertThat(new BlankOrErrorRecordHandler().support(record), is(true));
//    }
//
//    @Test(timeout=10000)
//    public void supportReturnsFalse() {
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        assertThat(new BlankOrErrorRecordHandler().support(record), is(false));
//    }
}
