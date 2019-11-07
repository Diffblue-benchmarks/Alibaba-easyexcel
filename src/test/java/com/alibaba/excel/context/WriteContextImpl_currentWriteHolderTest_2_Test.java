package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteHolder;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteContextImpl_currentWriteHolderTest_2_Test {
//failed_compile   @Test
//  public void currentWriteHolderTest() throws Exception {
//    // Arrange
//    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
//
//    // Act
//    WriteHolder actual = writeContextImpl.currentWriteHolder();
//
//    // Assert
//    Assert.assertTrue(actual instanceof WriteWorkbookHolder);
//    ExcelTypeEnum excelType = ((WriteWorkbookHolder) actual).getExcelType();
//    Class clazz = ((WriteWorkbookHolder) actual).getClazz();
//    String toStringResult = ((WriteWorkbookHolder) actual).toString();
//    WriteWorkbook writeWorkbook = ((WriteWorkbookHolder) actual).getWriteWorkbook();
//    InputStream templateInputStream = ((WriteWorkbookHolder) actual).getTemplateInputStream();
//    Map<String, Converter> converterMap = ((WriteWorkbookHolder) actual).getConverterMap();
//    File file = ((WriteWorkbookHolder) actual).getFile();
//    Boolean newInitialization = ((WriteWorkbookHolder) actual).getNewInitialization();
//    OutputStream outputStream = ((WriteWorkbookHolder) actual).getOutputStream();
//    Map<Integer, WriteSheetHolder> hasBeenInitializedSheet = ((WriteWorkbookHolder) actual)
//        .getHasBeenInitializedSheet();
//    Map<Integer, Integer> templateLastRowMap = ((WriteWorkbookHolder) actual).getTemplateLastRowMap();
//    Boolean autoCloseStream = ((WriteWorkbookHolder) actual).getAutoCloseStream();
//    Map<Class<com.alibaba.excel.write.handler.WriteHandler>, List<com.alibaba.excel.write.handler.WriteHandler>> writeHandlerMap = ((WriteWorkbookHolder) actual)
//        .getWriteHandlerMap();
//    List<List<String>> head = ((WriteWorkbookHolder) actual).getHead();
//    Boolean needHead = ((WriteWorkbookHolder) actual).getNeedHead();
//    Integer relativeHeadRowIndex = ((WriteWorkbookHolder) actual).getRelativeHeadRowIndex();
//    Boolean mandatoryUseInputStream = ((WriteWorkbookHolder) actual).getMandatoryUseInputStream();
//    Workbook workbook = ((WriteWorkbookHolder) actual).getWorkbook();
//    Assert.assertEquals(ExcelTypeEnum.XLSX, excelType);
//    Assert.assertEquals(null, ((WriteWorkbookHolder) actual).getTemplateFile());
//    Assert.assertTrue(workbook instanceof SXSSFWorkbook);
//    Assert.assertEquals(Boolean.valueOf(false), mandatoryUseInputStream);
//    short numberOfFonts = workbook.getNumberOfFonts();
//    Row.MissingCellPolicy missingCellPolicy = workbook.getMissingCellPolicy();
//    String toStringResult1 = ((SXSSFWorkbook) workbook).toString();
//    boolean forceFormulaRecalculation = workbook.getForceFormulaRecalculation();
//    int randomAccessWindowSize = ((SXSSFWorkbook) workbook).getRandomAccessWindowSize();
//    int firstVisibleTab = workbook.getFirstVisibleTab();
//    int numberOfSheets = workbook.getNumberOfSheets();
//    List<PictureData> allPictures = workbook.getAllPictures();
//    int numberOfNames = workbook.getNumberOfNames();
//    int activeSheetIndex = workbook.getActiveSheetIndex();
//    CreationHelper creationHelper = workbook.getCreationHelper();
//    boolean isCompressTempFilesResult = ((SXSSFWorkbook) workbook).isCompressTempFiles();
//    int numCellStyles = workbook.getNumCellStyles();
//    SpreadsheetVersion spreadsheetVersion = workbook.getSpreadsheetVersion();
//    Assert.assertEquals(Integer.valueOf(0), relativeHeadRowIndex);
//    Assert.assertEquals(null, clazz);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, file);
//    Assert.assertEquals(null, head);
//    Assert.assertEquals(Boolean.valueOf(true), needHead);
//    Assert.assertEquals(Boolean.valueOf(true), newInitialization);
//    ExcelTypeEnum excelType1 = writeWorkbook.getExcelType();
//    Class clazz1 = writeWorkbook.getClazz();
//    List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = writeWorkbook
//        .getCustomWriteHandlerList();
//    String toStringResult2 = writeWorkbook.toString();
//    InputStream templateInputStream1 = writeWorkbook.getTemplateInputStream();
//    File file1 = writeWorkbook.getFile();
//    OutputStream outputStream1 = writeWorkbook.getOutputStream();
//    Boolean autoCloseStream1 = writeWorkbook.getAutoCloseStream();
//    Boolean convertAllFiled = writeWorkbook.getConvertAllFiled();
//    com.alibaba.excel.event.WriteHandler writeHandler = writeWorkbook.getWriteHandler();
//    List<List<String>> head1 = writeWorkbook.getHead();
//    Assert.assertEquals(null, outputStream);
//    Assert.assertTrue(hasBeenInitializedSheet instanceof java.util.HashMap);
//    Assert.assertEquals(null, templateInputStream);
//    Assert.assertTrue(templateLastRowMap instanceof java.util.HashMap);
//    Assert.assertEquals(Boolean.valueOf(true), autoCloseStream);
//    Assert.assertTrue(converterMap instanceof java.util.HashMap);
//    Assert.assertTrue(writeHandlerMap instanceof java.util.HashMap);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
//    Assert.assertEquals(null, clazz1);
//    Assert.assertEquals(null, excelType1);
//    Assert.assertEquals(0, numberOfSheets);
//    Assert.assertEquals(0, firstVisibleTab);
//    Assert.assertEquals(500, randomAccessWindowSize);
//    Assert.assertFalse(forceFormulaRecalculation);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK, missingCellPolicy);
//    Assert.assertEquals((short) 1, numberOfFonts);
//    Assert.assertFalse(isCompressTempFilesResult);
//    Assert.assertEquals(0, activeSheetIndex);
//    Assert.assertEquals(null, outputStream1);
//    Assert.assertEquals(null, autoCloseStream1);
//    Assert.assertEquals(null, writeHandler);
//    Assert.assertEquals(null, head1);
//    Assert.assertEquals(0, numberOfNames);
//    Assert.assertTrue(creationHelper instanceof org.apache.poi.xssf.streaming.SXSSFCreationHelper);
//    Assert.assertEquals(null, writeWorkbook.getAutoTrim());
//    Assert.assertEquals(null, file1);
//    Assert.assertEquals(null, convertAllFiled);
//    Assert.assertTrue(allPictures instanceof java.util.ArrayList);
//    Assert.assertEquals(1, numCellStyles);
//    Assert.assertEquals(null, templateInputStream1);
//    Assert.assertEquals(SpreadsheetVersion.EXCEL2007, spreadsheetVersion);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
