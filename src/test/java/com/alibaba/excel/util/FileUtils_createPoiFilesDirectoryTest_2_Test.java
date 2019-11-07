package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileUtils_createPoiFilesDirectoryTest_2_Test {
  @Test
  public void createPoiFilesDirectoryTest() throws Exception {
    // Arrange and Act
    FileUtils.createPoiFilesDirectory();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
