package com.alibaba.excel.metadata;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.BasicParameter;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_setCustomConverterListTest_3_Test {
  @Test
  public void setCustomConverterListTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();
    ArrayList<Converter> arrayList = new ArrayList<Converter>();
    arrayList.add(new AutoConverter());

    // Act
    basicParameter.setCustomConverterList(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    Converter getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof AutoConverter);
    Assert.assertNotNull(((AutoConverter) getResult).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
