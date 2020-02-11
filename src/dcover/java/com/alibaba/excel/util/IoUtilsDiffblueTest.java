package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Test;

public class IoUtilsDiffblueTest {
  @Test(timeout=10000)
  public void toByteArrayTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    byte[] actualToByteArrayResult = IoUtils.toByteArray(new ByteArrayInputStream(byteArray));

    // Assert
    assertEquals(24, actualToByteArrayResult.length);
    assertEquals((byte) 1, actualToByteArrayResult[0]);
    assertEquals((byte) 1, actualToByteArrayResult[1]);
    assertEquals((byte) 1, actualToByteArrayResult[2]);
    assertEquals((byte) 1, actualToByteArrayResult[3]);
    assertEquals((byte) 1, actualToByteArrayResult[4]);
    assertEquals((byte) 1, actualToByteArrayResult[5]);
    assertEquals((byte) 1, actualToByteArrayResult[18]);
    assertEquals((byte) 1, actualToByteArrayResult[19]);
    assertEquals((byte) 1, actualToByteArrayResult[20]);
    assertEquals((byte) 1, actualToByteArrayResult[21]);
    assertEquals((byte) 1, actualToByteArrayResult[22]);
    assertEquals((byte) 1, actualToByteArrayResult[23]);
  }

  @Test(timeout=10000)
  public void toByteArrayTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, IoUtils.toByteArray(new ByteArrayInputStream(byteArray), 3).length);
  }
}

