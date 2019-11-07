package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_getHeadNameListTest_6_Test {
  @Test
  public void getHeadNameListTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));

    // Act
    List<String> actual = head.getHeadNameList();

    // Assert
    Assert.assertTrue(actual instanceof ArrayList);
    Assert.assertEquals(1, actual.size());
    Assert.assertEquals("aaaaa", actual.get(0));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
