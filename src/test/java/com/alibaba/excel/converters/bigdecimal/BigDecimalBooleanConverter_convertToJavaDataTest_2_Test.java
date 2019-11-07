package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalBooleanConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BigDecimalBooleanConverter_convertToJavaDataTest_2_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    BigDecimalBooleanConverter bigDecimalBooleanConverter = new BigDecimalBooleanConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    bigDecimalBooleanConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
