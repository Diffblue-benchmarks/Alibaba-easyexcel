package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.SharedStringsTableHandler;
import com.alibaba.excel.cache.Ehcache;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SharedStringsTableHandler_endElementTest_2_Test {
  @Test
  public void endElementTest() throws Exception {
    // Arrange
    SharedStringsTableHandler sharedStringsTableHandler = new SharedStringsTableHandler(null);
    String uri = "rPh";
    String localName = "rPh";
    String name = "rPh";

    // Act
    sharedStringsTableHandler.endElement(uri, localName, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
