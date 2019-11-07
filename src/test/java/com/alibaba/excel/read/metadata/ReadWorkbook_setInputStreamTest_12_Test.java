package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_setInputStreamTest_12_Test {
  @Test
  public void setInputStreamTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0});

    // Act
    readWorkbook.setInputStream(byteArrayInputStream);

    // Assert
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
