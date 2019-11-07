package com.alibaba.excel.converters.inputstream;

import com.alibaba.excel.converters.inputstream.InputStreamImageConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InputStreamImageConverter_InputStreamImageConverterTest_5_Test {
  @Test
  public void InputStreamImageConverterTest() throws Exception {
    // Arrange and Act
    InputStreamImageConverter inputStreamImageConverter = new InputStreamImageConverter();

    // Assert
    Assert.assertNotNull(inputStreamImageConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
