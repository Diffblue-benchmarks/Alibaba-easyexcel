package com.alibaba.excel.event;

import com.alibaba.excel.event.SyncReadListener;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SyncReadListener_setListTest_5_Test {
  @Test
  public void setListTest() throws Exception {
    // Arrange
    SyncReadListener syncReadListener = new SyncReadListener();
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");

    // Act
    syncReadListener.setList(arrayList);

    // Assert
    String toStringResult = syncReadListener.toString();
    List<Object> list = syncReadListener.getList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(list instanceof ArrayList);
    Assert.assertEquals(1, list.size());
    Object getResult = list.get(0);
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", getResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
