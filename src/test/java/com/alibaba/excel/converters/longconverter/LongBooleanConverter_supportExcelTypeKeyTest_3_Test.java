package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongBooleanConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    LongBooleanConverter longBooleanConverter = new LongBooleanConverter();

    // Act
    CellDataTypeEnum actual = longBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
