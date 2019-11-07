package com.alibaba.excel.util;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.holder.ReadSheetHolder;
import com.alibaba.excel.util.ConverterUtils;
import java.util.HashMap;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ConverterUtils_convertToStringMapTest_2_Test {
  @Test
  public void convertToStringMapTest() throws Exception {
    // Arrange
    HashMap<Integer, CellData> hashMap = new HashMap<Integer, CellData>();
    Integer integer = new Integer(1);
    hashMap.put(integer,
        new CellData(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0}));
    ReadSheetHolder readHolder = (ReadSheetHolder) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ConverterUtils.convertToStringMap(hashMap, readHolder);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
