package com.alibaba.excel.support;

import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.File;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelTypeEnum_valueOfTest_1_Test {
  @Test
  public void valueOfTest() throws Exception {
    // Arrange
    File file = new File(".xls");
    ByteArrayInputStream inputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0});

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    ExcelTypeEnum.valueOf(file, inputStream);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
