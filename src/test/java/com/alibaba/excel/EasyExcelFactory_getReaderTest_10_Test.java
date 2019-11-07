package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelCommonException;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EasyExcelFactory_getReaderTest_10_Test {
  @Test
  public void getReaderTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    SyncReadListener listener = new SyncReadListener();

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.getReader(in, listener);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
