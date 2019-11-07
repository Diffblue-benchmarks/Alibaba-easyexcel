package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_getOutputStreamTest_7_Test {
  @Test
  public void getOutputStreamTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());

    // Act
    OutputStream actual = generateParam.getOutputStream();

    // Assert
    Assert.assertTrue(actual instanceof ByteArrayOutputStream);
    String toStringResult = actual.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, ((ByteArrayOutputStream) actual).size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
