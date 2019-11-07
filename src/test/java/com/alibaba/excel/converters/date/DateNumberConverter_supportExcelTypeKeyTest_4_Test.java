package com.alibaba.excel.converters.date;

import com.alibaba.excel.converters.date.DateNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateNumberConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    DateNumberConverter dateNumberConverter = new DateNumberConverter();

    // Act
    CellDataTypeEnum actual = dateNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
