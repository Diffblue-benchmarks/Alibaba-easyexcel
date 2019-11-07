package com.alibaba.excel.util;

import com.alibaba.excel.util.WorkBookUtil;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class WorkBookUtil_createCellTest_1_Test {
  @Test
  public void createCellTest() throws Exception {
    // Arrange
    HSSFRow row = (HSSFRow) null;
    int colNum = 0;
    HSSFCellStyle cellStyle = (HSSFCellStyle) null;
    String cellValue = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    WorkBookUtil.createCell(row, colNum, cellStyle, cellValue);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
