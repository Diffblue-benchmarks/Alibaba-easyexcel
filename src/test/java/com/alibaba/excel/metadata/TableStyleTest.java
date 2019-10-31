package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TableStyleTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991a76d9e00d402dd7() {

    // Act, creating object to test constructor
    final TableStyle actual = new TableStyle();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableContentFont());
    Assert.assertNull(actual.getTableContentBackGroundColor());
    Assert.assertNull(actual.getTableHeadBackGroundColor());
    Assert.assertNull(actual.getTableHeadFont());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableContentBackGroundColorOutputVoid99983898b3a850a97d5() {

    // Arrange
    final TableStyle thisObj = new TableStyle();

    // Act
    final IndexedColors actual = thisObj.getTableContentBackGroundColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableContentFontOutputVoid999c4b107b3c335f196() {

    // Arrange
    final TableStyle thisObj = new TableStyle();

    // Act
    final Font actual = thisObj.getTableContentFont();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableHeadBackGroundColorOutputVoid999b5f4ef7c184b0cdf() {

    // Arrange
    final TableStyle thisObj = new TableStyle();

    // Act
    final IndexedColors actual = thisObj.getTableHeadBackGroundColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableHeadFontOutputVoid99956ef41e2944464f2() {

    // Arrange
    final TableStyle thisObj = new TableStyle();

    // Act
    final Font actual = thisObj.getTableHeadFont();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableContentBackGroundColorInputBlack1OutputVoid9993702f62924ebf34e() {

    // Arrange
    final TableStyle thisObj = new TableStyle();
    final IndexedColors arg0 = IndexedColors.BLACK1;

    // Act
    thisObj.setTableContentBackGroundColor(arg0);

    // Assert side effects
    Assert.assertEquals(IndexedColors.BLACK1, thisObj.getTableContentBackGroundColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableContentFontInputNotNullOutputVoid9998a68402ae515d9b8() {

    // Arrange
    final TableStyle thisObj = new TableStyle();
    final Font arg0 = new Font();

    // Act
    thisObj.setTableContentFont(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableContentFont());
    Assert.assertEquals((short) 0, thisObj.getTableContentFont().getFontHeightInPoints());
    Assert.assertFalse(thisObj.getTableContentFont().isBold());
    Assert.assertNull(thisObj.getTableContentFont().getFontName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableHeadBackGroundColorInputBlack1OutputVoid999e83aa2384f01d435() {

    // Arrange
    final TableStyle thisObj = new TableStyle();
    final IndexedColors arg0 = IndexedColors.BLACK1;

    // Act
    thisObj.setTableHeadBackGroundColor(arg0);

    // Assert side effects
    Assert.assertEquals(IndexedColors.BLACK1, thisObj.getTableHeadBackGroundColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableHeadFontInputNotNullOutputVoid9996b240c6e458fcd52() {

    // Arrange
    final TableStyle thisObj = new TableStyle();
    final Font arg0 = new Font();

    // Act
    thisObj.setTableHeadFont(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableHeadFont());
    Assert.assertEquals((short) 0, thisObj.getTableHeadFont().getFontHeightInPoints());
    Assert.assertFalse(thisObj.getTableHeadFont().isBold());
    Assert.assertNull(thisObj.getTableHeadFont().getFontName());

  }
}
