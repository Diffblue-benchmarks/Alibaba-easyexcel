package com.alibaba.excel.write.property;

import com.alibaba.excel.metadata.CellRange;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriteHeadProperty_headCellRangeListTest_6_Test {
  @Test
  public void headCellRangeListTest() throws Exception {
    // Arrange
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("-");
    arrayList.add(arrayList1);
    ExcelWriteHeadProperty excelWriteHeadProperty = new ExcelWriteHeadProperty(null, arrayList, new Boolean(true));

    // Act
    List<CellRange> actual = excelWriteHeadProperty.headCellRangeList();

    // Assert
    Assert.assertTrue(actual instanceof ArrayList);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
