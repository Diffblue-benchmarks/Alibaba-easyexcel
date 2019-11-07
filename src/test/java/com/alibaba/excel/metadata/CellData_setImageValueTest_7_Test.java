package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_setImageValueTest_7_Test {
  @Test
  public void setImageValueTest() throws Exception {
    // Arrange
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    cellData.setImageValue(byteArray);

    // Assert
    Assert.assertEquals(21, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[15]);
    Assert.assertEquals((byte) 0, byteArray[16]);
    Assert.assertEquals((byte) 0, byteArray[17]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
