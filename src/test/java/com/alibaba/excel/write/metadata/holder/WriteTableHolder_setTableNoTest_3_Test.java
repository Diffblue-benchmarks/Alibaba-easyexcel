package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import com.alibaba.excel.converters.date.DateStringConverter;
import com.alibaba.excel.converters.doubleconverter.DoubleNumberConverter;
import com.alibaba.excel.converters.floatconverter.FloatNumberConverter;
import com.alibaba.excel.converters.integer.IntegerNumberConverter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteTableHolder_setTableNoTest_3_Test {
//failed_compile   @Test
//  public void setTableNoTest() throws Exception {
//    // Arrange
//    WriteTable writeTable = new WriteTable();
//    WriteTableHolder writeTableHolder = new WriteTableHolder(writeTable, null,
//        new WriteWorkbookHolder(new WriteWorkbook()));
//    Integer tableNo = new Integer(1);
//
//    // Act
//    writeTableHolder.setTableNo(tableNo);
//
//    // Assert
//    Class clazz = writeTableHolder.getClazz();
//    GlobalConfiguration globalConfiguration = writeTableHolder.getGlobalConfiguration();
//    String toStringResult = writeTableHolder.toString();
//    Map<String, Converter> converterMap = writeTableHolder.getConverterMap();
//    Boolean newInitialization = writeTableHolder.getNewInitialization();
//    Integer tableNo1 = writeTableHolder.getTableNo();
//    Map<Class<WriteHandler>, List<WriteHandler>> writeHandlerMap = writeTableHolder.getWriteHandlerMap();
//    ExcelWriteHeadProperty excelWriteHeadProperty = writeTableHolder.getExcelWriteHeadProperty();
//    List<List<String>> head = writeTableHolder.getHead();
//    WriteSheetHolder parentWriteSheetHolder = writeTableHolder.getParentWriteSheetHolder();
//    Boolean needHead = writeTableHolder.getNeedHead();
//    Integer relativeHeadRowIndex = writeTableHolder.getRelativeHeadRowIndex();
//    WriteTable writeTable1 = writeTableHolder.getWriteTable();
//    Assert.assertEquals(null, clazz);
//    Class clazz1 = writeTable1.getClazz();
//    List<List<String>> head1 = writeTable1.getHead();
//    Boolean autoTrim = writeTable1.getAutoTrim();
//    List<WriteHandler> customWriteHandlerList = writeTable1.getCustomWriteHandlerList();
//    String toStringResult1 = writeTable1.toString();
//    Boolean needHead1 = writeTable1.getNeedHead();
//    Integer relativeHeadRowIndex1 = writeTable1.getRelativeHeadRowIndex();
//    TableStyle tableStyle = writeTable1.getTableStyle();
//    Boolean use1904windowing = writeTable1.getUse1904windowing();
//    List<Converter> customConverterList = writeTable1.getCustomConverterList();
//    Integer tableNo2 = writeTable1.getTableNo();
//    Assert.assertEquals(Integer.valueOf(0), relativeHeadRowIndex);
//    Boolean autoTrim1 = globalConfiguration.getAutoTrim();
//    String toStringResult2 = globalConfiguration.toString();
//    Boolean use1904windowing1 = globalConfiguration.getUse1904windowing();
//    Assert.assertTrue(converterMap instanceof java.util.HashMap);
//    HeadKindEnum headKind = excelWriteHeadProperty.getHeadKind();
//    RowHeightProperty headRowHeightProperty = excelWriteHeadProperty.getHeadRowHeightProperty();
//    Map<Integer, Head> headMap = excelWriteHeadProperty.getHeadMap();
//    Map<Integer, ExcelContentProperty> contentPropertyMap = excelWriteHeadProperty.getContentPropertyMap();
//    String toStringResult3 = excelWriteHeadProperty.toString();
//    Class headClazz = excelWriteHeadProperty.getHeadClazz();
//    boolean hasHeadResult = excelWriteHeadProperty.hasHead();
//    RowHeightProperty contentRowHeightProperty = excelWriteHeadProperty.getContentRowHeightProperty();
//    int headRowNumber = excelWriteHeadProperty.getHeadRowNumber();
//    Map<String, Field> ignoreMap = excelWriteHeadProperty.getIgnoreMap();
//    Assert.assertEquals(14, converterMap.size());
//    Converter getResult = converterMap.get("java.lang.Float");
//    Converter getResult1 = converterMap.get("java.lang.Double");
//    Converter getResult2 = converterMap.get("java.util.Date");
//    Converter getResult3 = converterMap.get("[B");
//    Converter getResult4 = converterMap.get("[Ljava.lang.Byte;");
//    Converter getResult5 = converterMap.get("java.lang.Integer");
//    Assert.assertEquals(null, head);
//    Assert.assertEquals(Boolean.valueOf(true), newInitialization);
//    Assert.assertEquals(null, parentWriteSheetHolder);
//    Assert.assertEquals(Boolean.valueOf(true), needHead);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(Integer.valueOf(1), tableNo1);
//    Assert.assertTrue(writeHandlerMap instanceof java.util.HashMap);
//    Assert.assertEquals(5, writeHandlerMap.size());
//    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
//    Assert.assertEquals(null, contentRowHeightProperty);
//    Assert.assertEquals(0, customWriteHandlerList.size());
//    Assert.assertFalse(hasHeadResult);
//    Assert.assertEquals(null, headClazz);
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertTrue(contentPropertyMap instanceof java.util.TreeMap);
//    Assert.assertTrue(headMap instanceof java.util.TreeMap);
//    Assert.assertEquals(0, contentPropertyMap.size());
//    Assert.assertEquals(0, headMap.size());
//    Assert.assertEquals(null, headRowHeightProperty);
//    Assert.assertEquals(HeadKindEnum.NONE, headKind);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertEquals(Boolean.valueOf(true), autoTrim1);
//    Assert.assertEquals(null, use1904windowing);
//    Assert.assertEquals(null, tableStyle);
//    Assert.assertEquals(null, relativeHeadRowIndex1);
//    Assert.assertEquals(null, needHead1);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(getResult1 instanceof DoubleNumberConverter);
//    Assert.assertEquals(null, autoTrim);
//    String toStringResult4 = ((DoubleNumberConverter) getResult1).toString();
//    Assert.assertEquals(null, head1);
//    Assert.assertTrue(getResult3 instanceof ByteArrayImageConverter);
//    Assert.assertEquals(null, clazz1);
//    String toStringResult5 = ((ByteArrayImageConverter) getResult3).toString();
//    Assert.assertTrue(getResult5 instanceof IntegerNumberConverter);
//    Assert.assertEquals(Boolean.valueOf(false), use1904windowing1);
//    String toStringResult6 = ((IntegerNumberConverter) getResult5).toString();
//    Assert.assertTrue(ignoreMap instanceof java.util.HashMap);
//    Assert.assertEquals(null, tableNo2);
//    Assert.assertEquals(0, ignoreMap.size());
//    Assert.assertEquals(null, customConverterList);
//    Assert.assertTrue(getResult4 instanceof BoxingByteArrayImageConverter);
//    Assert.assertTrue(getResult instanceof FloatNumberConverter);
//    String toStringResult7 = ((BoxingByteArrayImageConverter) getResult4).toString();
//    String toStringResult8 = ((FloatNumberConverter) getResult).toString();
//    Assert.assertEquals(0, headRowNumber);
//    Assert.assertTrue(getResult2 instanceof DateStringConverter);
//    Assert.assertNotNull(toStringResult8);
//    Assert.assertNotNull(((DateStringConverter) getResult2).toString());
//    Assert.assertNotNull(toStringResult5);
//    Assert.assertNotNull(toStringResult6);
//    Assert.assertNotNull(toStringResult7);
//    Assert.assertNotNull(toStringResult4);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
