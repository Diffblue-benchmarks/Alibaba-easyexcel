package com.alibaba.excel.write.builder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_buildTest_1_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Act
    WriteTable actual = excelWriterTableBuilder.build();

    // Assert
    Class clazz = actual.getClazz();
    List<List<String>> head = actual.getHead();
    Boolean autoTrim = actual.getAutoTrim();
    List<WriteHandler> customWriteHandlerList = actual.getCustomWriteHandlerList();
    String toStringResult = actual.toString();
    Boolean needHead = actual.getNeedHead();
    Integer relativeHeadRowIndex = actual.getRelativeHeadRowIndex();
    TableStyle tableStyle = actual.getTableStyle();
    Boolean use1904windowing = actual.getUse1904windowing();
    List<Converter> customConverterList = actual.getCustomConverterList();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, actual.getTableNo());
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
