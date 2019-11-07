package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BofRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BofRecordHandler_BofRecordHandlerTest_4_Test {
  @Test
  public void BofRecordHandlerTest() throws Exception {
    // Arrange
    AnalysisContextImpl context = (AnalysisContextImpl) null;
    ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    arrayList.add(new ReadSheet());
    boolean alreadyInit = true;

    // Act
    BofRecordHandler bofRecordHandler = new BofRecordHandler(context, arrayList, alreadyInit);

    // Assert
    int row = bofRecordHandler.getRow();
    String toStringResult = bofRecordHandler.toString();
    int column = bofRecordHandler.getColumn();
    int order = bofRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, bofRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
