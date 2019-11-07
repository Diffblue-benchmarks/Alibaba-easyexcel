package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EasyExcelFactory_getWriterWithTempAndHandlerTest_26_Test {
  @Test
  public void getWriterWithTempAndHandlerTest() throws Exception {
    // Arrange
    ByteArrayInputStream temp = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ExcelTypeEnum typeEnum = ExcelTypeEnum.XLS;
    boolean needHead = true;
    WriteHandler handler = (WriteHandler) null;

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    EasyExcelFactory.getWriterWithTempAndHandler(temp, outputStream, typeEnum, needHead, handler);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
