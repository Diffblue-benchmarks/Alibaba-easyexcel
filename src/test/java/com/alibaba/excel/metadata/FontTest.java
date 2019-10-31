package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FontTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991125a3c8e57d1f95() {

    // Act, creating object to test constructor
    final Font actual = new Font();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.getFontHeightInPoints());
    Assert.assertFalse(actual.isBold());
    Assert.assertNull(actual.getFontName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFontHeightInPointsOutputZero99903dc875440bcd149() {

    // Arrange
    final Font thisObj = new Font();

    // Act
    final short actual = thisObj.getFontHeightInPoints();

    // Assert result
    Assert.assertEquals((short) 0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFontNameOutputVoid999ace30b2d3db76562() {

    // Arrange
    final Font thisObj = new Font();

    // Act
    final String actual = thisObj.getFontName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isBoldOutputFalse9990cb1ae321e1ded97() {

    // Arrange
    final Font thisObj = new Font();

    // Act
    final boolean actual = thisObj.isBold();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setBoldInputTrueOutputVoid99929d2900708f1e56b() {

    // Arrange
    final Font thisObj = new Font();
    final boolean arg0 = true;

    // Act
    thisObj.setBold(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isBold());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFontHeightInPointsInputPositiveOutputVoid9993374538d9dac478c() {

    // Arrange
    final Font thisObj = new Font();
    final short arg0 = (short) 1;

    // Act
    thisObj.setFontHeightInPoints(arg0);

    // Assert side effects
    Assert.assertEquals((short) 1, thisObj.getFontHeightInPoints());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFontNameInputNotNullOutputVoid9999bf7fd8e31e306fc() {

    // Arrange
    final Font thisObj = new Font();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setFontName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getFontName());

  }
}
