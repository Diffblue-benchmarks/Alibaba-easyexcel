package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_getTableStyleTest_5_Test {
  @Test
  public void getTableStyleTest() throws Exception {
    // Arrange
    Table table = new Table(new Integer(1));

    // Act
    TableStyle actual = table.getTableStyle();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
