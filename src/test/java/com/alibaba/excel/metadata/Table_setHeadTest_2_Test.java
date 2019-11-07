package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Table;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Table_setHeadTest_2_Test {
  @Test
  public void setHeadTest() throws Exception {
    // Arrange
    Table table = new Table(new Integer(1));
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    arrayList.add(arrayList1);

    // Act
    table.setHead(arrayList);

    // Assert
    Assert.assertEquals(1, arrayList.size());
    List<String> getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof ArrayList);
    Assert.assertEquals(1, getResult.size());
    Assert.assertEquals("aaaaa", getResult.get(0));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
