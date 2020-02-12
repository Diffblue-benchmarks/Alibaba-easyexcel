package com.alibaba.excel.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class SyncReadListenerDiffblueTest {
  @Test(timeout=10000)
  public void setListTest() {
    // Arrange
    SyncReadListener syncReadListener = new SyncReadListener();

    // Act
    syncReadListener.setList(null);

    // Assert
    assertNull(syncReadListener.getList());
  }

  @Test(timeout=10000)
  public void getListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SyncReadListener()).getList().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<Object> list = (new SyncReadListener()).getList();
    assertTrue(list instanceof java.util.ArrayList);
    assertEquals(0, list.size());
  }
}

