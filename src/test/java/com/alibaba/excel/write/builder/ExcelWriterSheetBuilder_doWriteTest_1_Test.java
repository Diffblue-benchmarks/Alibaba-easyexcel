package com.alibaba.excel.write.builder;

import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_doWriteTest_1_Test {
  @Test
  public void doWriteTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Must use 'EasyExcelFactory.write().sheet()' to call this method");

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    excelWriterSheetBuilder.doWrite(arrayList);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
