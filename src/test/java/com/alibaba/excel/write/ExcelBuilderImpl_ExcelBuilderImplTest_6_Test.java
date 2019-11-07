package com.alibaba.excel.write;

import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelBuilderImpl_ExcelBuilderImplTest_6_Test {
  @Test
  public void ExcelBuilderImplTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(writeWorkbook);

    // Assert
    Assert.assertNotNull(excelBuilderImpl.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
