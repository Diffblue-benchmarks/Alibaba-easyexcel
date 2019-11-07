package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setTemplateInputStreamTest_5_Test {
  @Test
  public void setTemplateInputStreamTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8});

    // Act
    writeWorkbookHolder.setTemplateInputStream(byteArrayInputStream);

    // Assert
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(24, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
