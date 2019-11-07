package com.alibaba.excel.write.metadata;

import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getWriteHandlerTest_12_Test {
  @Test
  public void getWriteHandlerTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    WriteHandler actual = writeWorkbook.getWriteHandler();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
