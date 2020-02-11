package com.alibaba.excel.write;

import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcelBuilderImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void fillTest() {
    // Arrange
    ExcelBuilderImpl excelBuilderImpl = new ExcelBuilderImpl(new WriteWorkbook());
    FillConfig fillConfig = new FillConfig();

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    excelBuilderImpl.fill("foo", fillConfig, new WriteSheet());
  }
}

