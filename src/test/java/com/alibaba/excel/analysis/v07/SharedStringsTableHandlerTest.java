package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.SharedStringsTableHandler;
import com.alibaba.excel.cache.ReadCache;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SharedStringsTableHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void charactersInput8ZeroZeroOutputVoid9992f4f379f839786f7() {

    // Arrange
    final SharedStringsTableHandler thisObj = new SharedStringsTableHandler(null);
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thisObj.characters(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999303807693d65df64() {

    // Arrange
    final ReadCache arg0 = null;

    // Act, creating object to test constructor
    final SharedStringsTableHandler actual = new SharedStringsTableHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void endElementInputNotNullNotNullNotNullOutputVoid99999814cc0ef91ea3b() {

    // Arrange
    final SharedStringsTableHandler thisObj = new SharedStringsTableHandler(null);
    final String arg0 = "rPh";
    final String arg1 = "rPh";
    final String arg2 = "rPh";

    // Act
    thisObj.endElement(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startElementInputNotNullNotNullNotNullNotNullOutputVoid999c325d6e353353bac() {

    // Arrange
    final SharedStringsTableHandler thisObj = new SharedStringsTableHandler(null);
    final String arg0 = "rPh";
    final String arg1 = "rPh";
    final String arg2 = "rPh";
    final AttributesHolder arg3 = new AttributesHolder();

    // Act
    thisObj.startElement(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
