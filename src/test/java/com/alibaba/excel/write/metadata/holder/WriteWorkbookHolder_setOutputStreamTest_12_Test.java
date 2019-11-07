package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setOutputStreamTest_12_Test {
  @Test
  public void setOutputStreamTest() throws Exception {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    writeWorkbookHolder.setOutputStream(byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
