package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_writerTableTest_16_Test {
  @Test
  public void writerTableTest() throws Exception {
    // Arrange
    Integer tableNo = new Integer(0);

    // Act
    ExcelWriterTableBuilder actual = EasyExcelFactory.writerTable(tableNo);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
