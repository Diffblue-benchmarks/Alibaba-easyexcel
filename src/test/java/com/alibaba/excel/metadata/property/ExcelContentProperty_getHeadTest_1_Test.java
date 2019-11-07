package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_getHeadTest_1_Test {
  @Test
  public void getHeadTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    Head actual = excelContentProperty.getHead();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
