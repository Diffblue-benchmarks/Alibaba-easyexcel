package com.alibaba.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReader_ExcelReaderTest_1_Test {
  @Test
  public void ExcelReaderTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    ExcelTypeEnum excelTypeEnum = ExcelTypeEnum.XLS;
    String customContent = "Can not use a finished reader.";
    SyncReadListener eventListener = new SyncReadListener();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ExcelReader(in, excelTypeEnum, customContent, eventListener);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
