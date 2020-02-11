package com.alibaba.excel.converters.date;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Test;

public class DateNumberConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new DateNumberConverter()).supportExcelTypeKey());
  }
}

