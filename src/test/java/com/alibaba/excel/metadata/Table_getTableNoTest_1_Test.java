package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Table;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_getTableNoTest_1_Test {
  @Test
  public void getTableNoTest() throws Exception {
    // Arrange
    Table table = new Table(new Integer(1));

    // Act
    int actual = table.getTableNo();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
