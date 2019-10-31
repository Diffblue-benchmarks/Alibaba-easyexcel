package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;



public class WriteTableHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNullNotNullOutputNotNull999a4341d83b75ebf79() {
//
//    // Arrange
//    final WriteTable arg0 = new WriteTable();
//    final WriteSheetHolder arg1 = null;
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteWorkbookHolder arg2 = new WriteWorkbookHolder(writeWorkbook);
//
//    // Act, creating object to test constructor
//    final WriteTableHolder actual = new WriteTableHolder(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getTableNo());
//    Assert.assertNull(actual.getParentWriteSheetHolder());
//    Assert.assertNotNull(actual.getWriteTable());
//    Assert.assertNull(actual.getWriteTable().getTableNo());
//    Assert.assertNull(actual.getWriteTable().getTableStyle());
//    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
//    Assert.assertEquals(arrayList, actual.getWriteTable().getCustomWriteHandlerList());
//    Assert.assertNull(actual.getWriteTable().getNeedHead());
//    Assert.assertNull(actual.getWriteTable().getRelativeHeadRowIndex());
//    Assert.assertNull(actual.getWriteTable().getClazz());
//    Assert.assertNull(actual.getWriteTable().getAutoTrim());
//    Assert.assertNull(actual.getWriteTable().getCustomConverterList());
//    Assert.assertNull(actual.getWriteTable().getHead());
//    Assert.assertNull(actual.getWriteTable().getUse1904windowing());
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
//    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
//    Assert.assertEquals(hashMap, actual.getExcelWriteHeadProperty().getIgnoreMap());
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
  public void getParentWriteSheetHolderOutputVoid9996eacb1fb8587b293() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);

    // Act
    final WriteSheetHolder actual = thisObj.getParentWriteSheetHolder();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableNoOutputVoid9997a9d6ba92f7958c8() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);

    // Act
    final Integer actual = thisObj.getTableNo();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriteTableOutputNotNull999e0401e496ece4e8f() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);

    // Act
    final WriteTable actual = thisObj.getWriteTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableNo());
    Assert.assertNull(actual.getTableStyle());
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
  public void holderTypeOutputTable999bde375967b2ff2e0() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);

    // Act
    final HolderEnum actual = thisObj.holderType();

    // Assert result
    Assert.assertEquals(HolderEnum.TABLE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setParentWriteSheetHolderInputNullOutputVoid9998f5564ed267c7ac7() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);
    final WriteSheetHolder arg0 = null;

    // Act
    thisObj.setParentWriteSheetHolder(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableNoInputNotNullOutputVoid99905e1f49e96ccba89() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setTableNo(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableNo());

  }

  // Test written by Diffblue Cover
  @Test
  public void setWriteTableInputNotNullOutputVoid9997e700264518994a2() {

    // Arrange
    final WriteTable writeTable = new WriteTable();
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);
    final WriteTableHolder thisObj = new WriteTableHolder(writeTable, null, writeWorkbookHolder);
    final WriteTable arg0 = new WriteTable();

    // Act
    thisObj.setWriteTable(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
