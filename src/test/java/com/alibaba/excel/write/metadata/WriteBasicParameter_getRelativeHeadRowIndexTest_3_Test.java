package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteBasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteBasicParameter_getRelativeHeadRowIndexTest_3_Test {
  @Test
  public void getRelativeHeadRowIndexTest() throws Exception {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();

    // Act
    Integer actual = writeBasicParameter.getRelativeHeadRowIndex();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
