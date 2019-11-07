package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.SstRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SstRecordHandler_initTest_3_Test {
  @Test
  public void initTest() throws Exception {
    // Arrange
    SstRecordHandler sstRecordHandler = new SstRecordHandler();

    // Act
    sstRecordHandler.init();

    // Assert
    int row = sstRecordHandler.getRow();
    String toStringResult = sstRecordHandler.toString();
    int column = sstRecordHandler.getColumn();
    int order = sstRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, sstRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
