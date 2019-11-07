package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.List;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class XlsListSheetListener_getSheetListTest_3_Test {
//failed_pass   @Test
//  public void getSheetListTest() throws Exception {
//    // Arrange
//    XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, new POIFSFileSystem());
//
//    // Act and Assert
//    thrown.expect(NoClassDefFoundError.class);
//    xlsListSheetListener.getSheetList();
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
