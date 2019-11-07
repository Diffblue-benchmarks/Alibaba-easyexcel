package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_getWriterTest_28_Test {
  @Test
  public void getWriterTest() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ExcelTypeEnum typeEnum = ExcelTypeEnum.XLS;
    boolean needHead = true;

    // Act
    EasyExcelFactory.getWriter(byteArrayOutputStream, typeEnum, needHead);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
