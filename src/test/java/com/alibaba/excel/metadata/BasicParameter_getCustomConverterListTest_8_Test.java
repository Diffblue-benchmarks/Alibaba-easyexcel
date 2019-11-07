package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_getCustomConverterListTest_8_Test {
  @Test
  public void getCustomConverterListTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    List<Converter> actual = basicParameter.getCustomConverterList();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
