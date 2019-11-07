package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import java.util.HashMap;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BaseRowModel_setCellStyleMapTest_4_Test {
  @Test
  public void setCellStyleMapTest() throws Exception {
    // Arrange
    BaseRowModel baseRowModel = new BaseRowModel();
    HashMap<Integer, CellStyle> hashMap = new HashMap<Integer, CellStyle>();
    hashMap.put(new Integer(1), null);

    // Act
    baseRowModel.setCellStyleMap(hashMap);

    // Assert
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals(null, hashMap.get(Integer.valueOf(1)));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
