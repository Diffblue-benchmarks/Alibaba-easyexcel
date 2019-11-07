package com.alibaba.excel.converters.file;

import com.alibaba.excel.converters.file.FileImageConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileImageConverter_FileImageConverterTest_1_Test {
  @Test
  public void FileImageConverterTest() throws Exception {
    // Arrange and Act
    FileImageConverter fileImageConverter = new FileImageConverter();

    // Assert
    Assert.assertNotNull(fileImageConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
