package com.alibaba.excel.converters;

import com.alibaba.excel.converters.ConverterKeyBuild;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConverterKeyBuildTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void buildKeyInputNullStringOutputNullPointerException999b30cf0e73729c581() {

    // Arrange
    final Class arg0 = null;
    final CellDataTypeEnum arg1 = CellDataTypeEnum.STRING;

    // Act
    thrown.expect(NullPointerException.class);
    ConverterKeyBuild.buildKey(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void buildKeyInputNullOutputNullPointerException999b798ffbe5ca26086() {

    // Arrange
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ConverterKeyBuild.buildKey(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991f50b75a1b946661() {

    // Act, creating object to test constructor
    final ConverterKeyBuild actual = new ConverterKeyBuild();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
