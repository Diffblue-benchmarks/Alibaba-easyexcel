package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FileUtils_readFileToByteArrayTest_6_Test {
//failed_pass   @Test
//  public void readFileToByteArrayTest() throws Exception {
//    // Arrange
//    File file = new File("' cannot be read");
//
//    // Act and Assert
//    thrown.expect(FileNotFoundException.class);
//    FileUtils.readFileToByteArray(file);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
