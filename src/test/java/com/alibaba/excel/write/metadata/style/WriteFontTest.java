package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WriteFontTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99915389dcb81d0a3c7() {

    // Act, creating object to test constructor
    final WriteFont actual = new WriteFont();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getItalic());
    Assert.assertNull(actual.getStrikeout());
    Assert.assertNull(actual.getColor());
    Assert.assertNull(actual.getFontHeightInPoints());
    Assert.assertNull(actual.getCharset());
    Assert.assertNull(actual.getBold());
    Assert.assertNull(actual.getTypeOffset());
    Assert.assertNull(actual.getFontName());
    Assert.assertNull(actual.getUnderline());

  }

  // Test written by Diffblue Cover
  @Test
  public void getBoldOutputVoid999318e330da6f05bc7() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Boolean actual = thisObj.getBold();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetOutputVoid999d29df12b33b266f4() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Integer actual = thisObj.getCharset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getColorOutputVoid999018eef61224be3ee() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Short actual = thisObj.getColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFontHeightInPointsOutputVoid9993c1feaca934b7f4b() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Short actual = thisObj.getFontHeightInPoints();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFontNameOutputVoid9997c2d00eda4e799e9() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final String actual = thisObj.getFontName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getItalicOutputVoid999137ce42f77729627() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Boolean actual = thisObj.getItalic();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStrikeoutOutputVoid999029a29c5d1c497f8() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Boolean actual = thisObj.getStrikeout();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOffsetOutputVoid99908cef000d562715d() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Short actual = thisObj.getTypeOffset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnderlineOutputVoid999935708c1475a8786() {

    // Arrange
    final WriteFont thisObj = new WriteFont();

    // Act
    final Byte actual = thisObj.getUnderline();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBoldInputNotNullOutputVoid99900bf0e2af642d264() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setBold(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getBold());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetInputNotNullOutputVoid999cac2713eac145fb3() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setCharset(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCharset());

  }

  // Test written by Diffblue Cover
  @Test
  public void setColorInputNotNullOutputVoid999e2567255b4384cb9() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFontHeightInPointsInputNotNullOutputVoid999618805ed96a528f2() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setFontHeightInPoints(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFontHeightInPoints());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFontNameInputNotNullOutputVoid999b9baf64b021c8d82() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setFontName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getFontName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setItalicInputNotNullOutputVoid9997a868bb742a2bc98() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setItalic(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getItalic());

  }

  // Test written by Diffblue Cover
  @Test
  public void setStrikeoutInputNotNullOutputVoid999034aa64ecae95ae4() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setStrikeout(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getStrikeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeOffsetInputNotNullOutputVoid999529a4a91008500ed() {

    // Arrange
    final WriteFont thisObj = new WriteFont();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setTypeOffset(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTypeOffset());

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void setUnderlineInputNotNullOutputVoid9996b7333991330b4b7() {
//
//    // Arrange
//    final WriteFont thisObj = new WriteFont();
//    final Byte arg0 = new Byte((short) 0);
//
//    // Act
//    thisObj.setUnderline(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getUnderline());
//
//  }
}
