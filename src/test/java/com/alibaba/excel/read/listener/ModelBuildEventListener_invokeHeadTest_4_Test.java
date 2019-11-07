package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ModelBuildEventListener_invokeHeadTest_4_Test {
  @Test
  public void invokeHeadTest() throws Exception {
    // Arrange
    ModelBuildEventListener modelBuildEventListener = new ModelBuildEventListener();
    HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
    Integer integer = new Integer(1);
    hashMap.put(integer,
        new CellData(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    AnalysisContextImpl analysisContextImpl = (AnalysisContextImpl) null;

    // Act
    modelBuildEventListener.invokeHead(hashMap, analysisContextImpl);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertTrue(hashMap.containsKey(Integer.valueOf(1)));
    Assert.assertEquals(null, analysisContextImpl);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
