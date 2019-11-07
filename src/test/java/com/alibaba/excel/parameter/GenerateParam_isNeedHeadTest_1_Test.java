package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GenerateParam_isNeedHeadTest_1_Test {
  @Test
  public void isNeedHeadTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());

    // Act
    boolean actual = generateParam.isNeedHead();

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
