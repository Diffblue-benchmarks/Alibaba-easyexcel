package com.alibaba.excel.constant;

import com.alibaba.excel.constant.ExcelXmlConstants;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExcelXmlConstantsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bbaca051d24e0692() {

    // Act, creating object to test constructor
    final ExcelXmlConstants actual = new ExcelXmlConstants();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
