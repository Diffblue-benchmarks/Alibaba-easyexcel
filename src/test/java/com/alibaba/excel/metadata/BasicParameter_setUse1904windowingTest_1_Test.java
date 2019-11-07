package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_setUse1904windowingTest_1_Test {
  @Test
  public void setUse1904windowingTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();
    Boolean use1904windowing = new Boolean(true);

    // Act
    basicParameter.setUse1904windowing(use1904windowing);

    // Assert
    Class clazz = basicParameter.getClazz();
    List<List<String>> head = basicParameter.getHead();
    Boolean autoTrim = basicParameter.getAutoTrim();
    String toStringResult = basicParameter.toString();
    Boolean use1904windowing1 = basicParameter.getUse1904windowing();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, basicParameter.getCustomConverterList());
    Assert.assertEquals(Boolean.valueOf(true), use1904windowing1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
