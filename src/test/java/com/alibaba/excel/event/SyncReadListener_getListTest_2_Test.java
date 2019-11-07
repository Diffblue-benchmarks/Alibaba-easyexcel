package com.alibaba.excel.event;

import com.alibaba.excel.event.SyncReadListener;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SyncReadListener_getListTest_2_Test {
  @Test
  public void getListTest() throws Exception {
    // Arrange
    SyncReadListener syncReadListener = new SyncReadListener();

    // Act
    List<Object> actual = syncReadListener.getList();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
