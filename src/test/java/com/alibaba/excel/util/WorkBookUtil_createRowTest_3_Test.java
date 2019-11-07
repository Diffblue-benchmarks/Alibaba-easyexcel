package com.alibaba.excel.util;

import com.alibaba.excel.util.WorkBookUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WorkBookUtil_createRowTest_3_Test {
  @Test
  public void createRowTest() throws Exception {
    // Arrange
    HSSFSheet sheet = (HSSFSheet) null;
    int rowNum = 0;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    WorkBookUtil.createRow(sheet, rowNum);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
