package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_getHeadTest_2_Test {
  @Test
  public void getHeadTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    List<List<String>> actual = basicParameter.getHead();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
