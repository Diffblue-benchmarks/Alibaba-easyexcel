package com.alibaba.excel.converters.bigdecimal;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Test;

public class BigDecimalStringConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new BigDecimalStringConverter()).supportExcelTypeKey());
  }
}

