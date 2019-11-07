package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_getColumnIndexTest_7_Test {
  @Test
  public void getColumnIndexTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));

    // Act
    Integer actual = head.getColumnIndex();

    // Assert
    Assert.assertEquals(Integer.valueOf(1), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
