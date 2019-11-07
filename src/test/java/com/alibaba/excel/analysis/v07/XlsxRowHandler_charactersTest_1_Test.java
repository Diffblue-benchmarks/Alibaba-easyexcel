package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxRowHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxRowHandler_charactersTest_1_Test {
  @Test
  public void charactersTest() throws Exception {
    // Arrange
    XlsxRowHandler xlsxRowHandler = new XlsxRowHandler(null, new StylesTable());
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
    int start = 1;
    int length = 655361;

    // Act
    xlsxRowHandler.characters(charArray, start, length);

    // Assert
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
