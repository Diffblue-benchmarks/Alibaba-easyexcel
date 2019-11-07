package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteContextImpl_getOutputStreamTest_4_Test {
  @Test
  public void getOutputStreamTest() throws Exception {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());

    // Act
    OutputStream actual = writeContextImpl.getOutputStream();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
