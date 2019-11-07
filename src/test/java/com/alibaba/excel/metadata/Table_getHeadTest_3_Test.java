package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Table;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_getHeadTest_3_Test {
  @Test
  public void getHeadTest() throws Exception {
    // Arrange
    Table table = new Table(new Integer(1));

    // Act
    List<List<String>> actual = table.getHead();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
