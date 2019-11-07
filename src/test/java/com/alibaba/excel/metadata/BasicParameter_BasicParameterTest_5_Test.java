package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_BasicParameterTest_5_Test {
  @Test
  public void BasicParameterTest() throws Exception {
    // Arrange and Act
    BasicParameter basicParameter = new BasicParameter();

    // Assert
    Class clazz = basicParameter.getClazz();
    List<List<String>> head = basicParameter.getHead();
    Boolean autoTrim = basicParameter.getAutoTrim();
    String toStringResult = basicParameter.toString();
    Boolean use1904windowing = basicParameter.getUse1904windowing();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, basicParameter.getCustomConverterList());
    Assert.assertEquals(null, use1904windowing);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
