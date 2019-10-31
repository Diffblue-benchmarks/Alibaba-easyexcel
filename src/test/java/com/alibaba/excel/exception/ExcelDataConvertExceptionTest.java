package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelDataConvertException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExcelDataConvertExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999c124859141481d43() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final ExcelDataConvertException actual = new ExcelDataConvertException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9997fd22e3b120e7fc0() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ExcelDataConvertException actual = new ExcelDataConvertException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999eadd6e393bb859de() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final ExcelDataConvertException actual = new ExcelDataConvertException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
