package com.alibaba.excel.support;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;

public class ExcelTypeEnumDiffblueTest {
  @Test(timeout=10000)
  public void valueOfTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(ExcelTypeEnum.XLS,
        ExcelTypeEnum.valueOf(null, new ByteArrayInputStream(byteArray), ExcelTypeEnum.XLS));
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals(".xls", ExcelTypeEnum.XLS.getValue());
  }
}

