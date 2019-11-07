package com.alibaba.excel.metadata.property;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.lang.reflect.Field;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_ExcelContentPropertyTest_7_Test {
  @Test
  public void ExcelContentPropertyTest() throws Exception {
    // Arrange and Act
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Assert
    String toStringResult = excelContentProperty.toString();
    Field field = excelContentProperty.getField();
    Converter converter = excelContentProperty.getConverter();
    Head head = excelContentProperty.getHead();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, excelContentProperty.getDateTimeFormatProperty());
    Assert.assertEquals(null, head);
    Assert.assertEquals(null, converter);
    Assert.assertEquals(null, field);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
