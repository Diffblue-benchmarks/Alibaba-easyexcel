package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_getClazzTest_8_Test {
  @Test
  public void getClazzTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());

    // Act
    Class actual = generateParam.getClazz();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
