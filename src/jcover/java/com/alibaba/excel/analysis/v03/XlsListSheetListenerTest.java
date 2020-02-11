//package com.alibaba.excel.analysis.v03;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import com.alibaba.excel.context.AnalysisContext;
//
//import org.apache.poi.hssf.record.Record;
//import org.junit.Test;
//
///**
// * Unit tests for com.alibaba.excel.analysis.v03.XlsListSheetListener
// *
// * @author Diffblue JCover
// */
//
//public class XlsListSheetListenerTest {
//
//    @Test(timeout=10000)
//    public void processRecord() {
//        AnalysisContext analysisContext = mock(AnalysisContext.class);
//        Record record = mock(Record.class);
//        when(record.getSid())
//            .thenReturn(1)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        new XlsListSheetListener(analysisContext, new org.apache.poi.poifs.filesystem.POIFSFileSystem()).processRecord(record);
//    }
//}
