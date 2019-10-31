package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
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
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class WriteWorkbookHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9999af47f60e828d81b() {
//
//    // Arrange
//    final WriteWorkbook arg0 = new WriteWorkbook();
//
//    // Act, creating object to test constructor
//    final WriteWorkbookHolder actual = new WriteWorkbookHolder(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getMandatoryUseInputStream());
//    final HashMap<Integer, WriteSheetHolder> hashMap = new HashMap<Integer, WriteSheetHolder>();
//    Assert.assertEquals(hashMap, actual.getHasBeenInitializedSheet());
//    Assert.assertNotNull(actual.getAutoCloseStream());
//    Assert.assertEquals(ExcelTypeEnum.XLSX, actual.getExcelType());
//    Assert.assertNull(actual.getOutputStream());
//    Assert.assertNull(actual.getTemplateFile());
//    Assert.assertNull(actual.getFile());
//    final HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
//    Assert.assertEquals(hashMap1, actual.getTemplateLastRowMap());
//    Assert.assertNull(actual.getWorkbook());
//    Assert.assertNull(actual.getTemplateInputStream());
//    Assert.assertNotNull(actual.getWriteWorkbook());
//    Assert.assertNull(actual.getWriteWorkbook().getOutputStream());
//    Assert.assertNull(actual.getWriteWorkbook().getFile());
//    Assert.assertNull(actual.getWriteWorkbook().getExcelType());
//    Assert.assertNull(actual.getWriteWorkbook().getTemplateFile());
//    Assert.assertNull(actual.getWriteWorkbook().getMandatoryUseInputStream());
//    Assert.assertNull(actual.getWriteWorkbook().getConvertAllFiled());
//    Assert.assertNull(actual.getWriteWorkbook().getAutoCloseStream());
//    Assert.assertNull(actual.getWriteWorkbook().getTemplateInputStream());
//    Assert.assertNull(actual.getWriteWorkbook().getWriteHandler());
//    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
//    Assert.assertEquals(arrayList, actual.getWriteWorkbook().getCustomWriteHandlerList());
//    Assert.assertNull(actual.getWriteWorkbook().getNeedHead());
//    Assert.assertNull(actual.getWriteWorkbook().getRelativeHeadRowIndex());
//    Assert.assertNull(actual.getWriteWorkbook().getClazz());
//    Assert.assertNull(actual.getWriteWorkbook().getAutoTrim());
//    Assert.assertNull(actual.getWriteWorkbook().getCustomConverterList());
//    Assert.assertNull(actual.getWriteWorkbook().getHead());
//    Assert.assertNull(actual.getWriteWorkbook().getUse1904windowing());
//    Assert.assertNotNull(actual.getNeedHead());
//    Assert.assertNotNull(actual.getRelativeHeadRowIndex());
//    Assert.assertNotNull(actual.getExcelWriteHeadProperty());
//    Assert.assertNull(actual.getExcelWriteHeadProperty().getContentRowHeightProperty());
//    Assert.assertNull(actual.getExcelWriteHeadProperty().getHeadRowHeightProperty());
//    Assert.assertNull(actual.getExcelWriteHeadProperty().getHeadClazz());
//    final TreeMap<Integer, ExcelContentProperty> treeMap = new TreeMap<Integer, ExcelContentProperty>();
//    Assert.assertEquals(treeMap, actual.getExcelWriteHeadProperty().getContentPropertyMap());
//    Assert.assertEquals(HeadKindEnum.NONE, actual.getExcelWriteHeadProperty().getHeadKind());
//    final TreeMap<Integer, Head> treeMap1 = new TreeMap<Integer, Head>();
//    Assert.assertEquals(treeMap1, actual.getExcelWriteHeadProperty().getHeadMap());
//    final HashMap<String, Field> hashMap2 = new HashMap<String, Field>();
//    Assert.assertEquals(hashMap2, actual.getExcelWriteHeadProperty().getIgnoreMap());
//    Assert.assertEquals(0, actual.getExcelWriteHeadProperty().getHeadRowNumber());
//    Assert.assertNotNull(actual.getWriteHandlerMap());
//    Assert.assertEquals(5, actual.getWriteHandlerMap().size());
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, actual.getWriteHandlerMap().get(null).size());
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null).get(0));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getWriteHandlerMap().get(null).get(0), "hasInitialized"));
//    final ArrayList arrayList1 = new ArrayList();
//    Assert.assertEquals(arrayList1, actual.getWriteHandlerMap().get(null));
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, actual.getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(actual.getWriteHandlerMap().get(null).get(0), actual.getWriteHandlerMap().get(null).get(0));
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, actual.getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(actual.getWriteHandlerMap().get(null).get(0), actual.getWriteHandlerMap().get(null).get(0));
//    final ArrayList arrayList2 = new ArrayList();
//    Assert.assertEquals(arrayList2, actual.getWriteHandlerMap().get(null));
//    Assert.assertNotNull(actual.getConverterMap());
//    Assert.assertEquals(14, actual.getConverterMap().size());
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Float"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Double"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.util.Date"));
//    Assert.assertNotNull(actual.getConverterMap().get("[B"));
//    Assert.assertNotNull(actual.getConverterMap().get("[Ljava.lang.Byte;"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Integer"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.io.File"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.math.BigDecimal"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Long"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Short"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Boolean"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.String"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.lang.Byte"));
//    Assert.assertNotNull(actual.getConverterMap().get("java.io.InputStream"));
//    Assert.assertNull(actual.getClazz());
//    Assert.assertNotNull(actual.getGlobalConfiguration());
//    Assert.assertNotNull(actual.getGlobalConfiguration().getAutoTrim());
//    Assert.assertNotNull(actual.getGlobalConfiguration().getUse1904windowing());
//    Assert.assertNull(actual.getHead());
//    Assert.assertNotNull(actual.getNewInitialization());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoCloseStreamOutputNotNull99955d15cd538627862() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final Boolean actual = thisObj.getAutoCloseStream();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getExcelTypeOutputXlsx99919b96e8e348ba0c3() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final ExcelTypeEnum actual = thisObj.getExcelType();

    // Assert result
    Assert.assertEquals(ExcelTypeEnum.XLSX, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileOutputVoid9990636bab37d417be6() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final File actual = thisObj.getFile();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHasBeenInitializedSheetOutput0999a07036486457fee9() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final Map<Integer, WriteSheetHolder> actual = thisObj.getHasBeenInitializedSheet();

    // Assert result
    final HashMap<Integer, WriteSheetHolder> hashMap = new HashMap<Integer, WriteSheetHolder>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMandatoryUseInputStreamOutputNotNull9992de8819aebc5fe1c() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final Boolean actual = thisObj.getMandatoryUseInputStream();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputStreamOutputVoid9994850de2af57b441f() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final OutputStream actual = thisObj.getOutputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTemplateFileOutputVoid99959eb872bad34dc4a() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final File actual = thisObj.getTemplateFile();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTemplateInputStreamOutputVoid99908fdcc0ff1beb308() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final InputStream actual = thisObj.getTemplateInputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTemplateLastRowMapOutput09993eeb85cdceb460f7() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final Map<Integer, Integer> actual = thisObj.getTemplateLastRowMap();

    // Assert result
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWorkbookOutputVoid999a06cd6d6f641d838() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final Workbook actual = thisObj.getWorkbook();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriteWorkbookOutputNotNull999edff68a0e531e7d5() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final WriteWorkbook actual = thisObj.getWriteWorkbook();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOutputStream());
    Assert.assertNull(actual.getFile());
    Assert.assertNull(actual.getExcelType());
    Assert.assertNull(actual.getTemplateFile());
    Assert.assertNull(actual.getMandatoryUseInputStream());
    Assert.assertNull(actual.getConvertAllFiled());
    Assert.assertNull(actual.getAutoCloseStream());
    Assert.assertNull(actual.getTemplateInputStream());
    Assert.assertNull(actual.getWriteHandler());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, actual.getCustomWriteHandlerList());
    Assert.assertNull(actual.getNeedHead());
    Assert.assertNull(actual.getRelativeHeadRowIndex());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void holderTypeOutputWorkbook9992857c8cdf71ca81a() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);

    // Act
    final HolderEnum actual = thisObj.holderType();

    // Assert result
    Assert.assertEquals(HolderEnum.WORKBOOK, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoCloseStreamInputNotNullOutputVoid999d532cb067cc0731f() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoCloseStream(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setExcelTypeInputXlsOutputVoid99937c856c3e791a890() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    thisObj.setExcelType(arg0);

    // Assert side effects
    Assert.assertEquals(ExcelTypeEnum.XLS, thisObj.getExcelType());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileInputNotNullOutputVoid99933eec108f0d8206c() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final File arg0 = new File("Can not found file.");

    // Act
    thisObj.setFile(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFile());
    Assert.assertEquals("Can not found file.", thisObj.getFile().getPath());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setHasBeenInitializedSheetInputNotNullOutputVoid999cf9275c6a19a86f1() throws InvocationTargetException {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
//    final HashMap<Integer, WriteSheetHolder> arg0 = new HashMap<Integer, WriteSheetHolder>();
//    final Integer integer = new Integer(8);
//    arg0.put(integer, null);
//
//    // Act
//    thisObj.setHasBeenInitializedSheet(arg0);
//
//    // Assert side effects
//    final HashMap<Integer, WriteSheetHolder> hashMap = new HashMap<Integer, WriteSheetHolder>();
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer1, null);
//    Assert.assertEquals(hashMap, thisObj.getHasBeenInitializedSheet());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setMandatoryUseInputStreamInputNotNullOutputVoid99945a5c705e3fd3987() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setMandatoryUseInputStream(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setOutputStreamInputNotNullOutputVoid999b9e525869dcc255f() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    thisObj.setOutputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getOutputStream());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(thisObj.getOutputStream(), "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) thisObj.getOutputStream()).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTemplateFileInputNotNullOutputVoid999208863e00ab1cc2d() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final File arg0 = new File("Can not found file.");

    // Act
    thisObj.setTemplateFile(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTemplateFile());
    Assert.assertEquals("Can not found file.", thisObj.getTemplateFile().getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTemplateInputStreamInputNotNullOutputVoid999f46a16bc6c791018() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    thisObj.setTemplateInputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTemplateInputStream());
    Assert.assertEquals(24, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(thisObj.getTemplateInputStream(), "buf")));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "pos"));

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setTemplateLastRowMapInputNotNullOutputVoid999ea488c6717788a99() throws InvocationTargetException {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
//    final HashMap<Integer, Integer> arg0 = new HashMap<Integer, Integer>();
//    final Integer integer = new Integer(8);
//    final Integer integer1 = new Integer(8);
//    arg0.put(integer, integer1);
//
//    // Act
//    thisObj.setTemplateLastRowMap(arg0);
//
//    // Assert side effects
//    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//    final Integer integer2 = (Integer) Reflector.getInstance("java.lang.Integer");
//    final Integer integer3 = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer3, integer2);
//    Assert.assertEquals(hashMap, thisObj.getTemplateLastRowMap());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void setWorkbookInputNotNullOutputVoid9992b566f9cb94b396b() {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
//    final HSSFWorkbook arg0 = new HSSFWorkbook();
//
//    // Act
//    thisObj.setWorkbook(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getWorkbook());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getUDFFinder());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook());
//    Assert.assertNotNull(Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst"), "bucketRelativeOffsets"));
//    Assert.assertEquals(0, ((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst")).getNumUniqueStrings());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst"), "bucketAbsoluteOffsets"));
//    Assert.assertNotNull(((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst")).getDeserializer());
//    Assert.assertEquals(0, ((SSTRecord) Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst")).getNumStrings());
//    Assert.assertNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getDrawingManager());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList());
//    Assert.assertEquals(-1, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getPalettepos());
//    Assert.assertEquals(0, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getNamepos());
//    Assert.assertEquals(10, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getProtpos());
//    Assert.assertEquals(24, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getFontpos());
//    Assert.assertEquals(7, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getTabpos());
//    Assert.assertEquals(53, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getXfpos());
//    Assert.assertEquals(61, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getBspos());
//    Assert.assertEquals(0, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getExternsheetPos());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords());
//    Assert.assertEquals(68, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().size());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0));
//    Assert.assertEquals(5, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getType());
//    Assert.assertEquals(1536, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getVersion());
//    Assert.assertEquals(65, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getHistoryBitMask());
//    Assert.assertEquals(4307, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getBuild());
//    Assert.assertEquals(1996, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getBuildYear());
//    Assert.assertEquals(6, ((BOFRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(0)).getRequiredVersion());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(1));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(2));
//    Assert.assertEquals((short) 0, ((MMSRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(2)).getAddMenuCount());
//    Assert.assertEquals((short) 0, ((MMSRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(2)).getDelMenuCount());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(3));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(4));
//    Assert.assertEquals("thomas.perkins", ((WriteAccessRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(4)).getUsername());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(5));
//    Assert.assertEquals((short) 1200, ((CodepageRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(5)).getCodepage());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(6));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(7));
//    Assert.assertArrayEquals(new short[]{ }, ((TabIdRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(7))._tabids);
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(8));
//    Assert.assertEquals((short) 14, ((FnGroupCountRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(8)).getCount());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(9));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(10));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(11));
//    Assert.assertEquals(0, ((PasswordRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(11)).getPassword());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(12));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(13));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14));
//    Assert.assertEquals((short) 56, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getOptions());
//    Assert.assertEquals((short) 360, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getHorizontalHold());
//    Assert.assertEquals(0, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getActiveSheetIndex());
//    Assert.assertEquals((short) 9150, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getHeight());
//    Assert.assertEquals(0, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getFirstVisibleTab());
//    Assert.assertEquals((short) 1, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getNumSelectedTabs());
//    Assert.assertEquals((short) 14940, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getWidth());
//    Assert.assertEquals((short) 270, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getVerticalHold());
//    Assert.assertEquals((short) 600, ((WindowOneRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14)).getTabWidthRatio());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(15));
//    Assert.assertEquals((short) 0, ((BackupRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(15)).getBackup());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(16));
//    Assert.assertEquals((short) 0, ((HideObjRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(16)).getHideObj());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(17));
//    Assert.assertEquals((short) 0, ((DateWindow1904Record) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(17)).getWindowing());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(18));
//    Assert.assertEquals((short) 1, ((PrecisionRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(18)).field_1_precision);
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(19));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(20));
//    Assert.assertEquals((short) 0, ((BookBoolRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(20)).getSaveLinkValues());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(21)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(22)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(23)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24));
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getSuperSubScript());
//    Assert.assertEquals((short) 32767, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getColorPaletteIndex());
//    Assert.assertEquals("Arial", ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFontName());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFamily());
//    Assert.assertEquals((short) 200, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getFontHeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getUnderline());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getCharset());
//    Assert.assertEquals((short) 400, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getBoldWeight());
//    Assert.assertEquals((short) 0, ((FontRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(24)).getAttributes());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(25));
//    Assert.assertEquals(5, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0_);(\"$\"#,##0)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(25)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(26));
//    Assert.assertEquals(6, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(26)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0_);[Red](\"$\"#,##0)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(26)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(27));
//    Assert.assertEquals(7, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(27)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0.00_);(\"$\"#,##0.00)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(27)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(28));
//    Assert.assertEquals(8, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(28)).getIndexCode());
//    Assert.assertEquals("\"$\"#,##0.00_);[Red](\"$\"#,##0.00)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(28)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(29));
//    Assert.assertEquals(42, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(29)).getIndexCode());
//    Assert.assertEquals("_(\"$\"* #,##0_);_(\"$\"* (#,##0);_(\"$\"* \"-\"_);_(@_)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(29)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(30));
//    Assert.assertEquals(41, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(30)).getIndexCode());
//    Assert.assertEquals("_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(30)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(31));
//    Assert.assertEquals(44, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(31)).getIndexCode());
//    Assert.assertEquals("_(\"$\"* #,##0.00_);_(\"$\"* (#,##0.00);_(\"$\"* \"-\"??_);_(@_)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(31)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(32));
//    Assert.assertEquals(43, ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(32)).getIndexCode());
//    Assert.assertEquals("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)", ((FormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(32)).getFormatString());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getBorderOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(33)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(34)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(35)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getIndentionOptions());
//    Assert.assertEquals((short) 2, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(36)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getIndentionOptions());
//    Assert.assertEquals((short) 2, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(37)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(38)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(39)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(40)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(41)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(42)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(43)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(44)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(45)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(46)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getBorderOptions());
//    Assert.assertEquals((short) -3072, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(47)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getBorderOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getIndentionOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFontIndex());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getPaletteOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(48)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getPaletteOptions());
//    Assert.assertEquals((short) 43, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(49)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getPaletteOptions());
//    Assert.assertEquals((short) 41, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(50)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getPaletteOptions());
//    Assert.assertEquals((short) 44, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(51)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getPaletteOptions());
//    Assert.assertEquals((short) 42, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(52)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53));
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getBorderOptions());
//    Assert.assertEquals((short) -2048, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getIndentionOptions());
//    Assert.assertEquals((short) 1, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFontIndex());
//    Assert.assertEquals((short) -11, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getCellOptions());
//    Assert.assertEquals((short) 0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getPaletteOptions());
//    Assert.assertEquals((short) 9, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFormatIndex());
//    Assert.assertEquals(0, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getAdtlPaletteOptions());
//    Assert.assertEquals((short) 32, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getAlignmentOptions());
//    Assert.assertEquals((short) 8384, ((ExtendedFormatRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(53)).getFillPaletteOptions());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(54));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(54)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(55));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(55)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(56));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(56)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(57));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(57)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(58));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(58)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(59));
//    Assert.assertNull(((StyleRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(59)).getName());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(60));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(61));
//    Assert.assertEquals(0, ((BoundSheetRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(61)).getPositionOfBof());
//    Assert.assertEquals("Sheet1", ((BoundSheetRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(61)).getSheetname());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(62));
//    Assert.assertEquals((short) 1, ((CountryRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(62)).getDefaultCountry());
//    Assert.assertEquals((short) 1, ((CountryRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(62)).getCurrentCountry());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(63));
//    Assert.assertEquals((short) 1, ((SupBookRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(63)).getNumberOfSheets());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(64));
//    Assert.assertEquals(Reflector.getInstanceField(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook(), "sst"), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(65));
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(66));
//    Assert.assertArrayEquals(new ExtSSTRecord.InfoSubRecord[]{ }, ((ExtSSTRecord) ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(66)).getInfoSubRecords());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(67));
//    Assert.assertEquals(15, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getBackuppos());
//    Assert.assertEquals(0, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getSupbookpos());
//    Assert.assertEquals(4, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getNumberOfFontRecords());
//    final ArrayList<HyperlinkRecord> arrayList = new ArrayList<HyperlinkRecord>();
//    Assert.assertEquals(arrayList, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getHyperlinks());
//    Assert.assertFalse(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().isUsing1904DateWindowing());
//    Assert.assertNotNull(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats());
//    Assert.assertEquals(8, ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().size());
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(25), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(0));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(26), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(1));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(27), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(2));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(28), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(3));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(29), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(4));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(30), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(5));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(31), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(6));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(32), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getFormats().get(7));
//    Assert.assertEquals(((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWorkbookRecordList().getRecords().get(14), ((HSSFWorkbook) thisObj.getWorkbook()).getWorkbook().getWindowOne());
//    final ArrayList<HSSFSheet> arrayList1 = new ArrayList<HSSFSheet>();
//    Assert.assertEquals(arrayList1, Reflector.getInstanceField(thisObj.getWorkbook(), "_sheets"));
//    Assert.assertEquals(MissingCellPolicy.RETURN_NULL_AND_BLANK, ((HSSFWorkbook) thisObj.getWorkbook()).getMissingCellPolicy());
//    Assert.assertNull(((HSSFWorkbook) thisObj.getWorkbook()).getDirectory());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setWriteWorkbookInputNotNullOutputVoid99976813d93508bf7e1() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder thisObj = new WriteWorkbookHolder(writeWorkbook);
    final WriteWorkbook arg0 = new WriteWorkbook();

    // Act
    thisObj.setWriteWorkbook(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
