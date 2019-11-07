package com.alibaba.excel.support;

import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelTypeEnum_getValueTest_3_Test {
  @Test
  public void getValueTest() throws Exception {
    // Arrange
    ExcelTypeEnum excelTypeEnum = ExcelTypeEnum.XLS;

    // Act
    String actual = excelTypeEnum.getValue();

    // Assert
    Assert.assertEquals(".xls", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
