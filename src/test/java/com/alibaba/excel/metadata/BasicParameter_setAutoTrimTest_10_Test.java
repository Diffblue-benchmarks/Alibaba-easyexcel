package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_setAutoTrimTest_10_Test {
  @Test
  public void setAutoTrimTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();
    Boolean autoTrim = new Boolean(true);

    // Act
    basicParameter.setAutoTrim(autoTrim);

    // Assert
    Class clazz = basicParameter.getClazz();
    List<List<String>> head = basicParameter.getHead();
    Boolean autoTrim1 = basicParameter.getAutoTrim();
    String toStringResult = basicParameter.toString();
    Boolean use1904windowing = basicParameter.getUse1904windowing();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, basicParameter.getCustomConverterList());
    Assert.assertEquals(null, use1904windowing);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Boolean.valueOf(true), autoTrim1);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
