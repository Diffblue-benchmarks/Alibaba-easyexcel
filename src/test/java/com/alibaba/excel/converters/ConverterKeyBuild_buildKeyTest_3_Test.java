package com.alibaba.excel.converters;

import com.alibaba.excel.converters.ConverterKeyBuild;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ConverterKeyBuild_buildKeyTest_3_Test {
  @Test
  public void buildKeyTest() throws Exception {
    // Arrange
    Class clazz = (Class) null;
    CellDataTypeEnum cellDataTypeEnum = CellDataTypeEnum.STRING;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConverterKeyBuild.buildKey(clazz, cellDataTypeEnum);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
