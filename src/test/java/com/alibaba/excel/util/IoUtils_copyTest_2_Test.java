package com.alibaba.excel.util;

import com.alibaba.excel.util.IoUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IoUtils_copyTest_2_Test {
  @Test
  public void copyTest() throws Exception {
    // Arrange
    ByteArrayInputStream input = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    // Act
    int actual = IoUtils.copy(input, output);

    // Assert
    Assert.assertEquals(24, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
