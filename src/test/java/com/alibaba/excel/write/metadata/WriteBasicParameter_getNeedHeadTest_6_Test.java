package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteBasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteBasicParameter_getNeedHeadTest_6_Test {
  @Test
  public void getNeedHeadTest() throws Exception {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    Boolean actual = writeBasicParameter.getNeedHead();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
