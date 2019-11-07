package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTable_getTableNoTest_4_Test {
  @Test
  public void getTableNoTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act
    Integer actual = writeTable.getTableNo();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
