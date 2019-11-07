package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ModelBuildEventListener_invokeTest_1_Test {
  @Test
  public void invokeTest() throws Exception {
    // Arrange
    ModelBuildEventListener modelBuildEventListener = new ModelBuildEventListener();
    HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
    Integer integer = new Integer(1);
    hashMap.put(integer,
        new CellData(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    AnalysisContextImpl context = (AnalysisContextImpl) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    modelBuildEventListener.invoke(hashMap, context);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
