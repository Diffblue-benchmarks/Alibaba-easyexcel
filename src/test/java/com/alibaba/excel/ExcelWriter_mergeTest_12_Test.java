package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelWriter_mergeTest_12_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("aaaaa", null, new ByteArrayOutputStream()));
    int firstRow = 1;
    int lastRow = 1;
    int firstCol = 1;
    int lastCol = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    excelWriter.merge(firstRow, lastRow, firstCol, lastCol);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
