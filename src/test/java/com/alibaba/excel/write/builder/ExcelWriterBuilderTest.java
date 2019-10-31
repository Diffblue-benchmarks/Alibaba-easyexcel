package com.alibaba.excel.write.builder;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ExcelWriterBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void autoCloseStreamInputNotNullOutputNotNull999718ee40a41ad25b7() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelWriterBuilder actual = thisObj.autoCloseStream(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void buildOutputNotNull9990e33875d07d49eaa() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();

    // Act
    final ExcelWriter actual = thisObj.build();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a2ec359186e717ca() {

    // Act, creating object to test constructor
    final ExcelWriterBuilder actual = new ExcelWriterBuilder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertAllFiledInputNotNullOutputNotNull9996e0b96cb48cc4149() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelWriterBuilder actual = thisObj.convertAllFiled(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void excelTypeInputXlsOutputNotNull999509e53b0ea058986() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    final ExcelWriterBuilder actual = thisObj.excelType(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull9998c7195b0976fb573() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final File arg0 = new File("aaaaa");

    // Act
    final ExcelWriterBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull9998d6e49af173142e6() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    final ExcelWriterBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull99993b5a97f7aeb74ab() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final String arg0 = "aaaaa";

    // Act
    final ExcelWriterBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNullOutputNotNull999da036ed3ee853b67() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Class arg0 = null;

    // Act
    final ExcelWriterBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNotNullOutputNotNull999542956eb182f37f9() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg0.add(arrayList);

    // Act
    final ExcelWriterBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void needHeadInputNotNullOutputNotNull999063b5898170720e7() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelWriterBuilder actual = thisObj.needHead(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerConverterInputNotNullOutputNotNull9998621b472df385c6b() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    final ExcelWriterBuilder actual = thisObj.registerConverter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerWriteHandlerInputNullOutputNotNull999d6a64a19510d84a5() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final WriteHandler arg0 = null;

    // Act
    final ExcelWriterBuilder actual = thisObj.registerWriteHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerWriteHandlerInputNotNullOutputNotNull9996fdc8d2adaed5837() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final LoopMergeStrategy arg0 = new LoopMergeStrategy(1, 1);

    // Act
    final ExcelWriterBuilder actual = thisObj.registerWriteHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void relativeHeadRowIndexInputNotNullOutputNotNull999fe691c874c3f358a() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterBuilder actual = thisObj.relativeHeadRowIndex(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetOutputNotNull99943ad46b2b0274f5e() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullNotNullOutputNotNull999bec0e67e467ee8e8() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Integer arg0 = new Integer(1);
    final String arg1 = "aaaaa";

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheet(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullOutputNotNull99970906b321a76ea45() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullOutputNotNull999191ef8ddd74e680e() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final String arg0 = "aaaaa";

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void withTemplateInputNotNullOutputNotNull9993ac72feed30c1ffa() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final File arg0 = new File("aaaaa");

    // Act
    final ExcelWriterBuilder actual = thisObj.withTemplate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void withTemplateInputNotNullOutputNotNull99935635ec90293bee0() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final ExcelWriterBuilder actual = thisObj.withTemplate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void withTemplateInputNotNullOutputNotNull9996bd5e0714fa0b30d() {

    // Arrange
    final ExcelWriterBuilder thisObj = new ExcelWriterBuilder();
    final String arg0 = "aaaaa";

    // Act
    final ExcelWriterBuilder actual = thisObj.withTemplate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
