package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getMandatoryUseInputStreamTest_13_Test {
  @Test
  public void getMandatoryUseInputStreamTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    Boolean actual = readWorkbook.getMandatoryUseInputStream();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
