package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_writerSheetTest_24_Test {
  @Test
  public void writerSheetTest() throws Exception {
    // Arrange and Act
    ExcelWriterSheetBuilder actual = EasyExcelFactory.writerSheet();

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
