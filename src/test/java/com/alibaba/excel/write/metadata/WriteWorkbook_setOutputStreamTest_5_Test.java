package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_setOutputStreamTest_5_Test {
  @Test
  public void setOutputStreamTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    writeWorkbook.setOutputStream(byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
