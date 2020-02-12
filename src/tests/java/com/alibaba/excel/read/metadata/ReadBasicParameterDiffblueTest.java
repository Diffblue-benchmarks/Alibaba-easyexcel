package com.alibaba.excel.read.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.read.listener.ReadListener;
import java.util.List;
import org.junit.Test;

public class ReadBasicParameterDiffblueTest {
  @Test(timeout=10000)
  public void setCustomReadListenerListTest() {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();

    // Act
    readBasicParameter.setCustomReadListenerList(null);

    // Assert
    assertNull(readBasicParameter.getCustomReadListenerList());
  }

  @Test(timeout=10000)
  public void getCustomReadListenerListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ReadBasicParameter()).getCustomReadListenerList().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ReadBasicParameter actualReadBasicParameter = new ReadBasicParameter();

    // Assert
    Class actualClazz = actualReadBasicParameter.getClazz();
    List<List<String>> actualHead = actualReadBasicParameter.getHead();
    Integer actualHeadRowNumber = actualReadBasicParameter.getHeadRowNumber();
    Boolean actualAutoTrim = actualReadBasicParameter.getAutoTrim();
    List<ReadListener> customReadListenerList = actualReadBasicParameter.getCustomReadListenerList();
    Boolean actualUse1904windowing = actualReadBasicParameter.getUse1904windowing();
    assertNull(actualClazz);
    assertNull(actualReadBasicParameter.getCustomConverterList());
    assertNull(actualUse1904windowing);
    assertTrue(customReadListenerList instanceof java.util.ArrayList);
    assertNull(actualAutoTrim);
    assertEquals(0, customReadListenerList.size());
    assertNull(actualHeadRowNumber);
    assertNull(actualHead);
  }

  @Test(timeout=10000)
  public void setHeadRowNumberTest() {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();

    // Act
    readBasicParameter.setHeadRowNumber(Integer.valueOf(10));

    // Assert
    assertEquals(Integer.valueOf(10), readBasicParameter.getHeadRowNumber());
  }

  @Test(timeout=10000)
  public void getHeadRowNumberTest() {
    // Arrange, Act and Assert
    assertNull((new ReadBasicParameter()).getHeadRowNumber());
  }
}

