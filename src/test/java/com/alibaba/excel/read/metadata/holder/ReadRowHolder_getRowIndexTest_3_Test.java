package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_getRowIndexTest_3_Test {
  @Test
  public void getRowIndexTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());

    // Act
    Integer actual = readRowHolder.getRowIndex();

    // Assert
    Assert.assertEquals(Integer.valueOf(1), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
