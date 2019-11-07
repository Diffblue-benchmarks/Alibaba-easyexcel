package com.alibaba.excel.util;

import com.alibaba.excel.util.CollectionUtils;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CollectionUtils_isEmptyTest_2_Test {
  @Test
  public void isEmptyTest() throws Exception {
    // Arrange
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    boolean actual = CollectionUtils.isEmpty(hashMap);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
