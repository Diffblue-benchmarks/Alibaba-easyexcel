package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_setNeedHeadTest_3_Test {
  @Test
  public void setNeedHeadTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());
    boolean needHead = true;

    // Act
    generateParam.setNeedHead(needHead);

    // Assert
    Class clazz = generateParam.getClazz();
    String toStringResult = generateParam.toString();
    boolean isNeedHeadResult = generateParam.isNeedHead();
    String sheetName = generateParam.getSheetName();
    OutputStream outputStream = generateParam.getOutputStream();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, generateParam.getType());
    Assert.assertTrue(outputStream instanceof ByteArrayOutputStream);
    Assert.assertEquals("aaaaa", sheetName);
    String toStringResult1 = outputStream.toString();
    Assert.assertTrue(isNeedHeadResult);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", toStringResult1);
    Assert.assertEquals(0, ((ByteArrayOutputStream) outputStream).size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
