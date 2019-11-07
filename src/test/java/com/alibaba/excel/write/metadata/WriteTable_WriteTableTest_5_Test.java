package com.alibaba.excel.write.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTable_WriteTableTest_5_Test {
  @Test
  public void WriteTableTest() throws Exception {
    // Arrange and Act
    WriteTable writeTable = new WriteTable();

    // Assert
    Class clazz = writeTable.getClazz();
    List<List<String>> head = writeTable.getHead();
    Boolean autoTrim = writeTable.getAutoTrim();
    List<WriteHandler> customWriteHandlerList = writeTable.getCustomWriteHandlerList();
    String toStringResult = writeTable.toString();
    Boolean needHead = writeTable.getNeedHead();
    Integer relativeHeadRowIndex = writeTable.getRelativeHeadRowIndex();
    TableStyle tableStyle = writeTable.getTableStyle();
    Boolean use1904windowing = writeTable.getUse1904windowing();
    List<Converter> customConverterList = writeTable.getCustomConverterList();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, writeTable.getTableNo());
    Assert.assertEquals(null, customConverterList);
    Assert.assertEquals(null, use1904windowing);
    Assert.assertEquals(null, tableStyle);
    Assert.assertEquals(null, relativeHeadRowIndex);
    Assert.assertEquals(null, needHead);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(0, customWriteHandlerList.size());
    Assert.assertEquals(null, head);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
