package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_writerTableTest_21_Test {
  @Test
  public void writerTableTest() throws Exception {
    // Arrange and Act
    ExcelWriterTableBuilder actual = EasyExcelFactory.writerTable();

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
