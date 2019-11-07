package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_TableTest_7_Test {
//failed_compile   @Test
//  public void TableTest() throws Exception {
//    // Arrange
//    Integer tableNo = new Integer(1);
//
//    // Act
//    Table table = new Table(tableNo);
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
