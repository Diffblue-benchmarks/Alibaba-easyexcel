package com.alibaba.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReader_ExcelReaderTest_2_Test {
  @Test
  public void ExcelReaderTest() throws Exception {
    // Arrange
    AnalysisParam param = new AnalysisParam(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}),
        ExcelTypeEnum.XLS, "Can not use a finished reader.");
    SyncReadListener eventListener = new SyncReadListener();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ExcelReader(param, eventListener);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
