package com.alibaba.excel.read.builder;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_readCacheTest_22_Test {
  @Test
  public void readCacheTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Ehcache readCache = new Ehcache(1);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.readCache(readCache);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
