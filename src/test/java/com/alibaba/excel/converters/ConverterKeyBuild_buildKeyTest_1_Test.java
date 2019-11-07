package com.alibaba.excel.converters;

import com.alibaba.excel.converters.ConverterKeyBuild;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ConverterKeyBuild_buildKeyTest_1_Test {
  @Test
  public void buildKeyTest() throws Exception {
    // Arrange
    Class clazz = (Class) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConverterKeyBuild.buildKey(clazz);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
