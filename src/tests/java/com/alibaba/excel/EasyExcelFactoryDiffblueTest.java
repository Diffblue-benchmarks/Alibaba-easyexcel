package com.alibaba.excel;

import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EasyExcelFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void readTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream in = new ByteArrayInputStream(byteArray);

    // Act and Assert
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.read(in, new Sheet(1));
  }
  @Test(timeout=10000)
  public void getWriterWithTempTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    EasyExcelFactory.getWriterWithTemp(new ByteArrayInputStream(byteArray), null, ExcelTypeEnum.XLS, true);
  }
}

