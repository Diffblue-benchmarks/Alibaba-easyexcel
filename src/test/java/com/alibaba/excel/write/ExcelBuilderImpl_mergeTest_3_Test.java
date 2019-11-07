package com.alibaba.excel.write;

import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelBuilderImpl_mergeTest_3_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(new WriteWorkbook());
    int firstRow = 0;
    int lastRow = 0;
    int firstCol = 0;
    int lastCol = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    excelBuilderImpl.merge(firstRow, lastRow, firstCol, lastCol);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
