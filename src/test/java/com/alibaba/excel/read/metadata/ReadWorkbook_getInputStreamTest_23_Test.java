package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getInputStreamTest_23_Test {
  @Test
  public void getInputStreamTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    InputStream actual = readWorkbook.getInputStream();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
