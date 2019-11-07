package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.metadata.Sheet;
import java.io.ByteArrayInputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readBySaxTest_34_Test {
  @Test
  public void readBySaxTest() throws Exception {
    // Arrange
    ByteArrayInputStream in = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    Sheet sheet = (Sheet) null;
    SyncReadListener listener = new SyncReadListener();

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.readBySax(in, sheet, listener);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
