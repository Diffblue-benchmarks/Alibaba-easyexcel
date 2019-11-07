package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Table;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_setClazzTest_6_Test {
  @Test
  public void setClazzTest() throws Exception {
    // Arrange
    Table table = new Table(new Integer(1));
    Class<BaseRowModel> resultClass = (Class<BaseRowModel>) null;

    // Act
    table.setClazz(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
