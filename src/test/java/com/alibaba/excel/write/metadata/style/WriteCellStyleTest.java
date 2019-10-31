package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WriteCellStyleTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997157f239aa205be7() {

    // Act, creating object to test constructor
    final WriteCellStyle actual = new WriteCellStyle();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getBorderRight());
    Assert.assertNull(actual.getIndent());
    Assert.assertNull(actual.getHorizontalAlignment());
    Assert.assertNull(actual.getBorderLeft());
    Assert.assertNull(actual.getRightBorderColor());
    Assert.assertNull(actual.getHidden());
    Assert.assertNull(actual.getLeftBorderColor());
    Assert.assertNull(actual.getLocked());
    Assert.assertNull(actual.getRotation());
    Assert.assertNull(actual.getFillForegroundColor());
    Assert.assertNull(actual.getBorderBottom());
    Assert.assertNull(actual.getFillBackgroundColor());
    Assert.assertNull(actual.getQuotePrefix());
    Assert.assertNull(actual.getVerticalAlignment());
    Assert.assertNull(actual.getFillPatternType());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getBorderTop());
    Assert.assertNull(actual.getShrinkToFit());
    Assert.assertNull(actual.getBottomBorderColor());
    Assert.assertNull(actual.getTopBorderColor());
    Assert.assertNull(actual.getWrapped());
    Assert.assertNull(actual.getWriteFont());

  }

  // Test written by Diffblue Cover
  @Test
  public void getBorderBottomOutputVoid99999062b5b99fb1477() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final BorderStyle actual = thisObj.getBorderBottom();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBorderLeftOutputVoid999ae72ede7b5ede93a() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final BorderStyle actual = thisObj.getBorderLeft();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBorderRightOutputVoid9996c6d4ed5436588a5() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final BorderStyle actual = thisObj.getBorderRight();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBorderTopOutputVoid99916a2cce039a8b810() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final BorderStyle actual = thisObj.getBorderTop();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBottomBorderColorOutputVoid99930b233448268aa5b() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getBottomBorderColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataFormatOutputVoid9993edaa289f5fa2a99() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getDataFormat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFillBackgroundColorOutputVoid999d908ce53cb96b9ea() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getFillBackgroundColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFillForegroundColorOutputVoid9994b07d798af04cfcd() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getFillForegroundColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFillPatternTypeOutputVoid999d3d518643f8d6605() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final FillPatternType actual = thisObj.getFillPatternType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHiddenOutputVoid999dac2afce7766772b() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Boolean actual = thisObj.getHidden();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHorizontalAlignmentOutputVoid9996a91867760f0a6cb() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final HorizontalAlignment actual = thisObj.getHorizontalAlignment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndentOutputVoid9992cf03340a27450ff() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getIndent();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeftBorderColorOutputVoid999bccea248a0bc4b6b() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getLeftBorderColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLockedOutputVoid9991124937c67ba48b7() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Boolean actual = thisObj.getLocked();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getQuotePrefixOutputVoid9994773b4bdcb1986be() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Boolean actual = thisObj.getQuotePrefix();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRightBorderColorOutputVoid99973fd98b79cceaafa() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getRightBorderColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRotationOutputVoid999b737606fda7dc1e7() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getRotation();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getShrinkToFitOutputVoid9990a0736c2cf2eaccc() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Boolean actual = thisObj.getShrinkToFit();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTopBorderColorOutputVoid999cd1ccd920ad6031b() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Short actual = thisObj.getTopBorderColor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getVerticalAlignmentOutputVoid9991d8e948e958d5af4() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final VerticalAlignment actual = thisObj.getVerticalAlignment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWrappedOutputVoid999b2868f6a015ca17a() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final Boolean actual = thisObj.getWrapped();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriteFontOutputVoid999650b05483a6e12cd() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();

    // Act
    final WriteFont actual = thisObj.getWriteFont();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBorderBottomInputNoneOutputVoid99919cb68e6dcc36539() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final BorderStyle arg0 = BorderStyle.NONE;

    // Act
    thisObj.setBorderBottom(arg0);

    // Assert side effects
    Assert.assertEquals(BorderStyle.NONE, thisObj.getBorderBottom());

  }

  // Test written by Diffblue Cover
  @Test
  public void setBorderLeftInputNoneOutputVoid999867afb00688ff186() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final BorderStyle arg0 = BorderStyle.NONE;

    // Act
    thisObj.setBorderLeft(arg0);

    // Assert side effects
    Assert.assertEquals(BorderStyle.NONE, thisObj.getBorderLeft());

  }

  // Test written by Diffblue Cover
  @Test
  public void setBorderRightInputNoneOutputVoid9998da669b92f69b7ae() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final BorderStyle arg0 = BorderStyle.NONE;

    // Act
    thisObj.setBorderRight(arg0);

    // Assert side effects
    Assert.assertEquals(BorderStyle.NONE, thisObj.getBorderRight());

  }

  // Test written by Diffblue Cover
  @Test
  public void setBorderTopInputNoneOutputVoid999a0142888d1f22d5a() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final BorderStyle arg0 = BorderStyle.NONE;

    // Act
    thisObj.setBorderTop(arg0);

    // Assert side effects
    Assert.assertEquals(BorderStyle.NONE, thisObj.getBorderTop());

  }

  // Test written by Diffblue Cover
  @Test
  public void setBottomBorderColorInputNotNullOutputVoid999b10d76205155ccfb() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setBottomBorderColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getBottomBorderColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataFormatInputNotNullOutputVoid99980d68246f940ff24() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setDataFormat(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataFormat());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFillBackgroundColorInputNotNullOutputVoid999954c708c4a547616() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setFillBackgroundColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFillBackgroundColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFillForegroundColorInputNotNullOutputVoid9990fdfc8cc4adc9eae() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setFillForegroundColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFillForegroundColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFillPatternTypeInputNo_fillOutputVoid999b4c762f16a847b4c() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final FillPatternType arg0 = FillPatternType.NO_FILL;

    // Act
    thisObj.setFillPatternType(arg0);

    // Assert side effects
    Assert.assertEquals(FillPatternType.NO_FILL, thisObj.getFillPatternType());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHiddenInputNotNullOutputVoid999d8d55c1051b240d3() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setHidden(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHidden());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHorizontalAlignmentInputGeneralOutputVoid9999fa4ce7a68f246ce() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final HorizontalAlignment arg0 = HorizontalAlignment.GENERAL;

    // Act
    thisObj.setHorizontalAlignment(arg0);

    // Assert side effects
    Assert.assertEquals(HorizontalAlignment.GENERAL, thisObj.getHorizontalAlignment());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIndentInputNotNullOutputVoid9995502426fb0f5a7d3() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setIndent(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getIndent());

  }

  // Test written by Diffblue Cover
  @Test
  public void setLeftBorderColorInputNotNullOutputVoid9998f11c7ed22ad41be() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setLeftBorderColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getLeftBorderColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setLockedInputNotNullOutputVoid99972052d2d941d0a7e() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setLocked(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getLocked());

  }

  // Test written by Diffblue Cover
  @Test
  public void setQuotePrefixInputNotNullOutputVoid99953d1e9ecccc36433() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setQuotePrefix(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getQuotePrefix());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRightBorderColorInputNotNullOutputVoid99912602abdde5f8577() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setRightBorderColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getRightBorderColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRotationInputNotNullOutputVoid999696dc9560aedcf9d() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setRotation(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getRotation());

  }

  // Test written by Diffblue Cover
  @Test
  public void setShrinkToFitInputNotNullOutputVoid999f2604e213422e5b9() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setShrinkToFit(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getShrinkToFit());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTopBorderColorInputNotNullOutputVoid9991f5e4030ee6a9291() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Short arg0 = new Short((short) 1);

    // Act
    thisObj.setTopBorderColor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTopBorderColor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setVerticalAlignmentInputTopOutputVoid999380dd249f84c840c() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final VerticalAlignment arg0 = VerticalAlignment.TOP;

    // Act
    thisObj.setVerticalAlignment(arg0);

    // Assert side effects
    Assert.assertEquals(VerticalAlignment.TOP, thisObj.getVerticalAlignment());

  }

  // Test written by Diffblue Cover
  @Test
  public void setWrappedInputNotNullOutputVoid99961a04e68c5f697c6() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setWrapped(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getWrapped());

  }

  // Test written by Diffblue Cover
  @Test
  public void setWriteFontInputNotNullOutputVoid999a77ada5a7c437396() {

    // Arrange
    final WriteCellStyle thisObj = new WriteCellStyle();
    final WriteFont arg0 = new WriteFont();

    // Act
    thisObj.setWriteFont(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getWriteFont());
    Assert.assertNull(thisObj.getWriteFont().getItalic());
    Assert.assertNull(thisObj.getWriteFont().getStrikeout());
    Assert.assertNull(thisObj.getWriteFont().getColor());
    Assert.assertNull(thisObj.getWriteFont().getFontHeightInPoints());
    Assert.assertNull(thisObj.getWriteFont().getCharset());
    Assert.assertNull(thisObj.getWriteFont().getBold());
    Assert.assertNull(thisObj.getWriteFont().getTypeOffset());
    Assert.assertNull(thisObj.getWriteFont().getFontName());
    Assert.assertNull(thisObj.getWriteFont().getUnderline());

  }
}
