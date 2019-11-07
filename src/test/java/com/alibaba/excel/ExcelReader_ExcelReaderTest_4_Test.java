package com.alibaba.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelCommonException;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReader_ExcelReaderTest_4_Test {
  @Test
  public void ExcelReaderTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    Object customContent = (Object) null;
    SyncReadListener eventListener = new SyncReadListener();

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    new ExcelReader(in, customContent, eventListener);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
