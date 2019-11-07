package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_WriteWorkbookHolderTest_21_Test {
//failed_compile   @Test
//  public void WriteWorkbookHolderTest() throws Exception {
//    // Arrange
//    WriteWorkbook writeWorkbook = new WriteWorkbook();
//
//    // Act
//    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
//
//    // Assert
//    ExcelTypeEnum excelType = writeWorkbookHolder.getExcelType();
//    Class clazz = writeWorkbookHolder.getClazz();
//    String toStringResult = writeWorkbookHolder.toString();
//    WriteWorkbook writeWorkbook1 = writeWorkbookHolder.getWriteWorkbook();
//    InputStream templateInputStream = writeWorkbookHolder.getTemplateInputStream();
//    Map<String, Converter> converterMap = writeWorkbookHolder.getConverterMap();
//    File file = writeWorkbookHolder.getFile();
//    Boolean newInitialization = writeWorkbookHolder.getNewInitialization();
//    OutputStream outputStream = writeWorkbookHolder.getOutputStream();
//    Map<Integer, WriteSheetHolder> hasBeenInitializedSheet = writeWorkbookHolder.getHasBeenInitializedSheet();
//    Map<Integer, Integer> templateLastRowMap = writeWorkbookHolder.getTemplateLastRowMap();
//    Boolean autoCloseStream = writeWorkbookHolder.getAutoCloseStream();
//    Map<Class<com.alibaba.excel.write.handler.WriteHandler>, List<com.alibaba.excel.write.handler.WriteHandler>> writeHandlerMap = writeWorkbookHolder
//        .getWriteHandlerMap();
//    ExcelWriteHeadProperty excelWriteHeadProperty = writeWorkbookHolder.getExcelWriteHeadProperty();
//    List<List<String>> head = writeWorkbookHolder.getHead();
//    Boolean needHead = writeWorkbookHolder.getNeedHead();
//    Integer relativeHeadRowIndex = writeWorkbookHolder.getRelativeHeadRowIndex();
//    Boolean mandatoryUseInputStream = writeWorkbookHolder.getMandatoryUseInputStream();
//    Workbook workbook = writeWorkbookHolder.getWorkbook();
//    Assert.assertEquals(ExcelTypeEnum.XLSX, excelType);
//    Assert.assertEquals(null, writeWorkbookHolder.getTemplateFile());
//    Assert.assertEquals(null, workbook);
//    Assert.assertEquals(Boolean.valueOf(false), mandatoryUseInputStream);
//    Assert.assertEquals(Integer.valueOf(0), relativeHeadRowIndex);
//    Assert.assertEquals(Boolean.valueOf(true), needHead);
//    Assert.assertEquals(null, head);
//    HeadKindEnum headKind = excelWriteHeadProperty.getHeadKind();
//    RowHeightProperty headRowHeightProperty = excelWriteHeadProperty.getHeadRowHeightProperty();
//    Map<Integer, Head> headMap = excelWriteHeadProperty.getHeadMap();
//    Map<Integer, ExcelContentProperty> contentPropertyMap = excelWriteHeadProperty.getContentPropertyMap();
//    String toStringResult1 = excelWriteHeadProperty.toString();
//    Class headClazz = excelWriteHeadProperty.getHeadClazz();
//    boolean hasHeadResult = excelWriteHeadProperty.hasHead();
//    RowHeightProperty contentRowHeightProperty = excelWriteHeadProperty.getContentRowHeightProperty();
//    int headRowNumber = excelWriteHeadProperty.getHeadRowNumber();
//    Map<String, Field> ignoreMap = excelWriteHeadProperty.getIgnoreMap();
//    Assert.assertTrue(writeHandlerMap instanceof java.util.HashMap);
//    Assert.assertEquals(null, clazz);
//    Assert.assertEquals(5, writeHandlerMap.size());
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, file);
//    Assert.assertEquals(Boolean.valueOf(true), newInitialization);
//    ExcelTypeEnum excelType1 = writeWorkbook1.getExcelType();
//    Class clazz1 = writeWorkbook1.getClazz();
//    List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = writeWorkbook1
//        .getCustomWriteHandlerList();
//    String toStringResult2 = writeWorkbook1.toString();
//    InputStream templateInputStream1 = writeWorkbook1.getTemplateInputStream();
//    File file1 = writeWorkbook1.getFile();
//    OutputStream outputStream1 = writeWorkbook1.getOutputStream();
//    Boolean autoCloseStream1 = writeWorkbook1.getAutoCloseStream();
//    Boolean convertAllFiled = writeWorkbook1.getConvertAllFiled();
//    com.alibaba.excel.event.WriteHandler writeHandler = writeWorkbook1.getWriteHandler();
//    List<List<String>> head1 = writeWorkbook1.getHead();
//    Boolean autoTrim = writeWorkbook1.getAutoTrim();
//    Boolean needHead1 = writeWorkbook1.getNeedHead();
//    Integer relativeHeadRowIndex1 = writeWorkbook1.getRelativeHeadRowIndex();
//    Boolean mandatoryUseInputStream1 = writeWorkbook1.getMandatoryUseInputStream();
//    Boolean use1904windowing = writeWorkbook1.getUse1904windowing();
//    List<Converter> customConverterList = writeWorkbook1.getCustomConverterList();
//    Assert.assertEquals(null, outputStream);
//    Assert.assertTrue(hasBeenInitializedSheet instanceof java.util.HashMap);
//    Assert.assertEquals(null, templateInputStream);
//    Assert.assertTrue(templateLastRowMap instanceof java.util.HashMap);
//    Assert.assertEquals(Boolean.valueOf(true), autoCloseStream);
//    Assert.assertTrue(converterMap instanceof java.util.HashMap);
//    Assert.assertEquals(null, autoTrim);
//    Assert.assertEquals(null, head1);
//    Assert.assertEquals(null, writeHandler);
//    Assert.assertEquals(null, convertAllFiled);
//    Assert.assertEquals(null, autoCloseStream1);
//    Assert.assertEquals(null, outputStream1);
//    Assert.assertEquals(null, file1);
//    Assert.assertEquals(null, templateInputStream1);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
//    Assert.assertEquals(null, clazz1);
//    Assert.assertEquals(null, excelType1);
//    Assert.assertTrue(ignoreMap instanceof java.util.HashMap);
//    Assert.assertTrue(headMap instanceof java.util.TreeMap);
//    Assert.assertEquals(null, headRowHeightProperty);
//    Assert.assertEquals(HeadKindEnum.NONE, headKind);
//    Assert.assertEquals(null, use1904windowing);
//    Assert.assertEquals(null, customConverterList);
//    Assert.assertEquals(null, headClazz);
//    Assert.assertFalse(hasHeadResult);
//    Assert.assertEquals(0, headRowNumber);
//    Assert.assertEquals(null, contentRowHeightProperty);
//    Assert.assertEquals(null, needHead1);
//    Assert.assertEquals(null, mandatoryUseInputStream1);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(null, writeWorkbook1.getTemplateFile());
//    Assert.assertEquals(null, relativeHeadRowIndex1);
//    Assert.assertTrue(contentPropertyMap instanceof java.util.TreeMap);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
