package com.alibaba.excel.read.listener.event;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.event.EachRowAnalysisFinishEvent;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EachRowAnalysisFinishEvent_getAnalysisResultTest_2_Test {
  @Test
  public void getAnalysisResultTest() throws Exception {
    // Arrange
    HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
    Integer integer = new Integer(1);
    hashMap.put(integer,
        new CellData(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    EachRowAnalysisFinishEvent eachRowAnalysisFinishEvent = new EachRowAnalysisFinishEvent(hashMap);

    // Act
    Map<Integer, CellData> actual = eachRowAnalysisFinishEvent.getAnalysisResult();

    // Assert
    Assert.assertTrue(actual instanceof HashMap);
    Assert.assertEquals(1, actual.size());
    Assert.assertTrue(actual.containsKey(Integer.valueOf(1)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
