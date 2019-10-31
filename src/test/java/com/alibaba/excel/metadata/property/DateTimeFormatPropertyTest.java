package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DateTimeFormatPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildInputNullOutputVoid9996afdd8a7203a8b99() {

    // Arrange
    final DateTimeFormat arg0 = null;

    // Act
    final DateTimeFormatProperty actual = DateTimeFormatProperty.build(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999f9b1c356899eb8cb() {

    // Arrange
    final String arg0 = "aaaaa";
    final Boolean arg1 = new Boolean(true);

    // Act, creating object to test constructor
    final DateTimeFormatProperty actual = new DateTimeFormatProperty(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getFormat());
    Assert.assertNotNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFormatOutputNotNull999b62db8bbddaa2931() {

    // Arrange
    final Boolean boolean1 = new Boolean(true);
    final DateTimeFormatProperty thisObj = new DateTimeFormatProperty("aaaaa", boolean1);

    // Act
    final String actual = thisObj.getFormat();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUse1904windowingOutputNotNull999a531f7b66e93b5a3() {

    // Arrange
    final Boolean boolean1 = new Boolean(true);
    final DateTimeFormatProperty thisObj = new DateTimeFormatProperty("aaaaa", boolean1);

    // Act
    final Boolean actual = thisObj.getUse1904windowing();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFormatInputNotNullOutputVoid999f1333c057d38800e() {

    // Arrange
    final Boolean boolean1 = new Boolean(true);
    final DateTimeFormatProperty thisObj = new DateTimeFormatProperty("aaaaa", boolean1);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setFormat(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setUse1904windowingInputNotNullOutputVoid999ba71644016d1a460() {

    // Arrange
    final Boolean boolean1 = new Boolean(true);
    final DateTimeFormatProperty thisObj = new DateTimeFormatProperty("aaaaa", boolean1);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setUse1904windowing(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
