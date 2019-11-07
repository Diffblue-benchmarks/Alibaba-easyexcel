package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelWriter_ExcelWriterTest_17_Test {
  @Test
  public void ExcelWriterTest() throws Exception {
    // Arrange
    ByteArrayInputStream templateInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ExcelTypeEnum typeEnum = ExcelTypeEnum.XLS;
    Boolean needHead = new Boolean(true);

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    new ExcelWriter(templateInputStream, outputStream, typeEnum, needHead);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
