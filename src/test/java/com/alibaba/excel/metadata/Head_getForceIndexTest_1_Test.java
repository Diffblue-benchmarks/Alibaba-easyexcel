package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_getForceIndexTest_1_Test {
  @Test
  public void getForceIndexTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));

    // Act
    Boolean actual = head.getForceIndex();

    // Assert
    Assert.assertEquals(Boolean.valueOf(true), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
