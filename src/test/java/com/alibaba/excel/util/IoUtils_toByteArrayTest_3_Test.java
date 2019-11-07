package com.alibaba.excel.util;

import com.alibaba.excel.util.IoUtils;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IoUtils_toByteArrayTest_3_Test {
  @Test
  public void toByteArrayTest() throws Exception {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    byte[] actual = IoUtils.toByteArray(input);

    // Assert
    Assert.assertEquals(24, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[18]);
    Assert.assertEquals((byte) 0, actual[19]);
    Assert.assertEquals((byte) 0, actual[20]);
    Assert.assertEquals((byte) 0, actual[21]);
    Assert.assertEquals((byte) 0, actual[22]);
    Assert.assertEquals((byte) 0, actual[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
