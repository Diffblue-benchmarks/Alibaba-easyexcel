package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.math.RoundingMode;



public class NumberFormatPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildInputNullOutputVoid9999792e2608ac51b07() {

    // Arrange
    final NumberFormat arg0 = null;

    // Act
    final NumberFormatProperty actual = NumberFormatProperty.build(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullUpOutputNotNull9998b3863e4987554b8() {

    // Arrange
    final String arg0 = "aaaaa";
    final RoundingMode arg1 = RoundingMode.UP;

    // Act, creating object to test constructor
    final NumberFormatProperty actual = new NumberFormatProperty(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getFormat());
    Assert.assertEquals(RoundingMode.UP, actual.getRoundingMode());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFormatOutputNotNull9999e5c184e18f7730c() {

    // Arrange
    final NumberFormatProperty thisObj = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    final String actual = thisObj.getFormat();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRoundingModeOutputUp999700b8b1849dcdacd() {

    // Arrange
    final NumberFormatProperty thisObj = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    final RoundingMode actual = thisObj.getRoundingMode();

    // Assert result
    Assert.assertEquals(RoundingMode.UP, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFormatInputNotNullOutputVoid99963baad6c8960dac1() {

    // Arrange
    final NumberFormatProperty thisObj = new NumberFormatProperty("aaaaa", RoundingMode.UP);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setFormat(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRoundingModeInputUpOutputVoid9995bd1cb06a97cb7a2() {

    // Arrange
    final NumberFormatProperty thisObj = new NumberFormatProperty("aaaaa", RoundingMode.UP);
    final RoundingMode arg0 = RoundingMode.UP;

    // Act
    thisObj.setRoundingMode(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
