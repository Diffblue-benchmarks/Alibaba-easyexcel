package com.alibaba.excel;

import com.alibaba.excel.EasyExcel;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class EasyExcelTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ea52f1ac8182cdba() {

    // Act, creating object to test constructor
    final EasyExcel actual = new EasyExcel();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
