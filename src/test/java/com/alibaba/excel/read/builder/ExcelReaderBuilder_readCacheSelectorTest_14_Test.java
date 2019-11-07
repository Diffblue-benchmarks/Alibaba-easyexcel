package com.alibaba.excel.read.builder;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_readCacheSelectorTest_14_Test {
  @Test
  public void readCacheSelectorTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    EternalReadCacheSelector readCacheSelector = new EternalReadCacheSelector(new Ehcache(1));

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.readCacheSelector(readCacheSelector);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
