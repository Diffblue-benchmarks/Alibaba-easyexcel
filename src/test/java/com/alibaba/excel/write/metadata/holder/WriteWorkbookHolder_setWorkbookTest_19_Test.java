package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.util.List;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.model.DrawingManager2;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.FormatRecord;
import org.apache.poi.hssf.record.HyperlinkRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.usermodel.HSSFCreationHelper;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setWorkbookTest_19_Test {
//failed_pass   @Test
//  public void setWorkbookTest() throws Exception {
//    // Arrange
//    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
//    HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
//
//    // Act
//    writeWorkbookHolder.setWorkbook(hSSFWorkbook);
//
//    // Assert
//    DirectoryNode rootDirectory = hSSFWorkbook.getRootDirectory();
//    Row.MissingCellPolicy missingCellPolicy = hSSFWorkbook.getMissingCellPolicy();
//    boolean backupFlag = hSSFWorkbook.getBackupFlag();
//    boolean forceFormulaRecalculation = hSSFWorkbook.getForceFormulaRecalculation();
//    InternalWorkbook internalWorkbook = hSSFWorkbook.getInternalWorkbook();
//    boolean isHiddenResult = hSSFWorkbook.isHidden();
//    HSSFPalette customPalette = hSSFWorkbook.getCustomPalette();
//    EncryptionInfo encryptionInfo = hSSFWorkbook.getEncryptionInfo();
//    HSSFCreationHelper creationHelper = hSSFWorkbook.getCreationHelper();
//    HSSFCreationHelper creationHelper1 = hSSFWorkbook.getCreationHelper();
//    int numCellStyles = hSSFWorkbook.getNumCellStyles();
//    short numberOfFonts = hSSFWorkbook.getNumberOfFonts();
//    DirectoryNode directory = hSSFWorkbook.getDirectory();
//    String toStringResult = hSSFWorkbook.toString();
//    boolean isWriteProtectedResult = hSSFWorkbook.isWriteProtected();
//    DocumentSummaryInformation documentSummaryInformation = hSSFWorkbook.getDocumentSummaryInformation();
//    int firstVisibleTab = hSSFWorkbook.getFirstVisibleTab();
//    int numberOfSheets = hSSFWorkbook.getNumberOfSheets();
//    byte[] bytes = hSSFWorkbook.getBytes();
//    int numberOfNames = hSSFWorkbook.getNumberOfNames();
//    SummaryInformation summaryInformation = hSSFWorkbook.getSummaryInformation();
//    int activeSheetIndex = hSSFWorkbook.getActiveSheetIndex();
//    Assert.assertEquals(null, rootDirectory);
//    Assert.assertEquals(SpreadsheetVersion.EXCEL97, hSSFWorkbook.getSpreadsheetVersion());
//    Assert.assertEquals(0, activeSheetIndex);
//    Assert.assertEquals(null, summaryInformation);
//    Assert.assertEquals(0, numberOfNames);
//    Assert.assertEquals(1588, bytes.length);
//    Assert.assertEquals((byte) 9, bytes[0]);
//    Assert.assertEquals((byte) 8, bytes[1]);
//    Assert.assertEquals((byte) 16, bytes[2]);
//    Assert.assertEquals((byte) 0, bytes[1585]);
//    Assert.assertEquals((byte) 0, bytes[1586]);
//    Assert.assertEquals((byte) 0, bytes[1587]);
//    Assert.assertEquals(0, numberOfSheets);
//    Assert.assertEquals(0, firstVisibleTab);
//    Assert.assertEquals(null, documentSummaryInformation);
//    Assert.assertFalse(isWriteProtectedResult);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, directory);
//    Assert.assertEquals((short) 4, numberOfFonts);
//    Assert.assertEquals(21, numCellStyles);
//    String toStringResult1 = creationHelper1.toString();
//    String toStringResult2 = creationHelper.toString();
//    Assert.assertEquals(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK, missingCellPolicy);
//    Assert.assertFalse(forceFormulaRecalculation);
//    Assert.assertEquals(null, encryptionInfo);
//    String toStringResult3 = customPalette.toString();
//    Assert.assertFalse(isHiddenResult);
//    String toStringResult4 = internalWorkbook.toString();
//    boolean isWriteProtectedResult1 = internalWorkbook.isWriteProtected();
//    boolean isUsing1904DateWindowingResult = internalWorkbook.isUsing1904DateWindowing();
//    DrawingManager2 drawingManager = internalWorkbook.getDrawingManager();
//    int numberOfFontRecords = internalWorkbook.getNumberOfFontRecords();
//    int numExFormats = internalWorkbook.getNumExFormats();
//    List<FormatRecord> formats = internalWorkbook.getFormats();
//    int numRecords = internalWorkbook.getNumRecords();
//    int numSheets = internalWorkbook.getNumSheets();
//    List<Record> records = internalWorkbook.getRecords();
//    int numNames = internalWorkbook.getNumNames();
//    Assert.assertFalse(backupFlag);
//    Assert.assertTrue(internalWorkbook.getHyperlinks() instanceof java.util.ArrayList);
//    Assert.assertEquals(0, numNames);
//    Assert.assertTrue(records instanceof java.util.ArrayList);
//    Assert.assertEquals(1, numSheets);
//    Assert.assertEquals(72, numRecords);
//    Assert.assertTrue(formats instanceof java.util.ArrayList);
//    Assert.assertEquals(21, numExFormats);
//    Assert.assertEquals(4, numberOfFontRecords);
//    Assert.assertEquals(null, drawingManager);
//    Assert.assertFalse(isUsing1904DateWindowingResult);
//    Assert.assertFalse(isWriteProtectedResult1);
//    Assert.assertNotNull(toStringResult4);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertNotNull(toStringResult3);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
