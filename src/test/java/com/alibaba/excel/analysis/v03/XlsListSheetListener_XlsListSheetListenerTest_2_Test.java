package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsListSheetListener_XlsListSheetListenerTest_2_Test {
  @Test
  public void XlsListSheetListenerTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;
    POIFSFileSystem poifsFileSystem = new POIFSFileSystem();

    // Act
    XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(analysisContext, poifsFileSystem);

    // Assert
    Assert.assertNotNull(xlsListSheetListener.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
