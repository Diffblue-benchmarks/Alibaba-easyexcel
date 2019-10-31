package com.alibaba.excel.write.style;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.diffblue.deeptestutils.Reflector;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.hssf.record.BOFRecord;
import org.apache.poi.hssf.record.BackupRecord;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.apache.poi.hssf.record.BoundSheetRecord;
import org.apache.poi.hssf.record.CodepageRecord;
import org.apache.poi.hssf.record.CountryRecord;
import org.apache.poi.hssf.record.DateWindow1904Record;
import org.apache.poi.hssf.record.ExtSSTRecord.InfoSubRecord;
import org.apache.poi.hssf.record.ExtSSTRecord;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.FnGroupCountRecord;
import org.apache.poi.hssf.record.FontRecord;
import org.apache.poi.hssf.record.FormatRecord;
import org.apache.poi.hssf.record.HideObjRecord;
import org.apache.poi.hssf.record.HyperlinkRecord;
import org.apache.poi.hssf.record.MMSRecord;
import org.apache.poi.hssf.record.PasswordRecord;
import org.apache.poi.hssf.record.PrecisionRecord;
import org.apache.poi.hssf.record.SSTRecord;
import org.apache.poi.hssf.record.StyleRecord;
import org.apache.poi.hssf.record.SupBookRecord;
import org.apache.poi.hssf.record.TabIdRecord;
import org.apache.poi.hssf.record.WindowOneRecord;
import org.apache.poi.hssf.record.WriteAccessRecord;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class HorizontalCellStyleStrategyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999a1c6cf28900b4bd4() {

    // Arrange
    final WriteCellStyle arg0 = new WriteCellStyle();
    final WriteCellStyle arg1 = new WriteCellStyle();

    // Act, creating object to test constructor
    final HorizontalCellStyleStrategy actual = new HorizontalCellStyleStrategy(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.hasInitialized);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999e441aa85b016abfe() {

    // Arrange
    final WriteCellStyle arg0 = new WriteCellStyle();
    final ArrayList<WriteCellStyle> arg1 = new ArrayList<WriteCellStyle>();
    final WriteCellStyle writeCellStyle = new WriteCellStyle();
    arg1.add(writeCellStyle);

    // Act, creating object to test constructor
    final HorizontalCellStyleStrategy actual = new HorizontalCellStyleStrategy(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.hasInitialized);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void initCellStyleInputNotNullOutputVoid9997849d47e29c34270() {
//
//    // Arrange
//    final WriteCellStyle writeCellStyle = new WriteCellStyle();
//    final WriteCellStyle writeCellStyle1 = new WriteCellStyle();
//    final HorizontalCellStyleStrategy thisObj = new HorizontalCellStyleStrategy(writeCellStyle, writeCellStyle1);
//    final HSSFWorkbook arg0 = new HSSFWorkbook();
//
//    // Act
//    thisObj.initCellStyle(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(arg0);
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getUDFFinder());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook());
//    Assert.assertNotNull(Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst"), "bucketRelativeOffsets"));
//    Assert.assertEquals(0, ((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst")).getNumUniqueStrings());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst"), "bucketAbsoluteOffsets"));
//    Assert.assertNotNull(((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst")).getDeserializer());
//    Assert.assertEquals(0, ((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst")).getNumStrings());
//    Assert.assertNull(((HSSFWorkbook) arg0).getWorkbook().getDrawingManager());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList());
//    Assert.assertEquals(-1, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getPalettepos());
//    Assert.assertEquals(0, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getNamepos());
//    Assert.assertEquals(10, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getProtpos());
//    Assert.assertEquals(25, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getFontpos());
//    Assert.assertEquals(7, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getTabpos());
//    Assert.assertEquals(56, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getXfpos());
//    Assert.assertEquals(64, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getBspos());
//    Assert.assertEquals(0, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getExternsheetPos());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords());
//    Assert.assertEquals(71, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().size());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0));
//    Assert.assertEquals(5, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getType());
//    Assert.assertEquals(1536, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getVersion());
//    Assert.assertEquals(65, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getHistoryBitMask());
//    Assert.assertEquals(4307, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getBuild());
//    Assert.assertEquals(1996, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getBuildYear());
//    Assert.assertEquals(6, ((BOFRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getRequiredVersion());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(1));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(2));
//    Assert.assertEquals((short) 0, ((MMSRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(2)).getAddMenuCount());
//    Assert.assertEquals((short) 0, ((MMSRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(2)).getDelMenuCount());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(3));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(4));
//    Assert.assertEquals("thomas.perkins", ((WriteAccessRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(4)).getUsername());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(5));
//    Assert.assertEquals((short) 1200, ((CodepageRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(5)).getCodepage());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(6));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(7));
//    Assert.assertArrayEquals(new short[]{ }, ((TabIdRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(7))._tabids);
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(8));
//    Assert.assertEquals((short) 14, ((FnGroupCountRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(8)).getCount());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(9));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(10));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(11));
//    Assert.assertEquals(0, ((PasswordRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(11)).getPassword());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(12));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(13));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14));
//    Assert.assertEquals((short) 56, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getOptions());
//    Assert.assertEquals((short) 360, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getHorizontalHold());
//    Assert.assertEquals(0, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getActiveSheetIndex());
//    Assert.assertEquals((short) 9150, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getHeight());
//    Assert.assertEquals(0, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getFirstVisibleTab());
//    Assert.assertEquals((short) 1, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getNumSelectedTabs());
//    Assert.assertEquals((short) 14940, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getWidth());
//    Assert.assertEquals((short) 270, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getVerticalHold());
//    Assert.assertEquals((short) 600, ((WindowOneRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getTabWidthRatio());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(15));
//    Assert.assertEquals((short) 0, ((BackupRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(15)).getBackup());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(16));
//    Assert.assertEquals((short) 0, ((HideObjRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(16)).getHideObj());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(17));
//    Assert.assertEquals((short) 0, ((DateWindow1904Record) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(17)).getWindowing());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(18));
//    Assert.assertEquals((short) 1, ((PrecisionRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(18)).field_1_precision);
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(19));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(20));
//    Assert.assertEquals((short) 0, ((BookBoolRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(20)).getSaveLinkValues());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getColorPaletteIndex());
//    Assert.assertEquals("\u5b8b\u4f53", ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getFamily());
//    Assert.assertEquals((short) 280, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getCharset());
//    Assert.assertEquals((short) 700, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(26));
//    Assert.assertEquals(5, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(26)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0_);(\"$\"#,##0)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(26)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(27));
//    Assert.assertEquals(6, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(27)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0_);[Red](\"$\"#,##0)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(27)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(28));
//    Assert.assertEquals(7, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(28)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0.00_);(\"$\"#,##0.00)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(28)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(29));
//    Assert.assertEquals(8, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(29)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0.00_);[Red](\"$\"#,##0.00)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(29)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(30));
//    Assert.assertEquals(42, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(30)).getIndexCode());
//    Assert.assertEquals("_(\"$\"* #,##0_);_(\"$\"* (#,##0);_(\"$\"* \"-\"_);_(@_)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(30)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(31));
//    Assert.assertEquals(41, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(31)).getIndexCode());
//    Assert.assertEquals("_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(31)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(32));
//    Assert.assertEquals(44, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(32)).getIndexCode());
//    Assert.assertEquals("_(\"$\"* #,##0.00_);_(\"$\"* (#,##0.00);_(\"$\"* \"-\"??_);_(@_)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(32)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(33));
//    Assert.assertEquals(43, ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getIndexCode());
//    Assert.assertEquals("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)", ((FormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getBorderOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getIndentionOptions());
//    Assert.assertEquals((short) 2, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getIndentionOptions());
//    Assert.assertEquals((short) 2, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getBorderOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFontIndex());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getPaletteOptions());
//    Assert.assertEquals((short) 43, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getPaletteOptions());
//    Assert.assertEquals((short) 41, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getPaletteOptions());
//    Assert.assertEquals((short) 44, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getPaletteOptions());
//    Assert.assertEquals((short) 42, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getPaletteOptions());
//    Assert.assertEquals((short) 9, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55));
//    Assert.assertEquals((short) 4369, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getBorderOptions());
//    Assert.assertEquals((short) -18432, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getIndentionOptions());
//    Assert.assertEquals((short) 5, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getFontIndex());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getCellOptions());
//    Assert.assertEquals((short) 1032, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getFormatIndex());
//    Assert.assertEquals(67109896, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 26, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getAlignmentOptions());
//    Assert.assertEquals((short) 8214, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getBorderOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getFontIndex());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getCellOptions());
//    Assert.assertEquals((short) 1032, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getFormatIndex());
//    Assert.assertEquals(1032, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(57));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(57)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(58));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(58)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(59));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(59)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(60));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(60)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(61));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(61)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(62));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(62)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(63));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(64));
//    Assert.assertEquals(0, ((BoundSheetRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(64)).getPositionOfBof());
//    Assert.assertEquals("Sheet1", ((BoundSheetRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(64)).getSheetname());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(65));
//    Assert.assertEquals((short) 1, ((CountryRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(65)).getDefaultCountry());
//    Assert.assertEquals((short) 1, ((CountryRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(65)).getCurrentCountry());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(66));
//    Assert.assertEquals((short) 1, ((SupBookRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(66)).getNumberOfSheets());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(67));
//    Assert.assertEquals(Reflector.getInstanceField(((HSSFWorkbook) arg0).getWorkbook(), "sst"), ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(68));
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(69));
//    Assert.assertArrayEquals(new ExtSSTRecord.InfoSubRecord[]{ }, ((ExtSSTRecord) ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(69)).getInfoSubRecords());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(70));
//    Assert.assertEquals(15, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getBackuppos());
//    Assert.assertEquals(0, ((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getSupbookpos());
//    Assert.assertEquals(5, ((HSSFWorkbook) arg0).getWorkbook().getNumberOfFontRecords());
//    final ArrayList<HyperlinkRecord> arrayList = new ArrayList<HyperlinkRecord>();
//    Assert.assertEquals(arrayList, ((HSSFWorkbook) arg0).getWorkbook().getHyperlinks());
//    Assert.assertFalse(((HSSFWorkbook) arg0).getWorkbook().isUsing1904DateWindowing());
//    Assert.assertNotNull(((HSSFWorkbook) arg0).getWorkbook().getFormats());
//    Assert.assertEquals(8, ((HSSFWorkbook) arg0).getWorkbook().getFormats().size());
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(26), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(0));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(27), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(1));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(28), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(2));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(29), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(3));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(30), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(4));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(31), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(5));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(32), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(6));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(33), ((HSSFWorkbook) arg0).getWorkbook().getFormats().get(7));
//    Assert.assertEquals(((HSSFWorkbook) arg0).getWorkbook().getWorkbookRecordList().getRecords().get(14), ((HSSFWorkbook) arg0).getWorkbook().getWindowOne());
//    final ArrayList<HSSFSheet> arrayList1 = new ArrayList<HSSFSheet>();
//    Assert.assertEquals(arrayList1, Reflector.getInstanceField(arg0, "_sheets"));
//    Assert.assertEquals(MissingCellPolicy.RETURN_NULL_AND_BLANK, ((HSSFWorkbook) arg0).getMissingCellPolicy());
//    Assert.assertNull(((HSSFWorkbook) arg0).getDirectory());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setContentCellStyleInputNullNotNullPositiveOutputVoid999ec0841d5a537c417() {

    // Arrange
    final WriteCellStyle writeCellStyle = new WriteCellStyle();
    final WriteCellStyle writeCellStyle1 = new WriteCellStyle();
    final HorizontalCellStyleStrategy thisObj = new HorizontalCellStyleStrategy(writeCellStyle, writeCellStyle1);
    final Cell arg0 = null;
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head arg1 = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final int arg2 = 1;

    // Act
    thisObj.setContentCellStyle(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadCellStyleInputNullNotNullPositiveOutputVoid99933e5843d13d52889() {

    // Arrange
    final WriteCellStyle writeCellStyle = new WriteCellStyle();
    final WriteCellStyle writeCellStyle1 = new WriteCellStyle();
    final HorizontalCellStyleStrategy thisObj = new HorizontalCellStyleStrategy(writeCellStyle, writeCellStyle1);
    final Cell arg0 = null;
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head arg1 = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final int arg2 = 1;

    // Act
    thisObj.setHeadCellStyle(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }
}
