package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_getFieldTest_11_Test {
  @Test
  public void getFieldTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    Field actual = excelContentProperty.getField();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
