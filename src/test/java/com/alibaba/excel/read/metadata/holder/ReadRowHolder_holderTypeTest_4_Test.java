package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_holderTypeTest_4_Test {
  @Test
  public void holderTypeTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());

    // Act
    HolderEnum actual = readRowHolder.holderType();

    // Assert
    Assert.assertEquals(HolderEnum.ROW, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
