package com.alibaba.excel.util;

import com.alibaba.excel.util.CollectionUtils;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CollectionUtils_isEmptyTest_1_Test {
  @Test
  public void isEmptyTest() throws Exception {
    // Arrange
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");

    // Act
    boolean actual = CollectionUtils.isEmpty(arrayList);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
