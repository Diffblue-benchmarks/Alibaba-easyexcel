package com.alibaba.excel.write.style.column;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SimpleColumnWidthStyleStrategy_columnWidthTest_1_Test {
  @Test
  public void columnWidthTest() throws Exception {
    // Arrange
    SimpleColumnWidthStyleStrategy simpleColumnWidthStyleStrategy = new SimpleColumnWidthStyleStrategy(new Integer(1));
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));

    // Act
    Integer actual = simpleColumnWidthStyleStrategy.columnWidth(head);

    // Assert
    Assert.assertEquals(Integer.valueOf(1), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
