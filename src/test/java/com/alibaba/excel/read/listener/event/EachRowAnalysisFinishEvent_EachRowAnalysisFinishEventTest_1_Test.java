package com.alibaba.excel.read.listener.event;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.event.EachRowAnalysisFinishEvent;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EachRowAnalysisFinishEvent_EachRowAnalysisFinishEventTest_1_Test {
  @Test
  public void EachRowAnalysisFinishEventTest() throws Exception {
    // Arrange
    HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
    Integer integer = new Integer(1);
    hashMap.put(integer,
        new CellData(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0}));

    // Act
    EachRowAnalysisFinishEvent eachRowAnalysisFinishEvent = new EachRowAnalysisFinishEvent(hashMap);

    // Assert
    String toStringResult = eachRowAnalysisFinishEvent.toString();
    Map<Integer, CellData> analysisResult = eachRowAnalysisFinishEvent.getAnalysisResult();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(analysisResult instanceof HashMap);
    Assert.assertEquals(1, analysisResult.size());
    Assert.assertTrue(analysisResult.containsKey(Integer.valueOf(1)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
