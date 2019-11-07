package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BofRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BofRecordHandler_getOrderTest_3_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    arrayList.add(new ReadSheet());
    BofRecordHandler bofRecordHandler = new BofRecordHandler(null, arrayList, true);

    // Act
    int actual = bofRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
