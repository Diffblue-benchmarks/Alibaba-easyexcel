package com.alibaba.excel.write.metadata;

import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_setWriteHandlerTest_8_Test {
  @Test
  public void setWriteHandlerTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();
    WriteHandler writeHandler = (WriteHandler) null;

    // Act
    writeWorkbook.setWriteHandler(writeHandler);

    // Assert
    Assert.assertEquals(null, writeHandler);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
