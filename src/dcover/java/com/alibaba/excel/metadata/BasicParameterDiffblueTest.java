package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Test;

public class BasicParameterDiffblueTest {
  @Test(timeout=10000)
  public void setClazzTest() {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    basicParameter.setClazz(null);

    // Assert
    assertNull(basicParameter.getClazz());
  }

  @Test(timeout=10000)
  public void setCustomConverterListTest() {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    basicParameter.setCustomConverterList(null);

    // Assert
    assertNull(basicParameter.getCustomConverterList());
  }

  @Test(timeout=10000)
  public void getCustomConverterListTest() {
    // Arrange, Act and Assert
    assertNull((new BasicParameter()).getCustomConverterList());
  }

  @Test(timeout=10000)
  public void setAutoTrimTest() {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    basicParameter.setAutoTrim(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), basicParameter.getAutoTrim());
  }

  @Test(timeout=10000)
  public void getUse1904windowingTest() {
    // Arrange, Act and Assert
    assertNull((new BasicParameter()).getUse1904windowing());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BasicParameter actualBasicParameter = new BasicParameter();

    // Assert
    Class actualClazz = actualBasicParameter.getClazz();
    List<List<String>> actualHead = actualBasicParameter.getHead();
    Boolean actualAutoTrim = actualBasicParameter.getAutoTrim();
    Boolean actualUse1904windowing = actualBasicParameter.getUse1904windowing();
    assertNull(actualClazz);
    assertNull(actualBasicParameter.getCustomConverterList());
    assertNull(actualUse1904windowing);
    assertNull(actualAutoTrim);
    assertNull(actualHead);
  }

  @Test(timeout=10000)
  public void setHeadTest() {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    basicParameter.setHead(null);

    // Assert
    assertNull(basicParameter.getHead());
  }

  @Test(timeout=10000)
  public void getAutoTrimTest() {
    // Arrange, Act and Assert
    assertNull((new BasicParameter()).getAutoTrim());
  }

  @Test(timeout=10000)
  public void getHeadTest() {
    // Arrange, Act and Assert
    assertNull((new BasicParameter()).getHead());
  }

  @Test(timeout=10000)
  public void setUse1904windowingTest() {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    basicParameter.setUse1904windowing(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), basicParameter.getUse1904windowing());
  }

  @Test(timeout=10000)
  public void getClazzTest() {
    // Arrange, Act and Assert
    assertNull((new BasicParameter()).getClazz());
  }
}

