package com.alibaba.excel.util;

import com.alibaba.excel.util.IoUtils;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IoUtils_toByteArrayTest_1_Test {
  @Test
  public void toByteArrayTest() throws Exception {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    int size = 0;

    // Act
    byte[] actual = IoUtils.toByteArray(input, size);

    // Assert
    Assert.assertEquals(0, actual.length);
    Assert.assertArrayEquals(new byte[]{}, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
