package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadBasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadBasicParameter_getHeadRowNumberTest_3_Test {
  @Test
  public void getHeadRowNumberTest() throws Exception {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();

    // Act
    Integer actual = readBasicParameter.getHeadRowNumber();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
