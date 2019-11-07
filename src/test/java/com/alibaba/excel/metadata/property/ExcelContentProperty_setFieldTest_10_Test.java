package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_setFieldTest_10_Test {
  @Test
  public void setFieldTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    Field field = (Field) null;

    // Act
    excelContentProperty.setField(field);

    // Assert
    Assert.assertEquals(null, field);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
