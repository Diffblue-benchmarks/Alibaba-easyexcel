package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_writeTest_14_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    String pathName = "aaaaa";
    Class head = (Class) null;

    // Act
    ExcelWriterBuilder actual = EasyExcelFactory.write(pathName, head);

    // Assert
    ExcelWriterSheetBuilder sheetResult = actual.sheet();
    String toStringResult = actual.toString();
    String toStringResult1 = sheetResult.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull((sheetResult.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
