package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.metadata.Sheet;
import java.io.ByteArrayInputStream;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readTest_1_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    Sheet sheet = (Sheet) null;

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.read(in, sheet);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
