package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_setTemplateInputStreamTest_1_Test {
  @Test
  public void setTemplateInputStreamTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0});

    // Act
    writeWorkbook.setTemplateInputStream(byteArrayInputStream);

    // Assert
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
