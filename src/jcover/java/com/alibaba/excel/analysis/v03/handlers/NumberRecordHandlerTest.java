package com.alibaba.excel.analysis.v03.handlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.analysis.v03.XlsRecordHandler;

import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.record.Record;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.analysis.v03.handlers.NumberRecordHandler
 *
 * @author Diffblue JCover
 */

public class NumberRecordHandlerTest {

    @Test(timeout=10000)
    public void compareToReturnsMinusOne() {
        HSSFListener childListener1 = mock(HSSFListener.class);
        XlsRecordHandler o = mock(XlsRecordHandler.class);
        when(o.getOrder())
            .thenReturn(1);
        assertThat(new NumberRecordHandler(new FormatTrackingHSSFListener(childListener1)).compareTo(o), is(-1));
    }

    @Test(timeout=10000)
    public void getOrderReturnsZero() {
        HSSFListener childListener1 = mock(HSSFListener.class);
        assertThat(new NumberRecordHandler(new FormatTrackingHSSFListener(childListener1)).getOrder(), is(0));
    }

    @Test(timeout=10000)
    public void init() {
        HSSFListener childListener1 = mock(HSSFListener.class);
        new NumberRecordHandler(new FormatTrackingHSSFListener(childListener1)).init();
    }

//    @Test(timeout=10000)
//    public void supportReturnsFalse() {
//        HSSFListener childListener1 = mock(HSSFListener.class);
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(1);  <-- no suitable method found for thenReturn(int)
//        assertThat(new NumberRecordHandler(new FormatTrackingHSSFListener(childListener1)).support(record), is(false));
//    }
//
//    @Test(timeout=10000)
//    public void supportReturnsTrue() {
//        HSSFListener childListener1 = mock(HSSFListener.class);
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(515);  <-- no suitable method found for thenReturn(int)
//        assertThat(new NumberRecordHandler(new FormatTrackingHSSFListener(childListener1)).support(record), is(true));
//    }
}
