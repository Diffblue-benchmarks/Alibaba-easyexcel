package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_setColumnWidthMapTest_18_Test {
  @Test
  public void setColumnWidthMapTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Integer integer = new Integer(0);
    hashMap.put(integer, new Integer(0));

    // Act
    sheet.setColumnWidthMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals(Integer.valueOf(0), hashMap.get(Integer.valueOf(0)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
