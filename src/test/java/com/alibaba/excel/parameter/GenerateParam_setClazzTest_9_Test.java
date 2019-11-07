package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_setClazzTest_9_Test {
  @Test
  public void setClazzTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());
    Class resultClass = (Class) null;

    // Act
    generateParam.setClazz(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
