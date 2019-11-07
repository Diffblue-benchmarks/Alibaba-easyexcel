package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_ReadRowHolderTest_5_Test {
  @Test
  public void ReadRowHolderTest() throws Exception {
    // Arrange
    Integer rowIndex = new Integer(1);
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    ReadRowHolder readRowHolder = new ReadRowHolder(rowIndex, globalConfiguration);

    // Assert
    GlobalConfiguration globalConfiguration1 = readRowHolder.getGlobalConfiguration();
    Integer rowIndex1 = readRowHolder.getRowIndex();
    Object currentRowAnalysisResult = readRowHolder.getCurrentRowAnalysisResult();
    String toStringResult = readRowHolder.toString();
    Boolean autoTrim = globalConfiguration1.getAutoTrim();
    String toStringResult1 = globalConfiguration1.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Integer.valueOf(1), rowIndex1);
    Assert.assertEquals(null, currentRowAnalysisResult);
    Assert.assertEquals(null, autoTrim);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, globalConfiguration1.getUse1904windowing());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
