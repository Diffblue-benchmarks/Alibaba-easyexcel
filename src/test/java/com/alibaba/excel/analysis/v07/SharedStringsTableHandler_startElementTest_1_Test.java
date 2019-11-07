package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.SharedStringsTableHandler;
import com.alibaba.excel.cache.Ehcache;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SharedStringsTableHandler_startElementTest_1_Test {
  @Test
  public void startElementTest() throws Exception {
    // Arrange
    SharedStringsTableHandler sharedStringsTableHandler = new SharedStringsTableHandler(null);
    String uri = "rPh";
    String localName = "rPh";
    String name = "rPh";
    AttributesHolder attributesHolder = new AttributesHolder();

    // Act
    sharedStringsTableHandler.startElement(uri, localName, name, attributesHolder);

    // Assert
    String toStringResult = attributesHolder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, attributesHolder.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
