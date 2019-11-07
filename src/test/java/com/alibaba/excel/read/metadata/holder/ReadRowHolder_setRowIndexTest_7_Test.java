package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_setRowIndexTest_7_Test {
  @Test
  public void setRowIndexTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());
    Integer rowIndex = new Integer(1);

    // Act
    readRowHolder.setRowIndex(rowIndex);

    // Assert
    GlobalConfiguration globalConfiguration = readRowHolder.getGlobalConfiguration();
    Integer rowIndex1 = readRowHolder.getRowIndex();
    Object currentRowAnalysisResult = readRowHolder.getCurrentRowAnalysisResult();
    String toStringResult = readRowHolder.toString();
    Boolean autoTrim = globalConfiguration.getAutoTrim();
    String toStringResult1 = globalConfiguration.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Integer.valueOf(1), rowIndex1);
    Assert.assertEquals(null, currentRowAnalysisResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, globalConfiguration.getUse1904windowing());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
