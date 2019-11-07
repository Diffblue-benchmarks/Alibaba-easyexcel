package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_setHeadNameListTest_10_Test {
  @Test
  public void setHeadNameListTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");

    // Act
    head.setHeadNameList(arrayList1);

    // Assert
    Assert.assertEquals(1, arrayList1.size());
    Assert.assertEquals("aaaaa", arrayList1.get(0));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
