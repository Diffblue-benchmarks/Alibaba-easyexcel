package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTableHolder_setWriteTableTest_6_Test {
  @Test
  public void setWriteTableTest() throws Exception {
    // Arrange
    WriteTable writeTable = new WriteTable();
    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
        new WriteWorkbookHolder(new WriteWorkbook()));
    WriteTable writeTable1 = new WriteTable();

    // Act
    writeTableHolder.setWriteTable(writeTable1);

    // Assert
    Class clazz = writeTable1.getClazz();
    List<List<String>> head = writeTable1.getHead();
    Boolean autoTrim = writeTable1.getAutoTrim();
    List<WriteHandler> customWriteHandlerList = writeTable1.getCustomWriteHandlerList();
    String toStringResult = writeTable1.toString();
    Boolean needHead = writeTable1.getNeedHead();
    Integer relativeHeadRowIndex = writeTable1.getRelativeHeadRowIndex();
    TableStyle tableStyle = writeTable1.getTableStyle();
    Boolean use1904windowing = writeTable1.getUse1904windowing();
    List<Converter> customConverterList = writeTable1.getCustomConverterList();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, writeTable1.getTableNo());
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
