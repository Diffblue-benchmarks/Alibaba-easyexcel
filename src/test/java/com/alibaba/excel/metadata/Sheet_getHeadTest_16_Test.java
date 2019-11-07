package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getHeadTest_16_Test {
  @Test
  public void getHeadTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    List<List<String>> actual = sheet.getHead();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
