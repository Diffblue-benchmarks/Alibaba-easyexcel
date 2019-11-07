package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WriteContextImpl_finishTest_12_Test {
  @Test
  public void finishTest() throws Exception {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    writeContextImpl.finish();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
