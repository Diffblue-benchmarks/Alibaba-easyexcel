package com.alibaba.excel.read.metadata;

import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadBasicParameter;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadBasicParameter_setCustomReadListenerListTest_1_Test {
  @Test
  public void setCustomReadListenerListTest() throws Exception {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();
    ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    arrayList.add(new SyncReadListener());

    // Act
    readBasicParameter.setCustomReadListenerList(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    ReadListener getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof SyncReadListener);
    String toStringResult = ((SyncReadListener) getResult).toString();
    List<Object> list = ((SyncReadListener) getResult).getList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(list instanceof ArrayList);
    Assert.assertEquals(0, list.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
