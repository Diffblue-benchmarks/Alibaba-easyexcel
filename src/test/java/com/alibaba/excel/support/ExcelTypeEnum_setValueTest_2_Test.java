package com.alibaba.excel.support;

import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelTypeEnum_setValueTest_2_Test {
  @Test
  public void setValueTest() throws Exception {
    // Arrange
    ExcelTypeEnum excelTypeEnum = ExcelTypeEnum.XLS;
    String value = ".xls";

    // Act
    excelTypeEnum.setValue(value);

    // Assert
    Assert.assertEquals(ExcelTypeEnum.XLS, excelTypeEnum);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
