package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_setNumberFormatPropertyTest_2_Test {
  @Test
  public void setNumberFormatPropertyTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    excelContentProperty.setNumberFormatProperty(numberFormatProperty);

    // Assert
    String toStringResult = numberFormatProperty.toString();
    String format = numberFormatProperty.getFormat();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(RoundingMode.UP, numberFormatProperty.getRoundingMode());
    Assert.assertEquals("aaaaa", format);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
