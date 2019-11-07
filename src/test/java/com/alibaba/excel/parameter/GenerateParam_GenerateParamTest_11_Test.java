package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_GenerateParamTest_11_Test {
  @Test
  public void GenerateParamTest() throws Exception {
    // Arrange
    String sheetName = "aaaaa";
    Class clazz = (Class) null;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    // Act
    GenerateParam generateParam = new GenerateParam(sheetName, clazz, outputStream);

    // Assert
    String toStringResult = generateParam.toString();
    boolean isNeedHeadResult = generateParam.isNeedHead();
    String sheetName1 = generateParam.getSheetName();
    OutputStream outputStream1 = generateParam.getOutputStream();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, generateParam.getType());
    Assert.assertTrue(outputStream1 instanceof ByteArrayOutputStream);
    Assert.assertEquals("aaaaa", sheetName1);
    String toStringResult1 = outputStream1.toString();
    Assert.assertTrue(isNeedHeadResult);
    Assert.assertEquals(0, ((ByteArrayOutputStream) outputStream1).size());
    Assert.assertEquals("", toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
