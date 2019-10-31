package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteHolder;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import com.diffblue.deeptestutils.Reflector;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.ZipPackage;
import org.apache.poi.openxml4j.opc.internal.ContentType;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePart;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;



public class WriteContextImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9992b3fd2de8f01e010() {

    // Arrange
    final WriteWorkbook arg0 = new WriteWorkbook();

    // Act, creating object to test constructor
    final WriteContextImpl actual = new WriteContextImpl(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void currentSheetInputNotNullOutputVoid99995e4ccfc368fba03() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
    final WriteSheet arg0 = new WriteSheet();

    // Act
    thisObj.currentSheet(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, arg0.getColumnWidthMap());
    Assert.assertNotNull(arg0.getSheetNo());
    Assert.assertNull(arg0.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, arg0.getCustomWriteHandlerList());
    Assert.assertNull(arg0.getNeedHead());
    Assert.assertNull(arg0.getRelativeHeadRowIndex());
    Assert.assertNull(arg0.getClazz());
    Assert.assertNull(arg0.getAutoTrim());
    Assert.assertNull(arg0.getCustomConverterList());
    Assert.assertNull(arg0.getHead());
    Assert.assertNull(arg0.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void currentTableInputNotNullOutputNullPointerException9990dabe0454876abf3() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
    final WriteTable arg0 = new WriteTable();
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.currentTable(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertNotNull(arg0);
      Assert.assertNotNull(arg0.getTableNo());
      Assert.assertNull(arg0.getTableStyle());
      final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
      Assert.assertEquals(arrayList, arg0.getCustomWriteHandlerList());
      Assert.assertNull(arg0.getNeedHead());
      Assert.assertNull(arg0.getRelativeHeadRowIndex());
      Assert.assertNull(arg0.getClazz());
      Assert.assertNull(arg0.getAutoTrim());
      Assert.assertNull(arg0.getCustomConverterList());
      Assert.assertNull(arg0.getHead());
      Assert.assertNull(arg0.getUse1904windowing());
      throw ex;
    }

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void currentWriteHolderOutputNotNull99938bab790daf906d7() throws InvocationTargetException {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
//
//    // Act
//    final WriteHolder actual = thisObj.currentWriteHolder();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getMandatoryUseInputStream());
//    final HashMap<Integer, WriteSheetHolder> hashMap = new HashMap<Integer, WriteSheetHolder>();
//    Assert.assertEquals(hashMap, ((WriteWorkbookHolder) actual).getHasBeenInitializedSheet());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getAutoCloseStream());
//    Assert.assertEquals(ExcelTypeEnum.XLSX, ((WriteWorkbookHolder) actual).getExcelType());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getOutputStream());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getTemplateFile());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getFile());
//    final HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
//    Assert.assertEquals(hashMap1, ((WriteWorkbookHolder) actual).getTemplateLastRowMap());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWorkbook());
//    Assert.assertEquals(500, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getRandomAccessWindowSize());
//    Assert.assertFalse(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).isCompressTempFiles());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getSharedStringSource());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getCalculationChain());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getMapInfo());
//    Assert.assertEquals(MissingCellPolicy.RETURN_NULL_AND_BLANK, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getMissingCellPolicy());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getExternalLinksTable());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getUDFFinder());
//    final ArrayList<XSSFPivotTable> arrayList = new ArrayList<XSSFPivotTable>();
//    Assert.assertEquals(arrayList, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPivotTables());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource());
//    Assert.assertEquals(0, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getCount());
//    Assert.assertEquals(0, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getUniqueCount());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage());
//    Assert.assertNull(((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getZipArchive());
//    Assert.assertEquals(PackageAccess.READ_WRITE, ((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getPackageAccess());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"), "container"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"));
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"), "buf")));
//    Assert.assertEquals(0, ((ByteArrayOutputStream) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output")).size());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).size());
//    final ContentType contentType = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "propsPart"));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "xmlDoc"));
//    Assert.assertTrue((Boolean) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "isDirty"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "defaultPartMarshaller"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties"));
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty());
//    Assert.assertEquals("Apache POI", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-package.core-properties+xml", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getType());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPackage());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isDeleted());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isRelationshipPart());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().getURI());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partList"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "relationships"));
//    Assert.assertNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "originalPackagePath"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).size());
//    final ContentType contentType1 = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType1, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType1, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).get(contentType1));
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getIndexedColors());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getTheme());
//    Assert.assertEquals(250, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getMaxNumberOfDataFormats());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getStylesSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getCTWorkbook());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackage());
//    Assert.assertNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(0, ((SXSSFWorkbook) ((WriteWorkbookHolder) actual).getWorkbook()).getXSSFWorkbook().getRelationCounter());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getTemplateInputStream());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteWorkbook());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getOutputStream());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getFile());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getExcelType());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getTemplateFile());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getMandatoryUseInputStream());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getConvertAllFiled());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getAutoCloseStream());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getTemplateInputStream());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getWriteHandler());
//    final ArrayList<WriteHandler> arrayList1 = new ArrayList<WriteHandler>();
//    Assert.assertEquals(arrayList1, ((WriteWorkbookHolder) actual).getWriteWorkbook().getCustomWriteHandlerList());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getNeedHead());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getRelativeHeadRowIndex());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getClazz());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getAutoTrim());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getCustomConverterList());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getHead());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getWriteWorkbook().getUse1904windowing());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getNeedHead());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getRelativeHeadRowIndex());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getExcelWriteHeadProperty());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getContentRowHeightProperty());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getHeadRowHeightProperty());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getHeadClazz());
//    final TreeMap<Integer, ExcelContentProperty> treeMap = new TreeMap<Integer, ExcelContentProperty>();
//    Assert.assertEquals(treeMap, ((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getContentPropertyMap());
//    Assert.assertEquals(HeadKindEnum.NONE, ((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getHeadKind());
//    final TreeMap<Integer, Head> treeMap1 = new TreeMap<Integer, Head>();
//    Assert.assertEquals(treeMap1, ((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getHeadMap());
//    final HashMap<String, Field> hashMap2 = new HashMap<String, Field>();
//    Assert.assertEquals(hashMap2, ((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getIgnoreMap());
//    Assert.assertEquals(0, ((WriteWorkbookHolder) actual).getExcelWriteHeadProperty().getHeadRowNumber());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteHandlerMap());
//    Assert.assertEquals(5, ((WriteWorkbookHolder) actual).getWriteHandlerMap().size());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).size());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0));
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0), "hasInitialized"));
//    final ArrayList arrayList2 = new ArrayList();
//    Assert.assertEquals(arrayList2, ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0), ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0), ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null).get(0));
//    final ArrayList arrayList3 = new ArrayList();
//    Assert.assertEquals(arrayList3, ((WriteWorkbookHolder) actual).getWriteHandlerMap().get(null));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap());
//    Assert.assertEquals(14, ((WriteWorkbookHolder) actual).getConverterMap().size());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Float"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Double"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.util.Date"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("[B"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("[Ljava.lang.Byte;"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Integer"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.io.File"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.math.BigDecimal"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Long"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Short"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Boolean"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.String"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.lang.Byte"));
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getConverterMap().get("java.io.InputStream"));
//    Assert.assertNull(((WriteWorkbookHolder) actual).getClazz());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getGlobalConfiguration());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getGlobalConfiguration().getAutoTrim());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getGlobalConfiguration().getUse1904windowing());
//    Assert.assertNull(((WriteWorkbookHolder) actual).getHead());
//    Assert.assertNotNull(((WriteWorkbookHolder) actual).getNewInitialization());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void finishOutputExcelGenerateException999543d2b5032029997() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    thrown.expect(ExcelGenerateException.class);
    thisObj.finish();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurrentSheetOutputNullPointerException9999eba1e6ced16b8cf() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCurrentSheet();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputStreamOutputVoid999c6fb49274910ec61() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    final OutputStream actual = thisObj.getOutputStream();

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getWorkbookOutputNotNull99914a428ee9ab8f82b() throws InvocationTargetException {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
//
//    // Act
//    final Workbook actual = thisObj.getWorkbook();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(500, ((SXSSFWorkbook) actual).getRandomAccessWindowSize());
//    Assert.assertFalse(((SXSSFWorkbook) actual).isCompressTempFiles());
//    Assert.assertNull(((SXSSFWorkbook) actual).getSharedStringSource());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getCalculationChain());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getMapInfo());
//    Assert.assertEquals(MissingCellPolicy.RETURN_NULL_AND_BLANK, ((SXSSFWorkbook) actual).getXSSFWorkbook().getMissingCellPolicy());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getExternalLinksTable());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getUDFFinder());
//    final ArrayList<XSSFPivotTable> arrayList = new ArrayList<XSSFPivotTable>();
//    Assert.assertEquals(arrayList, ((SXSSFWorkbook) actual).getXSSFWorkbook().getPivotTables());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getCount());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getUniqueCount());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage());
//    Assert.assertNull(((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getZipArchive());
//    Assert.assertEquals(PackageAccess.READ_WRITE, ((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getPackageAccess());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"), "container"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"));
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"), "buf")));
//    Assert.assertEquals(0, ((ByteArrayOutputStream) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output")).size());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).size());
//    final ContentType contentType = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "propsPart"));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "xmlDoc"));
//    Assert.assertTrue((Boolean) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "isDirty"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "defaultPartMarshaller"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties"));
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty());
//    Assert.assertEquals("Apache POI", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-package.core-properties+xml", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getType());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPackage());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isDeleted());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isRelationshipPart());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().getURI());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partList"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "relationships"));
//    Assert.assertNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "originalPackagePath"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).size());
//    final ContentType contentType1 = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType1, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType1, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).get(contentType1));
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getIndexedColors());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getTheme());
//    Assert.assertEquals(250, ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getMaxNumberOfDataFormats());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) actual).getXSSFWorkbook().getStylesSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getCTWorkbook());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackage());
//    Assert.assertNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual).getXSSFWorkbook().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual).getXSSFWorkbook().getRelationCounter());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void initHeadInputNotNullOutputVoid999351b82a79cdee740() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("Can not close IO");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelWriteHeadProperty arg0 = new ExcelWriteHeadProperty(null, arrayList, boolean1);

    // Act
    thisObj.initHead(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void needHeadOutputNullPointerException9991faa7d03ffcefb58() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.needHead();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeSheetHolderOutputVoid9993ba958167e647872() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    final WriteSheetHolder actual = thisObj.writeSheetHolder();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeTableHolderOutputVoid99998e468169d3df545() {

    // Arrange
    final WriteWorkbook writeWorkbook = new WriteWorkbook();
    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);

    // Act
    final WriteTableHolder actual = thisObj.writeTableHolder();

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void writeWorkbookHolderOutputNotNull9990edcaa5e6ef9016b() throws InvocationTargetException {
//
//    // Arrange
//    final WriteWorkbook writeWorkbook = new WriteWorkbook();
//    final WriteContextImpl thisObj = new WriteContextImpl(writeWorkbook);
//
//    // Act
//    final WriteWorkbookHolder actual = thisObj.writeWorkbookHolder();
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
//    Assert.assertNotNull(actual.getWorkbook());
//    Assert.assertEquals(500, ((SXSSFWorkbook) actual.getWorkbook()).getRandomAccessWindowSize());
//    Assert.assertFalse(((SXSSFWorkbook) actual.getWorkbook()).isCompressTempFiles());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getSharedStringSource());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getCalculationChain());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getMapInfo());
//    Assert.assertEquals(MissingCellPolicy.RETURN_NULL_AND_BLANK, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getMissingCellPolicy());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getExternalLinksTable());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getUDFFinder());
//    final ArrayList<XSSFPivotTable> arrayList = new ArrayList<XSSFPivotTable>();
//    Assert.assertEquals(arrayList, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPivotTables());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getCount());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getUniqueCount());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage());
//    Assert.assertNull(((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getZipArchive());
//    Assert.assertEquals(PackageAccess.READ_WRITE, ((ZipPackage) ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage()).getPackageAccess());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "contentTypeManager"), "container"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"));
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output"), "buf")));
//    Assert.assertEquals(0, ((ByteArrayOutputStream) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "output")).size());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).size());
//    final ContentType contentType = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "propsPart"));
//    Assert.assertNull(Reflector.getInstanceField(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partMarshallers")).get(contentType), "xmlDoc"));
//    Assert.assertTrue((Boolean) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "isDirty"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "defaultPartMarshaller"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties"));
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getDescriptionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty());
//    Assert.assertEquals("Apache POI", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCreatorProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getKeywordsProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getCategoryProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentStatusProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getIdentifierProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getSubjectProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getVersionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLanguageProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getRevisionProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastModifiedByProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getLastPrintedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getTitleProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getModifiedProperty().getValue());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-package.core-properties+xml", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getContentTypeDetails().getType());
//    Assert.assertNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPackage());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isDeleted());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).isRelationshipPart());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName());
//    Assert.assertFalse(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((PackagePropertiesPart) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "packageProperties")).getPartName().getURI());
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partList"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "relationships"));
//    Assert.assertNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "originalPackagePath"));
//    Assert.assertNotNull(Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers"));
//    Assert.assertEquals(1, ((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).size());
//    final ContentType contentType1 = (ContentType) Reflector.getInstance("org.apache.poi.openxml4j.opc.internal.ContentType");
//    Reflector.setField(contentType1, "subType", "vnd.openxmlformats-package.core-properties+xml");
//    Reflector.setField(contentType1, "type", "application");
//    Assert.assertNotNull(((java.util.Map) Reflector.getInstanceField(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), "partUnmarshallers")).get(contentType1));
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getIndexedColors());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getTheme());
//    Assert.assertEquals(250, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getMaxNumberOfDataFormats());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(1, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getStylesSource().getRelationCounter());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getCTWorkbook());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackage());
//    Assert.assertNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getParent());
//    Assert.assertNotNull(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart());
//    Assert.assertNull(Reflector.getInstanceField(((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart(), "data"));
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails());
//    Assert.assertEquals("vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getSubType());
//    Assert.assertEquals("application", ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getContentTypeDetails().getType());
//    Assert.assertEquals(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getSharedStringSource().getPackagePart()).getPackage(), ((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getPackage());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).isDeleted());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).isRelationshipPart());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName());
//    Assert.assertFalse(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName().isRelationshipPartURI());
//    Assert.assertNotNull(((MemoryPackagePart) ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getPackagePart()).getPartName().getURI());
//    Assert.assertEquals(0, ((SXSSFWorkbook) actual.getWorkbook()).getXSSFWorkbook().getRelationCounter());
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
//    final ArrayList<WriteHandler> arrayList1 = new ArrayList<WriteHandler>();
//    Assert.assertEquals(arrayList1, actual.getWriteWorkbook().getCustomWriteHandlerList());
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
//    final ArrayList arrayList2 = new ArrayList();
//    Assert.assertEquals(arrayList2, actual.getWriteHandlerMap().get(null));
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, actual.getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(actual.getWriteHandlerMap().get(null).get(0), actual.getWriteHandlerMap().get(null).get(0));
//    Assert.assertNotNull(actual.getWriteHandlerMap().get(null));
//    Assert.assertEquals(1, actual.getWriteHandlerMap().get(null).size());
//    Assert.assertEquals(actual.getWriteHandlerMap().get(null).get(0), actual.getWriteHandlerMap().get(null).get(0));
//    final ArrayList arrayList3 = new ArrayList();
//    Assert.assertEquals(arrayList3, actual.getWriteHandlerMap().get(null));
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
}
