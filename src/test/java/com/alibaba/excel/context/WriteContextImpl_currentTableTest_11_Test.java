package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WriteContextImpl_currentTableTest_11_Test {
  @Test
  public void currentTableTest() throws Exception {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
    WriteTable writeTable = new WriteTable();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    writeContextImpl.currentTable(writeTable);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
