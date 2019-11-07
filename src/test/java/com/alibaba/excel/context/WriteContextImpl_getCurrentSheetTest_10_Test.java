package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WriteContextImpl_getCurrentSheetTest_10_Test {
  @Test
  public void getCurrentSheetTest() throws Exception {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    writeContextImpl.getCurrentSheet();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
