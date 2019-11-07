package com.alibaba.excel.converters;

import com.alibaba.excel.converters.ConverterKeyBuild;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConverterKeyBuild_ConverterKeyBuildTest_2_Test {
  @Test
  public void ConverterKeyBuildTest() throws Exception {
    // Arrange and Act
    ConverterKeyBuild converterKeyBuild = new ConverterKeyBuild();

    // Assert
    Assert.assertNotNull(converterKeyBuild.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
