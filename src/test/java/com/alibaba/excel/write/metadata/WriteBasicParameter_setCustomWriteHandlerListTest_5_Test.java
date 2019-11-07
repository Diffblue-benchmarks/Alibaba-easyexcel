package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteBasicParameter;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteBasicParameter_setCustomWriteHandlerListTest_5_Test {
  @Test
  public void setCustomWriteHandlerListTest() throws Exception {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
    ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    arrayList.add(new LoopMergeStrategy(1, 1));

    // Act
    writeBasicParameter.setCustomWriteHandlerList(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    WriteHandler getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof LoopMergeStrategy);
    Assert.assertNotNull(((LoopMergeStrategy) getResult).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
