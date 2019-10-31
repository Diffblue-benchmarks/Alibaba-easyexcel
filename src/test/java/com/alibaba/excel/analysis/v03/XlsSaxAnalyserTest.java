package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsSaxAnalyser;
import com.alibaba.excel.context.AnalysisContext;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XlsSaxAnalyserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNullPointerException9998d9a5bf319cf174e() {

    // Arrange
    final AnalysisContext arg0 = null;
    final POIFSFileSystem arg1 = new POIFSFileSystem();

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new XlsSaxAnalyser(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
