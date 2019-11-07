package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getOutputStreamTest_9_Test {
  @Test
  public void getOutputStreamTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    OutputStream actual = writeWorkbook.getOutputStream();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
