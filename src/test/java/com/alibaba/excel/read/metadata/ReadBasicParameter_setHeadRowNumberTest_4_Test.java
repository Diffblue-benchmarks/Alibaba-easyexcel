package com.alibaba.excel.read.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadBasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadBasicParameter_setHeadRowNumberTest_4_Test {
  @Test
  public void setHeadRowNumberTest() throws Exception {
    // Arrange
    ReadBasicParameter readBasicParameter = new ReadBasicParameter();
    Integer headRowNumber = new Integer(1);

    // Act
    readBasicParameter.setHeadRowNumber(headRowNumber);

    // Assert
    Class clazz = readBasicParameter.getClazz();
    List<List<String>> head = readBasicParameter.getHead();
    Integer headRowNumber1 = readBasicParameter.getHeadRowNumber();
    Boolean autoTrim = readBasicParameter.getAutoTrim();
    String toStringResult = readBasicParameter.toString();
    List<ReadListener> customReadListenerList = readBasicParameter.getCustomReadListenerList();
    Boolean use1904windowing = readBasicParameter.getUse1904windowing();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, readBasicParameter.getCustomConverterList());
    Assert.assertEquals(null, use1904windowing);
    Assert.assertTrue(customReadListenerList instanceof java.util.ArrayList);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, customReadListenerList.size());
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(Integer.valueOf(1), headRowNumber1);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
