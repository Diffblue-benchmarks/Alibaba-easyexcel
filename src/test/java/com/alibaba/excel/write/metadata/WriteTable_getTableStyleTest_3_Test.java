package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.metadata.WriteTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTable_getTableStyleTest_3_Test {
  @Test
  public void getTableStyleTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();

    // Act
    TableStyle actual = writeTable.getTableStyle();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
