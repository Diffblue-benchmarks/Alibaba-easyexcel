package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_setCurrentRowAnalysisResultTest_1_Test {
  @Test
  public void setCurrentRowAnalysisResultTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());
    String currentRowAnalysisResult = "aaaaa";

    // Act
    readRowHolder.setCurrentRowAnalysisResult(currentRowAnalysisResult);

    // Assert
    GlobalConfiguration globalConfiguration = readRowHolder.getGlobalConfiguration();
    Integer rowIndex = readRowHolder.getRowIndex();
    Object currentRowAnalysisResult1 = readRowHolder.getCurrentRowAnalysisResult();
    String toStringResult = readRowHolder.toString();
    Boolean autoTrim = globalConfiguration.getAutoTrim();
    String toStringResult1 = globalConfiguration.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Integer.valueOf(1), rowIndex);
    Assert.assertTrue(currentRowAnalysisResult1 instanceof String);
    Assert.assertEquals("aaaaa", currentRowAnalysisResult1);
    Assert.assertEquals(null, globalConfiguration.getUse1904windowing());
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, autoTrim);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
