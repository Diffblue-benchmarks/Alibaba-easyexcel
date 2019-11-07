package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Head_setColumnWidthPropertyTest_9_Test {
  @Test
  public void setColumnWidthPropertyTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Boolean resultBoolean = new Boolean(true);
    Head head = new Head(integer, "aaaaa", arrayList, resultBoolean, new Boolean(true));
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(new Integer(1));

    // Act
    head.setColumnWidthProperty(columnWidthProperty);

    // Assert
    Integer width = columnWidthProperty.getWidth();
    Assert.assertEquals(Integer.valueOf(1), width);
    Assert.assertNotNull(columnWidthProperty.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
