package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsSaxAnalyser;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class XlsSaxAnalyser_XlsSaxAnalyserTest_1_Test {
  @Test
  public void XlsSaxAnalyserTest() throws Exception {
    // Arrange
    AnalysisContextImpl context = (AnalysisContextImpl) null;
    POIFSFileSystem poifsFileSystem = new POIFSFileSystem();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new XlsSaxAnalyser(context, poifsFileSystem);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
