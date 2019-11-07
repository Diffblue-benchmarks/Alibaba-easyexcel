package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellData;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_setNumberValueTest_6_Test {
  @Test
  public void setNumberValueTest() throws Exception {
    // Arrange
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    BigDecimal bigDecimal = (BigDecimal) null;

    // Act
    cellData.setNumberValue(bigDecimal);

    // Assert
    Assert.assertEquals(null, bigDecimal);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
