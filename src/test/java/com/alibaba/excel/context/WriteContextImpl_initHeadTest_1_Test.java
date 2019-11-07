package com.alibaba.excel.context;

import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.property.ExcelWriteHeadProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteContextImpl_initHeadTest_1_Test {
  @Test
  public void initHeadTest() throws Exception {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
    ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("Can not close IO");
    arrayList.add(arrayList1);
    ExcelWriteHeadProperty excelWriteHeadProperty = new ExcelWriteHeadProperty(null, arrayList, new Boolean(true));

    // Act
    writeContextImpl.initHead(excelWriteHeadProperty);

    // Assert
    HeadKindEnum headKind = excelWriteHeadProperty.getHeadKind();
    RowHeightProperty headRowHeightProperty = excelWriteHeadProperty.getHeadRowHeightProperty();
    Map<Integer, Head> headMap = excelWriteHeadProperty.getHeadMap();
    Map<Integer, ExcelContentProperty> contentPropertyMap = excelWriteHeadProperty.getContentPropertyMap();
    String toStringResult = excelWriteHeadProperty.toString();
    Class headClazz = excelWriteHeadProperty.getHeadClazz();
    boolean hasHeadResult = excelWriteHeadProperty.hasHead();
    RowHeightProperty contentRowHeightProperty = excelWriteHeadProperty.getContentRowHeightProperty();
    int headRowNumber = excelWriteHeadProperty.getHeadRowNumber();
    Map<String, Field> ignoreMap = excelWriteHeadProperty.getIgnoreMap();
    Assert.assertEquals(HeadKindEnum.STRING, headKind);
    Assert.assertTrue(ignoreMap instanceof java.util.HashMap);
    Assert.assertEquals(1, headRowNumber);
    Assert.assertEquals(0, ignoreMap.size());
    Assert.assertEquals(null, contentRowHeightProperty);
    Assert.assertTrue(hasHeadResult);
    Assert.assertEquals(null, headClazz);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(contentPropertyMap instanceof java.util.TreeMap);
    Assert.assertTrue(headMap instanceof java.util.TreeMap);
    Assert.assertEquals(1, contentPropertyMap.size());
    Assert.assertTrue(contentPropertyMap.containsKey(Integer.valueOf(0)));
    Assert.assertEquals(1, headMap.size());
    Assert.assertTrue(headMap.containsKey(Integer.valueOf(0)));
    Assert.assertEquals(null, headRowHeightProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
