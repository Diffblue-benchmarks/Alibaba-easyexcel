package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxSaxAnalyser;
import com.alibaba.excel.context.AnalysisContextImpl;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class XlsxSaxAnalyser_XlsxSaxAnalyserTest_1_Test {
  @Test
  public void XlsxSaxAnalyserTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;
    ByteArrayInputStream decryptedStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0});

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new XlsxSaxAnalyser(analysisContext, decryptedStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
