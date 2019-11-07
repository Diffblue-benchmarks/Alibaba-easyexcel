package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_getDataFormatStringTest_19_Test {
  @Test
  public void getDataFormatStringTest() throws Exception {
    // Arrange
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    String actual = cellData.getDataFormatString();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
