package com.alibaba.excel.write.metadata;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteBasicParameter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteBasicParameter_setRelativeHeadRowIndexTest_7_Test {
  @Test
  public void setRelativeHeadRowIndexTest() throws Exception {
    // Arrange
    WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
    Integer relativeHeadRowIndex = new Integer(1);

    // Act
    writeBasicParameter.setRelativeHeadRowIndex(relativeHeadRowIndex);

    // Assert
    Class clazz = writeBasicParameter.getClazz();
    List<List<String>> head = writeBasicParameter.getHead();
    Boolean autoTrim = writeBasicParameter.getAutoTrim();
    List<WriteHandler> customWriteHandlerList = writeBasicParameter.getCustomWriteHandlerList();
    String toStringResult = writeBasicParameter.toString();
    Boolean needHead = writeBasicParameter.getNeedHead();
    Integer relativeHeadRowIndex1 = writeBasicParameter.getRelativeHeadRowIndex();
    Boolean use1904windowing = writeBasicParameter.getUse1904windowing();
    Assert.assertEquals(null, clazz);
    Assert.assertEquals(null, writeBasicParameter.getCustomConverterList());
    Assert.assertEquals(null, use1904windowing);
    Assert.assertEquals(Integer.valueOf(1), relativeHeadRowIndex1);
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
