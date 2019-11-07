package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getDefaultReturnMapTest_14_Test {
  @Test
  public void getDefaultReturnMapTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    Boolean actual = readWorkbook.getDefaultReturnMap();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
