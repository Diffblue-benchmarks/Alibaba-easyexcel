package com.alibaba.excel.event;

import com.alibaba.excel.event.SyncReadListener;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SyncReadListener_SyncReadListenerTest_1_Test {
  @Test
  public void SyncReadListenerTest() throws Exception {
    // Arrange and Act
    SyncReadListener syncReadListener = new SyncReadListener();

    // Assert
    String toStringResult = syncReadListener.toString();
    List<Object> list = syncReadListener.getList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(0, list.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
