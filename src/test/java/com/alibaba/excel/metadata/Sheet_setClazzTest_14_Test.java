package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_setClazzTest_14_Test {
  @Test
  public void setClazzTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);
    Class<BaseRowModel> resultClass = (Class<BaseRowModel>) null;

    // Act
    sheet.setClazz(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
