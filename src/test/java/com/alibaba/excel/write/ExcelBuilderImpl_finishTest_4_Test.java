package com.alibaba.excel.write;

import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelBuilderImpl_finishTest_4_Test {
  @Test
  public void finishTest() throws Exception {
    // Arrange
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(new WriteWorkbook());

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    excelBuilderImpl.finish();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
