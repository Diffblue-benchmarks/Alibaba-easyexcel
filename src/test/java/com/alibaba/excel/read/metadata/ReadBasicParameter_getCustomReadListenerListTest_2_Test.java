package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadBasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadBasicParameter_getCustomReadListenerListTest_2_Test {
  @Test
  public void getCustomReadListenerListTest() throws Exception {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();

    // Act
    List<ReadListener> actual = readBasicParameter.getCustomReadListenerList();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
