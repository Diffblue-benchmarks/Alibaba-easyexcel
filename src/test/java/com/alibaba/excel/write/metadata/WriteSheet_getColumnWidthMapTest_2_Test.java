package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteSheet;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_getColumnWidthMapTest_2_Test {
  @Test
  public void getColumnWidthMapTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    Map<Integer, Integer> actual = writeSheet.getColumnWidthMap();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
