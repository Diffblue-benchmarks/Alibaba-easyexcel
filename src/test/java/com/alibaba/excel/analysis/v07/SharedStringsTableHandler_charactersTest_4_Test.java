package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.SharedStringsTableHandler;
import com.alibaba.excel.cache.Ehcache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SharedStringsTableHandler_charactersTest_4_Test {
  @Test
  public void charactersTest() throws Exception {
    // Arrange
    SharedStringsTableHandler sharedStringsTableHandler = new SharedStringsTableHandler(null);
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
    int start = 0;
    int length = 0;

    // Act
    sharedStringsTableHandler.characters(charArray, start, length);

    // Assert
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
