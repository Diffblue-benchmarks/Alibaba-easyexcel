package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_setTableNoTest_9_Test {
//failed_compile   @Test
//  public void setTableNoTest() throws Exception {
//    // Arrange
//    Table table = new Table(new Integer(1));
//    int tableNo = 1;
//
//    // Act
//    table.setTableNo(tableNo);
//
//    // Assert
//    Class<BaseRowModel> clazz = table.getClazz();
//    List<List<String>> head = table.getHead();
//    String toStringResult = table.toString();
//    TableStyle tableStyle = table.getTableStyle();
//    Assert.assertEquals(null, clazz);
//    Assert.assertEquals(1, table.getTableNo());
//    Assert.assertEquals(null, tableStyle);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, head);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
