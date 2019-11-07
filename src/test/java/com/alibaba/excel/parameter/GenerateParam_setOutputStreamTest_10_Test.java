package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_setOutputStreamTest_10_Test {
  @Test
  public void setOutputStreamTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    generateParam.setOutputStream(byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
